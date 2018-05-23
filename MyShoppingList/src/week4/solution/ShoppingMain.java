package week4.solution;

import java.util.Scanner;

/**
 * Session 4: Make following changes in code of week3
 * 
 * 1. See void method to printTotalCost - Fully implemented
 * 2. Complete implementation of method printCouponRate - Partially implemented
 * 3. Implement method for printFinalCost - Not implemented
 * 4. Study method printCostStatistics - Fully implemented
 * 5. Complete implementation of printCouponStatistics - Partially implemented
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
