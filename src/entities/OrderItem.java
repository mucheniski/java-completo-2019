package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	private Product2 product;
	
	public OrderItem() {}

	public OrderItem(Integer quantity, Double price, Product2 product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public Double subTotal() {
		return price * quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product2 getProduct() {
		return product;
	}

	public void setProduct(Product2 product) {
		this.product = product;
	}
	
	@Override
	public String toString() {		
		return getProduct().getName() + ", $" + String.format("%.2f", price) + ", Quanity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal());	
	}
	
}
