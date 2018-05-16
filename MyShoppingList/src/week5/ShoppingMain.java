package week5;

import java.util.Scanner;

/**
 * Session 5: Make following changes in code of week4
 * 
 * 1. Reorganize your code to ask all details of each item i.e. name, price, quantity, coupon for item1 and then for item2 
 * 2. Print name of item which has least finalcost
 * 3. Print name of item which is most expensive. 
 * 4. Calculate and print total cost of all three items
 * 5. Prompt user to input coupon code for whole shopping cart 
 * 		a. if coupon code = A. Apply additional 5% off on total cost 
 * 		b. if coupon code = B. Apply additional 10% off on total cost 
 * 		c. if coupon code = C. Apply additional 20% off on total cost   
 * 6. Calculate Cost after applying coupon code and print it.
 * 
 * 7. Prompt user to enter details of item3 i.e. item_3_name, item_3_price, item_3_quantity, item_3_coupon and recalculate 2, 3, 4, 5, 6 above. 
 *  
 **/
public class ShoppingMain {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		String item_1_name;
		System.out.println("Enter name of item1 : ");
		item_1_name = input.next();

		String item_2_name;
		System.out.println("Enter name of item2 : ");
		item_2_name = input.next();

		int item_1_price;
		System.out.println("Enter price of item1 : ");
		item_1_price = input.nextInt();

		int item_2_price;
		System.out.println("Enter price of item2 : ");
		item_2_price = input.nextInt();

		int item_1_quantity;
		System.out.println("Enter quantity of item1 : ");
		item_1_quantity = input.nextInt();

		int item_2_quantity;
		System.out.println("Enter quantity of item2 : ");
		item_2_quantity = input.nextInt();

		int item_1_totalCost = item_1_price * item_1_quantity;
		int item_2_totalCost = item_2_price * item_2_quantity;

		printTotalCost(item_1_name, item_1_totalCost);
		printTotalCost(item_2_name, item_2_totalCost);

		int item_1_coupon;
		System.out.println("Enter coupon for item1 : ");
		item_1_coupon = input.nextInt();

		int item_2_coupon;
		System.out.println("Enter coupon for item2 : ");
		item_2_coupon = input.nextInt();

		printCouponRate(item_1_name, item_1_coupon);
		printCouponRate(item_2_name, item_2_coupon);

		double item_1_finalCost = item_1_totalCost
				- (item_1_totalCost * item_1_coupon / 100);
		double item_2_finalCost = item_2_totalCost
				- (item_2_totalCost * item_2_coupon / 100);

		printFinalCost(item_1_name, item_1_finalCost);
		printFinalCost(item_2_name, item_2_finalCost);
		
		printCostStatistics(item_1_finalCost, item_2_finalCost);
		printCouponStatistics(item_1_coupon, item_2_coupon);
		
		//TODO: Print name of item which is most expensive
		//TODO: Print name of item which is least expensive
		
		//TODO: Calculate and print final cost of all items
		//TODO: Prompt user for coupon code to apply on whole shopping cart
		//TODO: Calculate and print cost after coupon code
	}

	private static void printTotalCost(String itemName, int totalCost) {
		System.out.println("Total cost of " + itemName + " is " + totalCost);
	}

	private static void printCouponRate(String itemName, int coupon) {
		System.out.println("Coupon rate of " + itemName + " is " + coupon);
	}

	private static void printFinalCost(String itemName, double finalCost)
	{
		System.out.println("Final cost of " + itemName + " is " + finalCost);
	}
	
	private static void printCostStatistics(double finalCost1, double finalCost2){
		System.out.println("****** Cost statistics ******");
		System.out.println("Most expensive item costs : " + Math.max(finalCost1, finalCost2));
		System.out.println("Cheapest item costs : " + Math.min(finalCost1, finalCost2));
	}
	
	private static void printCouponStatistics(int coupon1, double coupon2){
		System.out.println("****** Coupon statistics ******");
		System.out.println(Math.max(coupon1, coupon2) +  " percent off is awesome !!");
	}
}
