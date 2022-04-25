package SendPost;

public class Send_parcel {
	Cashier cashier = new Cashier();
	Shipper shipper = new Shipper();
	public void Get_charge_staff_money() {}
	public void Get_packaging_cost() {}
	public void Get_adress() {
		System.out.println("Getting adress...");
	}
	public void Calculate_cost() {
		System.out.println("Calculating shipping cost...");
	}
	public void Call_cashier() {
		cashier.Get_shipper_cost();
		cashier.Sum();
	}
	public void Call_shipper() {
		shipper.Load_parcel();
		shipper.Ship();
	}
}
