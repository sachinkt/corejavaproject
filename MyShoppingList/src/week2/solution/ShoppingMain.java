package week2.solution;

import java.util.Scanner;

/**
Session 2: Create two Shopping items and apply coupons to them.


â€¢	Create string variables item_1_name, item_2_name and assign values
â€¢	Create int variables for price item_1_price, item_2_price
â€¢	Create int variable for quantity item_1_quantity, item_2_quantity
â€¢	Calculate item_1_total cost for item_1 and item_2_totalCost for item_2  e.g.. item_1_totalCost = item_1_quantity * item_price_1
â€¢	Print total cost for each item. e.g. Total cost of Coffee is 20
â€¢	Create variables for coupon item_1_coupon & item_2_coupon
â€¢	Calculate final price for each item after coupon e.g. item_1_finalCost = item_1_totalCost - ((item_1_totalCost * item_1_coupon) / 100);
â€¢	Try changing type from int to double and calculate more accurate results
**/
public class ShoppingMain {
	private static Scanner input;

	public static void main(String[] args) {

		String item_1_name = "Tea";
		String item_2_name = "Coffee";

		int item_1_price = 10;
		int item_2_price = 10;

		int item_1_quantity = 2;
		int item_2_quantity = 4;

		// To calculate the totalCost, multiply the price of the item by
		// quantity of the itemâ€�
		int item_1_totalCost = item_1_price * item_1_quantity;
		int item_2_totalCost = item_2_price * item_2_quantity;

		System.out.println("Total cost of " + item_1_name + " is "
				+ item_1_totalCost);
		System.out.println("Total cost of " + item_2_name + " is "
				+ item_2_totalCost);

		int item_1_coupon = 10;
		int item_2_coupon = 10;

		int item_1_finalCost = item_1_totalCost
				- (item_1_totalCost * item_1_coupon / 100);
		int item_2_finalCost = item_2_totalCost
				- (item_2_totalCost * item_2_coupon / 100);

		System.out.println("Final cost after discount for " + item_1_name
				+ " is " + item_1_finalCost);
		System.out.println("Final cost after discount for " + item_2_name
				+ " is " + item_2_finalCost);
	}
}
