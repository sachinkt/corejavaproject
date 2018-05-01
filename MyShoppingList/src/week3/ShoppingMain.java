package week3;

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

        String item_1_name = "Tea";
        System.out.println("Enter name of item1 : ");
        input = new Scanner(System.in);
        item_1_name = input.next();
        String item_2_name = "Coffee";

        int item_1_price = 10;
        System.out.println("Enter price of item1 : ");
        input = new Scanner(System.in);
        item_1_price = input.nextInt();
        
        int item_2_price = 10;
        //TODO: Take input from user for item_2_price
        
        int item_1_quantity = 2;
        //TODO: Take input from user for item_1_quantity
        int item_2_quantity = 4;
        //TODO: Take input from user for item_2_quantity

        //“To calculate the totalCost, multiply the price of the item by quantity of the item”
        int item_1_totalCost = item_1_price * item_1_quantity;
        int item_2_totalCost = item_2_price * item_2_quantity;

        System.out.println("Total cost of " + item_1_name + " is " + item_1_totalCost);
        System.out.println("Total cost of " + item_2_name + " is " + item_2_totalCost);

        int item_1_coupon = 10;
        //TODO: Take input from user for item_1_coupon
        int item_2_coupon = 10;
        //TODO: Take input from user for item_2_coupon

        //“To calculate the discount, multiply the price of the item by the discount percentage in the coupon”
        int item_1_finalCost = item_1_totalCost - (item_1_totalCost * item_1_coupon / 100);
        int item_2_finalCost = item_2_totalCost - (item_2_totalCost * item_2_coupon / 100);

        System.out.println("Final cost after discount for " + item_1_name + " is " + item_1_finalCost);
        System.out.println("Final cost after discount for " + item_2_name + " is " + item_2_finalCost);
    }
}