package PromotingProducts;

public class Get_Info {
	String Category;
	String Usage;
	String Market;
	public Get_Info(String category, String usage, String market) {
		Category = category;
		Usage = usage;
		Market = market;
	}
	public void get_product_category() {
		System.out.println("Product category: " + Category);
	}
	public void get_product_usage() {
		System.out.println("Product usage: " + Usage);
	}
	public void get_product_market() {
		System.out.println("Product market: " + Market);
	}
}
