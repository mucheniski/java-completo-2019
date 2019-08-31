package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product3 {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufacturedDate() {
		return manufactureDate;
	}

	public void setManufacturedDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public final String priceTag() {
		return name + " (used) $ " + String.format("%.2f", price) + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}

}
