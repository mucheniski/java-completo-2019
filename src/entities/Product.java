package entities;

public class Product {
	
	public String name;
	public Double price;
	public Integer quantity;
		
	public Product(String name, Double price, Integer quantity) {		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(Integer quantityAdd) {
		this.quantity += quantityAdd;
	}
	
	public void removeProduct(Integer quantityRemove) {
		this.quantity -= quantityRemove;
	}
	
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}

}
