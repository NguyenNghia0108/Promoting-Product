package PromotingProducts;

public class Run implements PlaceAd, Seeding_team {
	@Override
	public void Ad_designing(){
		System.out.println("Ad design...");
	}
	@Override
	public void Contact_website_owner(){
		System.out.println("Contact website owner...");
	}
	@Override
	public void Contact_influencer(){
		System.out.println("Contact influencers...");
	}
	@Override
	public void Create_reviews(){
		System.out.println("Create Reviews...");
	}
	public void Place_Ad() {
		Ad_designing();
		Contact_website_owner();
	}
	public void Call_seeding_team() {
		Contact_influencer();
		Create_reviews();
	}
}
	
