package SendPost;

public class Charge_staff implements Cashier {
	@Override
	public void Get_charge_staff_money() {
		System.out.println("Charge staff money: 1$");
	}
	public void Get_packaging_cost() {}
	public void Get_shipper_cost(){}
	public void Sum(){}
	public void Get_price() {
		Get_charge_staff_money();
	}
	public void Receive_customer_payment() {
		System.out.println("Receiving customer payment...");
	}
}
