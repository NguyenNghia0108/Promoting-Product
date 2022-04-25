package SendPost;

public class Charge_staff {
	
	Cashier cashier = new Cashier();
	public void Get_price() {
		cashier.Get_charge_staff_money();
	}
	public void Receive_customer_payment() {
		System.out.println("Receiving customer payment...");
	}
}
