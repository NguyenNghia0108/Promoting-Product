package SendPost;

public class Charge extends Charge_staff {
	double Weight;
	String Service;
	public Charge(double weight, String service) {
		Weight = weight;
		Service = service;
	}
	public void Get_weight() {
		System.out.println("Post weight: " + Weight + "kg");
	}
	public void Get_service_option() {
		System.out.println("Service option: " + Service);
	}
	public void Call_charge_staff() {
		Get_price();
		Receive_customer_payment();
	}
}
