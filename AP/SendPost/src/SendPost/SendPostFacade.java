package SendPost;

public class SendPostFacade {
	Charge charge;
	Packaging packaging;
	Send_parcel send_parcel;
	public SendPostFacade() {
		packaging = new Packaging();
		send_parcel = new Send_parcel();
	}
	private void Receive_order() {
		System.out.println("Order Received!");
	}
	private void Charge(double weight, String service) {
		charge = new Charge(weight, service);
		charge.Get_weight();
		charge.Get_service_option();
		charge.Call_charge_staff();
	}
	private void Packaging() {
		packaging.Get_items();
		packaging.Get_tools();
		packaging.Calculate_cost();
		packaging.Call_cashier();
	}
	private void Send_parcel() {
		send_parcel.Get_adress();
		send_parcel.Calculate_cost();
		send_parcel.Call_cashier();
		send_parcel.Call_shipper();
	}
	public void Send_post(double weight, String service) {
		Receive_order();
		Charge(weight, service);
		Packaging();
		Send_parcel();
	}
}
