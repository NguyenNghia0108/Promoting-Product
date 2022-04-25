package SendPost;

public class Packaging {
	Cashier cashier = new Cashier();
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
		cashier.Get_packaging_cost();
	}
}
