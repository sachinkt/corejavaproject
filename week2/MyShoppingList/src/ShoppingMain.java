public class ShoppingMain {
	public static void main(String[] args) {

		String item_1 = "Coffee";
		String item_2 = "Tea";

		int item_1_price = 10;
		int item_2_price = 20;

		int item_1_quantity = 2;
		int item_2_quantity = 3;

		int total_cost_1 = item_1_price * item_1_quantity;
		int total_cost_2 = item_2_price * item_2_quantity;

		System.out.println("Total cost of " + item_1 + " is " + total_cost_1);
		System.out.println("Total cost of " + item_2 + " is " + total_cost_2);

		int item_1_coupon = 10;
		int item_2_coupon = 50;

		int final_cost_1 = total_cost_1 - ((total_cost_1 * item_1_coupon) / 100);
		int final_cost_2 = total_cost_2 - ((total_cost_2 * item_2_coupon) / 100);

		System.out.println("Final cost of " + item_1 + " is " + final_cost_1);
		System.out.println("Final cost of " + item_2 + " is " + final_cost_2);
	}
}