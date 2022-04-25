package PromotingProducts;

public class Run {
	PlaceAd Ad = new PlaceAd();
	Seeding_team seeding = new Seeding_team();
	public void Place_Ad() {
		Ad.Ad_designing();
		Ad.Contact_website_owner();
	}
	public void Call_seeding_team() {
		seeding.Contact_influencer();
		seeding.Create_reviews();
	}
}
	
