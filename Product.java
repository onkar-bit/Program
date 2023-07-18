
	import java.util.ArrayList;
	import java.util.List;

	class Product {
	private String name;
	private double unitPrice;
	private double gstPercentage;
	private int quantity;

	public Product(String name, double unitPrice, double gstPercentage, int quantity) {
	this.name = name;
	this.unitPrice = unitPrice;
	this.gstPercentage = gstPercentage;
	this.quantity = quantity;
	}

	public double getTotalPrice() {
	return unitPrice * quantity;
	}

	public String getName(){
	    return name;
	}

	public double getGSTAmount() {
	return (unitPrice * gstPercentage / 100) * quantity;
	}

	public boolean isEligibleForDiscount() {
	return unitPrice >= 500;
	}

	public double getDiscountedPrice() {
	if (isEligibleForDiscount()) {
	return getTotalPrice() * 0.95; // 5% discount
	}
	return getTotalPrice();
	}
	}

