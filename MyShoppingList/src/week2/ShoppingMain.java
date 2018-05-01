package week2;

/**
Session 2: Create two Shopping items and apply coupons to them.


•	Create string variables item_1_name, item_2_name and assign values
•	Create int variables for price item_1_price, item_2_price
•	Create int variable for quantity item_1_quantity, item_2_quantity
•	Calculate item_1_total cost for item_1 and item_2_totalCost for item_2  e.g.. item_1_totalCost = item_1_quantity * item_price_1
•	Print total cost for each item. e.g. Total cost of Coffee is 20
•	Create variables for coupon item_1_coupon & item_2_coupon
•	Calculate final price for each item after coupon e.g. item_1_finalCost = item_1_totalCost - ((item_1_totalCost * item_1_coupon) / 100);
•	Try changing type from int to double and calculate more accurate results
**/
public class ShoppingMain {
    public static void main(String[] args) {

        String item_1_name = "Coffee";
        //TODO: Creare a second variable (String item_2_name)  with value "Tea"

        int item_1_price = 10;
        //TODO: Create an int variable (item_2_price)  with price=20

        int item_1_quantity = 2;
        //TODO: Create an int variable (item_2_quantity)  with quantity=3

        //“To calculate the totalCost, multiply the price of the item by quantity of the item”
        int item_1_totalCost = item_1_price * item_1_quantity;
        //TODO: Calculate total cost of second item item_2_price * item_2_quantity and store in variable item_2_totalCost

        System.out.println("Total cost of " + item_1_name + " is " + item_1_totalCost);
        //TODO: Print total cost of second item 

        int item_1_coupon = 10;
        //TODO: Create an int variable (item_2_coupon)  with value=40

        //“To calculate the discount, multiply the price of the item by the discount percentage in the coupon”
        int item_1_finalCost = item_1_totalCost - (item_1_totalCost * item_1_coupon / 100);
        //TODO: Calculate the second items final cost and store in variable item_2_finalCost

        System.out.println("Final cost after discount for " + item_1_name + " is " + item_1_finalCost);
        //TODO: Print the second items final cost

    }
}