package SendPost;

public class Packaging implements Cashier {
	@Override
	public void Get_packaging_cost() {
		System.out.println("Packaging cost: 1$");
	}
	public void Get_charge_staff_money() {}
	public void Get_shipper_cost() {}
	public void Sum() {}
	public void Get_items() {
		System.out.println("Getting items...");
	}
	public void Get_tools() {
		System.out.println("Getting tool...");
	}
	public void Calculate_cost() {
		System.out.println("Calculating packaging cost...");
	}
	public void Call_cashier() {
		Get_packaging_cost();
	}
}
