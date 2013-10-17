package Model;

import java.util.ArrayList;

public class AdsManager {
	
	static private ArrayList<Ads> adsList = new ArrayList<Ads>();
		

	public AdsManager(){
		adsList.add(new Ads("M1-Student","M1","/Ads/Telecom/a.jpg","10-10-2013","31-10-2013","Unlimited SMS and Local Calls","Telecom","yes"));
		adsList.add(new Ads("SGT-Student","Singtel","/Ads/Telecom/b.jpg","16-10-2013","31-10-2013","Unlimited SMS","Telecom","yes"));
		adsList.add(new Ads("SH-Student","StartHub","/Ads/Telecom/c.jpg","12-10-2013","31-12-2013","Local Calls","Telecom","no"));
		
		adsList.add(new Ads("Air Deals","AirShip.co","/Ads/A/a.jpg","12-10-2013","31-12-2013","Airplanes Flight Cheap","Airplanes","no"));
		
		adsList.add(new Ads("Boatz","BoBoats.com","/Ads/B/a.jpg","12-8-2013","31-12-2013","Bitan or Bali ?","Boats","no"));
		
		adsList.add(new Ads("CarNow","Toyota","/Ads/C/a.jpg","12-10-2013","31-12-2013","Cars deals now !","Cars","no"));
		
		adsList.add(new Ads("CheapDres","fashionOne","/Ads/D/a.jpg","12-7-2013","31-12-2013","Dress cheaper than ever","Dress","yes"));
		
		adsList.add(new Ads("Tree3","EnvironTree","/Ads/E/a.jpg","12-9-2013","31-12-2013","Because we care","Environmental","no"));
		
		adsList.add(new Ads("FunnyGame32","Fun.com","/Ads/F/a.jpg","12-10-2013","31-12-2013","Fun for all","Fun","no"));
		
		adsList.add(new Ads("Ga3hr","GaGame","/Ads/G/a.jpg","12-10-2013","31-11-2013","Gathering for loved ones","Gatherings","yes"));
		
		adsList.add(new Ads("HikeUpDown","Track.com","/Ads/H/a.jpg","12-10-2013","31-12-2013","Hiking like a king","Hiking","no"));
		
		adsList.add(new Ads("cream&ice","ColdStone","/Ads/I/a.jpg","12-10-2013","31-12-2013","Ice-cream on the rocks","Ice-cream","no"));
		
		adsList.add(new Ads("JogFit","Safra","/Ads/J/a.jpg","12-10-2013","31-12-2013","Jogging is Fun for you","Jogging","no"));
		
		adsList.add(new Ads("PopW-K","AnnoyningKpop","/Ads/K/a.jpg","12-10-2013","31-12-2013","K-pop with Ko-Boys","K-pop","no"));
		
		adsList.add(new Ads("Lazzee","La-laze.com","/Ads/L/a.jpg","12-10-2013","31-12-2013","Lazing ard on a sunday afternoon","Lazing ard","no"));
		
		adsList.add(new Ads("New Deals","anything.com","/Ads/N/a.jpg","12-10-2013","31-12-2013","New items now !","New items","no"));
		
		adsList.add(new Ads("Grandma's vase shop","StartHub","/Ads/O/a.jpg","12-10-2013","31-12-2013","Ornaments Good for you","Ornaments","no"));
		
		
		// part 2
		
		
		adsList.add(new Ads("Air Deals","AirShip.co","/Ads/A/b.jpg","12-10-2013","31-12-2013","Airplanes Flight Cheap","Airplanes","no"));
		
		adsList.add(new Ads("Boatz","BoBoats.com","/Ads/B/b.jpg","12-8-2013","31-12-2013","Bitan or Bali ?","Boats","no"));
		
		adsList.add(new Ads("CarNow","Toyota","/Ads/C/b.jpg","12-10-2013","31-12-2013","Cars deals now !","Cars","no"));
		
		adsList.add(new Ads("CheapDres","fashionOne","/Ads/D/b.jpg","12-7-2013","31-12-2013","Dress cheaper than ever","Dress","no"));
		
		adsList.add(new Ads("Tree3","EnvironTree","/Ads/E/b.jpg","12-9-2013","31-12-2013","Because we care","Environmental","no"));
		
		adsList.add(new Ads("FunnyGame32","Fun.com","/Ads/F/b.jpg","12-10-2013","31-12-2013","Fun for all","Fun","no"));
		
		adsList.add(new Ads("Ga3hr","GaGame","/Ads/G/b.jpg","12-10-2013","31-11-2013","Gathering for loved ones","Gatherings","no"));
		
		adsList.add(new Ads("HikeUpDown","Track.com","/Ads/H/b.jpg","12-10-2013","31-12-2013","Hiking like a king","Hiking","no"));
		
		adsList.add(new Ads("cream&ice","ColdStone","/Ads/I/b.jpg","12-10-2013","31-12-2013","Ice-cream on the rocks","Ice-cream","no"));
		
		adsList.add(new Ads("JogFit","Safra","/Ads/J/b.jpg","12-10-2013","31-12-2013","Jogging is Fun for you","Jogging","no"));
		
		adsList.add(new Ads("PopW-K","AnnoyningKpop","/Ads/K/b.jpg","12-10-2013","31-12-2013","K-pop with Ko-Boys","K-pop","no"));
		
		adsList.add(new Ads("Lazzee","La-laze.com","/Ads/L/b.jpg","12-10-2013","31-12-2013","Lazing ard on a sunday afternoon","Lazing ard","no"));
		
		adsList.add(new Ads("New Deals","anything.com","/Ads/N/b.jpg","12-10-2013","31-12-2013","New items now !","New items","no"));
		
		adsList.add(new Ads("Grandma's vase shop","StartHub","/Ads/O/b.jpg","12-10-2013","31-12-2013","Ornaments Good for you","Ornaments","no"));
	
	}
	
	
		public static ArrayList<Ads> retrieveAds(String s){
			System.out.println("String received: " + s);
			ArrayList<Ads> temp = new ArrayList<Ads>();
			System.out.println("AdsList: " + adsList);
			for(Ads ads : adsList){
				System.out.println(ads.getCat() + ":" + s);
				if(ads.getCat().equals(s)){
				temp.add(ads);
				System.out.println("Bingo!");
				}
			
			}
			return temp;
		}
		
		public static ArrayList<Ads> retrieveMyAds(String s){
			//System.out.println("String received: " + s);
			ArrayList<Ads> temp = new ArrayList<Ads>();
			//System.out.println("AdsList: " + adsList);
			for(Ads ads : adsList){
				//System.out.println(ads.getSavedAd() + ":" + s);
				if(ads.getSavedAd().equals("yes")){
				temp.add(ads);
				}
			}
			return temp;
		}
		
		public static void clearArray(){
			adsList.removeAll(adsList);
			
		}
}