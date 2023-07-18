import java.util.ArrayList;
import java.util.List;

public class Shopkeeper {
	public static void main(String[] args) {
	List<Product> basket = new ArrayList<>();

	// Add products to the basket
	basket.add(new Product("Leather wallet", 1100, 18, 1));
	basket.add(new Product("Umbrella", 900, 12, 4));
	basket.add(new Product("Cigarette", 200, 28, 3));
	basket.add(new Product("Honey", 100, 0, 2));

	double maxGSTAmount = 0;
	String productWithMaxGST = "";
	double totalAmountToPay = 0;

	// Calculate the maximum GST amount and total amount to pay
	for (Product product : basket) {
	double gstAmount = product.getGSTAmount();
	if (gstAmount > maxGSTAmount) {
	maxGSTAmount = gstAmount;
	productWithMaxGST = product.getName();
	}
	totalAmountToPay += product.getDiscountedPrice();
	}

	System.out.println("Product with maximum GST amount: " + productWithMaxGST);
	System.out.println("Total amount to be paid to the shopkeeper: Rs. " + totalAmountToPay);
	}
	}
