package week9;

import java.util.Scanner;

/**
 * Session 9: Make following changes in code of week8 
 * 1. Add validation that price should be greater than zero 
 * 2. Add validation that quantity should be greater than zero 
 * 3. Add validation that coupon should be in between 1 and 100 
 * 4. Add validation that coupon code on shopping i.e. A, B, C should be only of one character 
 * 5. If coupon code is other than A, B, C then show user a message "Invalid coupon Code" 
 * 6. If any validation fails, retry i.e. ask same input again and execute other logic
 * 
 **/
public class ShoppingMain {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Please enter number of items : ");
		int numberOfItems = input.nextInt();
		double finalCost = 0;

		String[] itemNames = new String[numberOfItems];
		int[] prices = new int[numberOfItems];
		int[] quantities = new int[numberOfItems];
		int[] coupons = new int[numberOfItems];
		double[] finalCosts = new double[numberOfItems];

		for (int i = 0; i < numberOfItems; i++) {
			int itemCount = i + 1;
			System.out.println("Item number : " + itemCount);

			String item_1_name;
			while (true) {
				System.out.println("Enter name of item" + itemCount + " : ");
				item_1_name = input.next();
				if (item_1_name.length() > 10) {
					System.out
							.println("Item name cannot be more than 10 characters !");
				} else {
					break;
				}
			}

			itemNames[i] = item_1_name;

			// TODO: 1. Add validation that price should be greater than zero
			int item_1_price;
			while (true) {
				System.out.println("Enter price of item" + itemCount + " : ");
				item_1_price = input.nextInt();
				if (item_1_price <= 0) {
					System.out
							.println("Item price should be more than zero ! ");
				} else {
					break;
				}
			}
			prices[i] = item_1_price;

			// TODO: 2. Add validation that quantity should be greater than zero
			int item_1_quantity;
			while (true) {
				System.out
						.println("Enter quantity of item" + itemCount + " : ");
				item_1_quantity = input.nextInt();
				if (item_1_quantity <= 0) {
					System.out
							.println("Item quantity should be more than zero ! ");
				} else {
					break;
				}
			}
			quantities[i] = item_1_quantity;

			// TODO: 3. Add validation that coupon should be in between 1 and
			// 100
			int item_1_coupon;
			while (true) {
				System.out.println("Enter coupon for item" + itemCount + " : ");
				item_1_coupon = input.nextInt();
				if (item_1_coupon < 0 || item_1_coupon > 100) {
					System.out
							.println("Item coupon should be between 0 and 100");
				} else {
					break;
				}
			}
			coupons[i] = item_1_coupon;

			// TODO: 2. Add data to arrays
			int item_1_totalCost = calculateTotalCost(item_1_price,
					item_1_quantity);

			printTotalCost(item_1_name, item_1_totalCost);
			printCouponRate(item_1_name, item_1_coupon);
			double item_1_finalCost = calculateFinalCost(item_1_totalCost,
					item_1_coupon);
			printFinalCost(item_1_name, item_1_finalCost);
			finalCosts[i] = item_1_finalCost;

			finalCost = finalCost + item_1_finalCost;
		}

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print("Item" + (i + 1) + " :" + itemNames[i]);
			System.out.print(" Price" + (i + 1) + " :" + prices[i]);
			System.out.print(" Quantity" + (i + 1) + " :" + quantities[i]);
			System.out.print(" Coupon" + (i + 1) + " :" + coupons[i]);
			System.out.println(" Cost " + (i + 1) + " :" + finalCosts[i]);
		}

		System.out.println("Final cost of all items : " + finalCost);

		// TODO: 5. Add validation that coupon code on shopping i.e. A, B, C
		// should be only of one character
		String couponCode;
		while (true) {
			System.out.println("Enter coupon code : ");
			couponCode = input.next();
			if (couponCode.equals("A") || couponCode.equals("B") || couponCode.equals("C")){
				break;
			} else {
				System.out.println("Coupon Code is invalid !");
			}
		}

		// TODO: 3 Use data in arrays and implement below code
		printCostStatistics(finalCosts, itemNames);
		printCouponStatistics(coupons);

		double couponDiscount = calculateCouponDiscount(couponCode, finalCost);
		double costAfterCoupon = finalCost - couponDiscount;

		System.out.println("Cost after apply coupon on shopping cart : "
				+ costAfterCoupon);
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

	private static void printCostStatistics(double[] finalCosts,
			String[] itemNames) {
		System.out.println("****** Cost statistics ******");

		double maxCost = 0;
		double minCost = Integer.MAX_VALUE;
		String maxCostItemName = "";
		String minCostItemName = "";

		for (int i = 0; i < finalCosts.length; i++) {
			if (finalCosts[i] > maxCost) {
				maxCost = finalCosts[i];
				maxCostItemName = itemNames[i];
			}
			if (finalCosts[i] < minCost) {
				minCost = finalCosts[i];
				minCostItemName = itemNames[i];
			}
		}

		System.out.println("Most expensive item costs : " + maxCost);
		System.out.println("Cheapest item costs : " + minCost);
		System.out.println("Most expensive item name : " + maxCostItemName);
		System.out.println("Cheapest item name : " + minCostItemName);
	}

	private static void printCouponStatistics(int[] coupons) {
		System.out.println("****** Coupon statistics ******");
		double maxCoupon = 0;
		for (int i = 0; i < coupons.length; i++) {
			if (coupons[i] > maxCoupon) {
				maxCoupon = coupons[i];
			}
		}
		System.out.println(maxCoupon + " percent off is awesome !!");
	}

	private static void printMostExpensive() {

	}

	private static int calculateTotalCost(int price, int quantity) {
		int totalCost = price * quantity;
		return totalCost;
	}

	private static int calculateFinalCost(int totalCost, int coupon) {
		int finalCost = totalCost - (totalCost * coupon / 100);
		return finalCost;
	}

	private static double calculateCouponDiscount(String couponCode,
			double finalCost) {
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
