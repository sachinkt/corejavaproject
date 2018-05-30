package week7;

import java.util.Scanner;

/**
 * Session 7: Make following changes in code of week6
 *  
 *  1. Comment code for printCostStatistics & printCouponStatistics and logic for more expensive 
 *     and least expensive items. Do not delete we will re-write this after we introduce
 *     arrays in Session 8. It is commented in the code below.    
 *  2. If name of item is more than 10 character stop execution and show user a message.  
 *  3. Modify the program to accept n number of items, where n is provided by user
 *  	a. Ask user how many items he want to enter.
 *  	b. Create a for loop and ask user item_name, item_price, item_quantity, item_coupon.
 *  	c. Calculate total cost for each item inside the loop.
 *  	d. Create a global variable finalCost.
 *  	e. Add totalCost for each item inside the loop to finalCost
 *      f. Ask user for couponCode input and apply to finalCost (this should already be in the code from previous exercise)
 *  
 **/
public class ShoppingMain {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		//TODO: 2. Ask user input for number of items and create loop
		
		String item_1_name;
		System.out.println("Enter name of item1 : ");
		item_1_name = input.next();
		//TODO: 1. Add a check for name not greater than 10 characters. 
		
		int item_1_price;
		System.out.println("Enter price of item1 : ");
		item_1_price = input.nextInt();
		int item_1_quantity;
		System.out.println("Enter quantity of item1 : ");
		item_1_quantity = input.nextInt();
		int item_1_coupon;
		System.out.println("Enter coupon for item1 : ");
		item_1_coupon = input.nextInt();

		String item_2_name;
		System.out.println("Enter name of item2 : ");
		item_2_name = input.next();
		//TODO: 1. Add a check for name not greater than 10 characters.
		
		int item_2_price;
		System.out.println("Enter price of item2 : ");
		item_2_price = input.nextInt();
		int item_2_quantity;
		System.out.println("Enter quantity of item2 : ");
		item_2_quantity = input.nextInt();
		int item_2_coupon;
		System.out.println("Enter coupon for item2 : ");
		item_2_coupon = input.nextInt();

		String item_3_name;
		System.out.println("Enter name of item3 : ");
		item_3_name = input.next();
		//TODO: 1. Add a check for name not greater than 10 characters.
		
		int item_3_price;
		System.out.println("Enter price of item3 : ");
		item_3_price = input.nextInt();
		int item_3_quantity;
		System.out.println("Enter quantity of item3 : ");
		item_3_quantity = input.nextInt();
		int item_3_coupon;
		System.out.println("Enter coupon for item3 : ");
		item_3_coupon = input.nextInt();

		//TODO: 1 - Write a method to calculate total cost instead of writing below code for each item. 
//		int item_1_totalCost = item_1_price * item_1_quantity;
		int item_1_totalCost = calculateTotalCost(item_1_price, item_1_quantity);
		int item_2_totalCost = calculateTotalCost(item_2_price, item_2_quantity);
		int item_3_totalCost = calculateTotalCost(item_3_price, item_3_quantity);

		printTotalCost(item_1_name, item_1_totalCost);
		printTotalCost(item_2_name, item_2_totalCost);
		printTotalCost(item_3_name, item_3_totalCost);
		printCouponRate(item_1_name, item_1_coupon);
		printCouponRate(item_2_name, item_2_coupon);
		printCouponRate(item_3_name, item_3_coupon);

		//TODO: 2 - Write a method to calculate final cost instead of writing below code for each item. 
		double item_1_finalCost = calculateFinalCost(item_1_totalCost, item_1_coupon);
		double item_2_finalCost = calculateFinalCost(item_2_totalCost, item_2_coupon);
		double item_3_finalCost = calculateFinalCost(item_3_totalCost, item_3_coupon);

		printFinalCost(item_1_name, item_1_finalCost);
		printFinalCost(item_2_name, item_2_finalCost);
		printFinalCost(item_3_name, item_3_finalCost);

//		printCostStatistics(item_1_finalCost, item_2_finalCost, item_3_finalCost);
//		printCouponStatistics(item_1_coupon, item_2_coupon, item_3_coupon);
//
//		if (item_1_finalCost > item_2_finalCost && item_1_finalCost > item_3_finalCost) {
//			System.out.println(item_1_name + " is more expensive");
//		} else if (item_2_finalCost > item_1_finalCost && item_2_finalCost > item_3_finalCost) {
//			System.out.println(item_2_name + " is more expensive");
//		} else {
//			System.out.println(item_3_name + " is more expensive");			
//		}
//
//		if (item_1_finalCost < item_2_finalCost && item_1_finalCost < item_3_finalCost) {
//			System.out.println(item_1_name + " is least expensive");
//		} else if (item_2_finalCost < item_1_finalCost && item_2_finalCost < item_3_finalCost) {
//			System.out.println(item_2_name + " is least expensive");
//		} else {
//			System.out.println(item_3_name + " is least expensive");			
//		}

		double finalCost = item_1_finalCost + item_2_finalCost + item_3_finalCost;
		System.out.println("Final cost of all items : " + finalCost);
		System.out.println("Enter coupon code : ");
		String couponCode = input.next();

		double couponDiscount = calculateCouponDiscount(couponCode, finalCost);
		double costAfterCoupon = finalCost - couponDiscount;

		System.out.println("Cost after apply coupon on shopping cart : " + costAfterCoupon);
		
	}

	private static void printTotalCost(String itemName, int totalCost) {
		System.out.println("Total cost of " + itemName + " is " + totalCost);
	}

	private static void printCouponRate(String itemName, int coupon) {
		System.out.println("Coupon rate of " + itemName + " is " + coupon);
	}

	private static void printFinalCost(String itemName, double finalCost) {
		System.out.println("Final cost of " + itemName + " is " + finalCost);
	}

	private static void printCostStatistics(double finalCost1, double finalCost2, double finalCost3) {
		System.out.println("****** Cost statistics ******");
		System.out.println("Most expensive item costs : " + Math.max(finalCost1, Math.max(finalCost2, finalCost3)));
		System.out.println("Cheapest item costs : " + Math.min(finalCost1, Math.min(finalCost2, finalCost3)));
	}

	private static void printCouponStatistics(int coupon1, double coupon2, double coupon3) {
		System.out.println("****** Coupon statistics ******");
		System.out.println(Math.max(coupon1, Math.max(coupon2, coupon3)) + " percent off is awesome !!");
	}
	
	private static int calculateTotalCost(int price, int quantity){
		int totalCost = price * quantity;
		return totalCost;
	}
	
	private static int calculateFinalCost(int totalCost, int coupon){
		int finalCost = totalCost - (totalCost * coupon / 100);
		return finalCost;
	}
	
	private static double calculateCouponDiscount(String couponCode, double finalCost){
		double couponDiscount = 0;
		if (couponCode.equals("A")) {
			couponDiscount = finalCost * 5 / 100;
		} else if (couponCode.equals("B")) {
			couponDiscount = finalCost * 10 / 100;
		} else if (couponCode.equals("C")) {
			couponDiscount = finalCost * 20 / 100;
		}
		
		return couponDiscount;
	}
}
