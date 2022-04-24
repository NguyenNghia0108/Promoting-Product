package PromotingProducts;

public class PPFacade {
	Get_Info Info;
	Prepare prepare;
	Run run;
	Calculate_cost cost;
	Report_efficiency report;
	public PPFacade()	{
		prepare = new Prepare();
		run = new Run();
		cost = new Calculate_cost();
		report = new Report_efficiency();
	}
	private void Receive_request() {
		System.out.println("Quest received");
	}
	private void Get_info(String category, String usage, String market) {
		Info = new Get_Info(category, usage, market);
		Info.get_product_category();
		Info.get_product_usage();
		Info.get_product_market();
	}
	private void Prepare() {
		prepare.Collect_data();
		prepare.Select_potential_consumer();
		prepare.Select_potential_method();
		prepare.Select_websites();
	}
	private void Run() {
		run.Ad_designing();
		run.Call_seeding_team();
	}
	private void Calculate_cost() {
		cost.get_ad_cost();
		cost.get_seeding_cost();
	}
	private void Report() {
		report.get_cost();
		report.get_product_growth();
		report.Makereport();
	}
	public void Promoting(String category, String usage, String market) {
		Receive_request();
		Get_info(category, usage, market);
		Prepare();
		Run();
		Calculate_cost();
		Report();
	}
}
