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
	public void Promoting(String category, String usage, String market) {
		Info = new Get_Info(category, usage, market);
		Info.get_product_category();
		Info.get_product_usage();
		Info.get_product_market();
		prepare.Collect_data();
		prepare.Select_potential_consumer();
		prepare.Select_potential_method();
		prepare.Select_websites();
		run.Ad_designing();
		run.Call_seeding_team();
		cost.get_ad_cost();
		cost.get_seeding_cost();
		report.get_cost();
		report.get_product_growth();
		report.Makereport();
	}
}
