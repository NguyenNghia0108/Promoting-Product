package SendPost;

public class Charge {
	double Weight;
	String Service;
	Charge_staff charge_staff;
	public Charge(double weight, String service) {
		Weight = weight;
		Service = service;
		charge_staff = new Charge_staff();
	}
	public void Get_weight() {
		System.out.println("Post weight: " + Weight + "kg");
	}
	public void Get_service_option() {
		System.out.println("Service option: " + Service);
	}
	public void Call_charge_staff() {
		charge_staff.Get_price();
		charge_staff.Receive_customer_payment();
	}
}
