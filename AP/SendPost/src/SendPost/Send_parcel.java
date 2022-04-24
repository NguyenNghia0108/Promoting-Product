package SendPost;

public class Send_parcel implements Cashier, Shipper {
	@Override
	public void Get_shipper_cost() {
		System.out.println("Shipping cost: 1$");
	}
	@Override
	public void Sum() {
		System.out.println("Total price: 3$");
	}
	@Override
	public void Load_parcel() {
		System.out.println("Loading parcel...");
	}
	@Override
	public void Ship() {
		System.out.println("Shipping...");
	}
	public void Get_charge_staff_money() {}
	public void Get_packaging_cost() {}
	public void Get_adress() {
		System.out.println("Getting adress...");
	}
	public void Calculate_cost() {
		System.out.println("Calculating shipping cost...");
	}
	public void Call_cashier() {
		Get_shipper_cost();
		Sum();
	}
	public void Call_shipper() {
		Load_parcel();
		Ship();
	}
}
