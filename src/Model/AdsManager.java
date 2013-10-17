package Model;

import java.util.ArrayList;

public class AdsManager {
	
	static private ArrayList<Ads> adsList = new ArrayList<Ads>();
	
	
	
	
	

	public AdsManager(){
		adsList.add(new Ads("M1-Student","M1","/Ads/Telecom/a.jpg","10-10-2013","31-10-2013","Unlimited SMS and Local Calls","Telecom"));
		adsList.add(new Ads("SGT-Student","Singtel","/Ads/Telecom/b.jpg","16-10-2013","31-10-2013","Unlimited SMS","Telecom"));
		adsList.add(new Ads("SH-Student","StartHub","/Ads/Telecom/c.jpg","12-10-2013","31-12-2013","Local Calls","Telecom"));
		
		adsList.add(new Ads("Air Deals","AirShip.co","/Ads/A/a.jpg","12-10-2013","31-12-2013","Airplanes Flight Cheap","Airplanes"));
		
		adsList.add(new Ads("Boatz","BoBoats.com","/Ads/B/a.jpg","12-8-2013","31-12-2013","Bitan or Bali ?","Boats"));
		
		adsList.add(new Ads("CarNow","Toyota","/Ads/C/a.jpg","12-10-2013","31-12-2013","Cars deals now !","Cars"));
		
		adsList.add(new Ads("CheapDres","fashionOne","/Ads/D/a.jpg","12-7-2013","31-12-2013","Dress cheaper than ever","Dress"));
		
		adsList.add(new Ads("Tree3","EnvironTree","/Ads/E/a.jpg","12-9-2013","31-12-2013","Because we care","Environmental"));
		
		adsList.add(new Ads("FunnyGame32","Fun.com","/Ads/F/a.jpg","12-10-2013","31-12-2013","Fun for all","Fun"));
		
		adsList.add(new Ads("Ga3hr","GaGame","/Ads/G/a.jpg","12-10-2013","31-11-2013","Gathering for loved ones","Gatherings"));
		
		adsList.add(new Ads("HikeUpDown","Track.com","/Ads/H/a.jpg","12-10-2013","31-12-2013","Hiking like a king","Hiking"));
		
		adsList.add(new Ads("cream&ice","ColdStone","/Ads/I/a.jpg","12-10-2013","31-12-2013","Ice-cream on the rocks","Ice-cream"));
		
		adsList.add(new Ads("JogFit","Safra","/Ads/J/a.jpg","12-10-2013","31-12-2013","Jogging is Fun for you","Jogging"));
		
		adsList.add(new Ads("PopW-K","AnnoyningKpop","/Ads/K/a.jpg","12-10-2013","31-12-2013","K-pop with Ko-Boys","K-pop"));
		
		adsList.add(new Ads("Lazzee","La-laze.com","/Ads/L/a.jpg","12-10-2013","31-12-2013","Lazing ard on a sunday afternoon","Lazing ard"));
		
		adsList.add(new Ads("New Deals","anything.com","/Ads/N/a.jpg","12-10-2013","31-12-2013","New items now !","New items"));
		
		adsList.add(new Ads("Grandma's vase shop","StartHub","/Ads/O/a.jpg","12-10-2013","31-12-2013","Ornaments Good for you","Ornaments"));
		
		
		// part 2
		
		
		adsList.add(new Ads("Air Deals","AirShip.co","/Ads/A/b.jpg","12-10-2013","31-12-2013","Airplanes Flight Cheap","Airplanes"));
		
		adsList.add(new Ads("Boatz","BoBoats.com","/Ads/B/b.jpg","12-8-2013","31-12-2013","Bitan or Bali ?","Boats"));
		
		adsList.add(new Ads("CarNow","Toyota","/Ads/C/b.jpg","12-10-2013","31-12-2013","Cars deals now !","Cars"));
		
		adsList.add(new Ads("CheapDres","fashionOne","/Ads/D/b.jpg","12-7-2013","31-12-2013","Dress cheaper than ever","Dress"));
		
		adsList.add(new Ads("Tree3","EnvironTree","/Ads/E/b.jpg","12-9-2013","31-12-2013","Because we care","Environmental"));
		
		adsList.add(new Ads("FunnyGame32","Fun.com","/Ads/F/b.jpg","12-10-2013","31-12-2013","Fun for all","Fun"));
		
		adsList.add(new Ads("Ga3hr","GaGame","/Ads/G/b.jpg","12-10-2013","31-11-2013","Gathering for loved ones","Gatherings"));
		
		adsList.add(new Ads("HikeUpDown","Track.com","/Ads/H/b.jpg","12-10-2013","31-12-2013","Hiking like a king","Hiking"));
		
		adsList.add(new Ads("cream&ice","ColdStone","/Ads/I/b.jpg","12-10-2013","31-12-2013","Ice-cream on the rocks","Ice-cream"));
		
		adsList.add(new Ads("JogFit","Safra","/Ads/J/b.jpg","12-10-2013","31-12-2013","Jogging is Fun for you","Jogging"));
		
		adsList.add(new Ads("PopW-K","AnnoyningKpop","/Ads/K/b.jpg","12-10-2013","31-12-2013","K-pop with Ko-Boys","K-pop"));
		
		adsList.add(new Ads("Lazzee","La-laze.com","/Ads/L/b.jpg","12-10-2013","31-12-2013","Lazing ard on a sunday afternoon","Lazing ard"));
		
		adsList.add(new Ads("New Deals","anything.com","/Ads/N/b.jpg","12-10-2013","31-12-2013","New items now !","New items"));
		
		adsList.add(new Ads("Grandma's vase shop","StartHub","/Ads/O/b.jpg","12-10-2013","31-12-2013","Ornaments Good for you","Ornaments"));
	
	}
	
	
		public static ArrayList<Ads> retrieveAds(String s){
			
			ArrayList<Ads> temp = new ArrayList<Ads>();
			for(Ads ads : adsList){
				if(ads.getCat().equals(s)){
				temp.add(ads);
				}
			
			}
			return temp;
		}
}