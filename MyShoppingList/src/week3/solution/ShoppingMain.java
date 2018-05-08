package week3.solution;

import java.util.Scanner;

/**
Session 3: Make following changes in code of week2 
*  1. Take all inputs from users, see item_1_name and item_1_price and complete all TODO's
*  2. Convert data type for item_1_finalCost and item_2_finalCost to double
*  
**/
public class ShoppingMain {
    private static Scanner input;

	public static void main(String[] args) {

        input = new Scanner(System.in);

        String item_1_name = "Tea";
        System.out.println("Enter name of item1 : ");
        item_1_name = input.next();
        String item_2_name = "Coffee";
        System.out.println("Enter name of item2 : ");
        item_2_name = input.next();

        int item_1_price = 10;
        System.out.println("Enter price of item1 : ");
        item_1_price = input.nextInt();
        
        int item_2_price = 10;
        System.out.println("Enter price of item2 : ");
        item_2_price = input.nextInt();
        
        int item_1_quantity = 2;
        System.out.println("Enter quantity of item1 : ");
        item_1_quantity = input.nextInt();
        int item_2_quantity = 4;
        System.out.println("Enter quantity of item2 : ");
        item_2_quantity = input.nextInt();

        //â€œTo calculate the totalCost, multiply the price of the item by quantity of the itemâ€?
        int item_1_totalCost = item_1_price * item_1_quantity;
        int item_2_totalCost = item_2_price * item_2_quantity;

        System.out.println("Total cost of " + item_1_name + " is " + item_1_totalCost);
        System.out.println("Total cost of " + item_2_name + " is " + item_2_totalCost);

        int item_1_coupon = 10;
        System.out.println("Enter coupon for item1 : ");
        item_1_coupon = input.nextInt();
        int item_2_coupon = 10;
        System.out.println("Enter coupon for item2 : ");
        item_2_coupon = input.nextInt();

        //To calculate the discount, multiply the price of the item by the discount percentage in the couponâ€?
        double item_1_finalCost = item_1_totalCost - (item_1_totalCost * item_1_coupon / 100);
        double item_2_finalCost = item_2_totalCost - (item_2_totalCost * item_2_coupon / 100);

        System.out.println("Final cost after discount for " + item_1_name + " is " + item_1_finalCost);
        System.out.println("Final cost after discount for " + item_2_name + " is " + item_2_finalCost);
    }
}
