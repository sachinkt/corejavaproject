

package week8;

import java.util.Scanner;

/**
* Session 8: Make following changes in code of week7
*  
 *  1. Create Arrays for item_name, item_price, item_quantity, item_coupon
*  2. Inside the loop add item_name, item_price, item_quantity, item_coupon input to Array
*  3. Use data in arrays created in step 2 and implement following:
*  a. printCostStatistics & printCouponStatistics 
 *      b. Implement logic for most expensive and least expensive items
*      c. Move logic for most expensive and least expensive to different methods.
*  
 **/
public class ShoppingMain {
  private static Scanner input;

  public static void main(String[] args) {

     input = new Scanner(System.in);

     System.out.println("Please enter number of items : ");
     int numberOfItems = input.nextInt();
     double finalCost = 0;
     
     //TODO: 1. Create arrays for item_name, item_price, item_quantity, item_coupon
     
     for(int i = 0; i < numberOfItems; i++){
       int itemCount = i + 1;
       System.out.println("Item number : " + itemCount);
       
       String item_1_name;
       System.out.println("Enter name of item" + itemCount + " : ");
       item_1_name = input.next();
       if(item_1_name.length() > 10){
          System.out.println("Item name cannot be more than 10 characters !");
          return;
       }
       int item_1_price;
       System.out.println("Enter price of item" + itemCount + " : ");
       item_1_price = input.nextInt();
       int item_1_quantity;
       System.out.println("Enter quantity of item" + itemCount + " : ");
       item_1_quantity = input.nextInt();
       int item_1_coupon;
       System.out.println("Enter coupon for item" + itemCount + " : ");
       item_1_coupon = input.nextInt();

       //TODO: 2. Add data to arrays
       int item_1_totalCost = calculateTotalCost(item_1_price, item_1_quantity);

       printTotalCost(item_1_name, item_1_totalCost);
       printCouponRate(item_1_name, item_1_coupon);
       double item_1_finalCost = calculateFinalCost(item_1_totalCost, item_1_coupon);
       printFinalCost(item_1_name, item_1_finalCost);
       
       finalCost = finalCost + item_1_finalCost;
     }
     
     //TODO: 3 Use data in arrays and implement below code
     
//   printCostStatistics(item_1_finalCost, item_2_finalCost, item_3_finalCost);
//   printCouponStatistics(item_1_coupon, item_2_coupon, item_3_coupon);

//   if (item_1_finalCost > item_2_finalCost && item_1_finalCost > item_3_finalCost) {
//     System.out.println(item_1_name + " is more expensive");
//   } else if (item_2_finalCost > item_1_finalCost && item_2_finalCost > item_3_finalCost) {
//     System.out.println(item_2_name + " is more expensive");
//   } else {
//     System.out.println(item_3_name + " is more expensive");       
//   }

//   if (item_1_finalCost < item_2_finalCost && item_1_finalCost < item_3_finalCost) {
//     System.out.println(item_1_name + " is least expensive");
//   } else if (item_2_finalCost < item_1_finalCost && item_2_finalCost < item_3_finalCost) {
//     System.out.println(item_2_name + " is least expensive");
//   } else {
//     System.out.println(item_3_name + " is least expensive");      
//   }

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
