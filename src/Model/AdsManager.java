package Model;

import java.util.ArrayList;

public class AdsManager {
	
	static private ArrayList<Ads> adsList = new ArrayList<Ads>();
	static private ArrayList<Ads> myAdsList = new ArrayList<Ads>();

	public AdsManager(){
		adsList.add(new Ads("M1-Student","M1","/Ads/Telecom/a.jpg","10-10-2013","31-10-2013","Unlimited SMS and Local Calls","Telecom","no","no"));
		adsList.add(new Ads("SGT-Student","Singtel","/Ads/Telecom/b.jpg","16-10-2013","31-10-2013","Unlimited SMS","Telecom","no","no"));
		adsList.add(new Ads("SH-Student","StartHub","/Ads/Telecom/c.jpg","12-10-2013","31-12-2013","Local Calls","Telecom","no","no"));
		
		adsList.add(new Ads("Air Deals","AirShip.co","/Ads/A/a.jpg","12-10-2013","31-12-2013","Airplanes Flight Cheap","Airplanes","no","no"));
		
		adsList.add(new Ads("Boatz","BoBoats.com","/Ads/B/a.jpg","12-8-2013","31-12-2013","Bitan or Bali ?","Boats","no","no"));
		
		adsList.add(new Ads("CarNow","Toyota","/Ads/C/a.jpg","12-10-2013","31-12-2013","Cars deals now !","Cars","no","no"));
		
		adsList.add(new Ads("CheapDress","fashionOne","/Ads/D/a.jpg","12-7-2013","31-12-2013","Dress cheaper than ever","Dress","no","no"));
		
		adsList.add(new Ads("Tree3","EnvironTree","/Ads/E/a.jpg","12-9-2013","31-12-2013","Because we care","Environmental","no","no"));
		
		adsList.add(new Ads("FunnyGame32","Fun.com","/Ads/F/a.jpg","12-10-2013","31-12-2013","Fun for all","Fun","no","no"));
		
		adsList.add(new Ads("Ga3hr","GaGame","/Ads/G/a.jpg","12-10-2013","31-11-2013","Gathering for loved ones","Gatherings","no","no"));
		
		adsList.add(new Ads("HikeUpDown","Track.com","/Ads/H/a.jpg","12-10-2013","31-12-2013","Hiking like a king","Hiking","no","no"));
		
		adsList.add(new Ads("cream&ice","ColdStone","/Ads/I/a.jpg","12-10-2013","31-12-2013","Ice-cream on the rocks","Ice-cream","no","no"));
		
		adsList.add(new Ads("JogFit","Safra","/Ads/J/a.jpg","12-10-2013","31-12-2013","Jogging is Fun for you","Jogging","no","no"));
		
		adsList.add(new Ads("PopW-K","AnnoyningKpop","/Ads/K/a.jpg","12-10-2013","31-12-2013","K-pop with Ko-Boys","K-pop","no","no"));
		
		adsList.add(new Ads("Lazzee","La-laze.com","/Ads/L/a.jpg","12-10-2013","31-12-2013","Lazing ard on a sunday afternoon","Lazing ard","no","no"));
		
		adsList.add(new Ads("New Deals","anything.com","/Ads/N/a.jpg","12-10-2013","31-12-2013","New items now !","New items","no","no"));
		
		adsList.add(new Ads("Grandma's vase shop","StartHub","/Ads/O/a.jpg","12-10-2013","31-12-2013","Ornaments Good for you","Ornaments","no","no"));
		
		
		// part 2
		
		
		adsList.add(new Ads("Fligh Deal","AirShip.co","/Ads/A/b.jpg","12-10-2013","31-12-2013","Airplanes Flight Cheap","Airplanes","no","yes"));
		
		adsList.add(new Ads("Boats","BoBoats.com","/Ads/B/b.jpg","12-8-2013","31-12-2013","Bitan or Bali ?","Boats","no","yes"));
		
		adsList.add(new Ads("Car Now","Toyota","/Ads/C/b.jpg","12-10-2013","31-12-2013","Cars deals now !","Cars","no","yes"));
		
		adsList.add(new Ads("Dress Sale","fashionOne","/Ads/D/b.jpg","12-7-2013","31-12-2013","Dress cheaper than ever","Dress","no","yes"));
		
		adsList.add(new Ads("Trees","EnvironTree","/Ads/E/b.jpg","12-9-2013","31-12-2013","Because we care","Environmental","no","yes"));
		
		adsList.add(new Ads("Funny Game","Fun.com","/Ads/F/b.jpg","12-10-2013","31-12-2013","Fun for all","Fun","no","yes"));
		
		adsList.add(new Ads("Gaming","GaGame","/Ads/G/b.jpg","12-10-2013","31-11-2013","Gathering for loved ones","Gatherings","no","yes"));
		
		adsList.add(new Ads("Hiking","Track.com","/Ads/H/b.jpg","12-10-2013","31-12-2013","Hiking like a king","Hiking","no","yes"));
		
		adsList.add(new Ads("Ice Cream","ColdStone","/Ads/I/b.jpg","12-10-2013","31-12-2013","Ice-cream on the rocks","Ice-cream","no","yes"));
		
		adsList.add(new Ads("Be Fit","Safra","/Ads/J/b.jpg","12-10-2013","31-12-2013","Jogging is Fun for you","Jogging","no","yes"));
		
		adsList.add(new Ads("K Pop","AnnoyningKpop","/Ads/K/b.jpg","12-10-2013","31-12-2013","K-pop with Ko-Boys","K-pop","no","no"));
		
		adsList.add(new Ads("La Laze","La-laze.com","/Ads/L/b.jpg","12-10-2013","31-12-2013","Lazing ard on a sunday afternoon","Lazing ard","no","no"));
		
		adsList.add(new Ads("Newest Deals","anything.com","/Ads/N/b.jpg","12-10-2013","31-12-2013","New items now !","New items","no","no"));
		
		adsList.add(new Ads("Grandma Shop","StartHub","/Ads/O/b.jpg","12-10-2013","31-12-2013","Ornaments Good for you","Ornaments","no","no"));
	
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
		
		public static ArrayList<Ads> retrieveAllAds(){
			System.out.println("AdsManager:" + adsList.size());
			return adsList;
		}
		
		public static ArrayList<Ads> load(){
			for(Ads ads : adsList){
				if(ads.getSavedAd().equals("yes")){
				myAdsList.add(ads);
				}
			}
			if(myAdsList==null){
				return null;
			}else{
				return myAdsList;
			}
		}
		
		public static ArrayList<Ads> retrieveMyAds(){
			load();
			if(myAdsList==null){
				return null;
			}else{
				return myAdsList;
			}
		}
		
		public static ArrayList<Ads> addAd(String name){
			System.out.println("AdsManager" + name);
			for(Ads ad : adsList){
				if(ad.getName().equals(name)){
					myAdsList.add(ad);
					System.out.println("The add to be added:" + ad);
				}
			}
			System.out.println("AdsManager:" + myAdsList.size());
			return myAdsList;
		}
		
		public static ArrayList<Ads> removeAd(String name){
			for(Ads ad : adsList){
				if(ad.getName().equals(name)){
					myAdsList.remove(ad);
				}
			}
			return myAdsList;
		}
		
		public static String isSaved(Ads a){
			String value = "no";
			String name;
			String aName;
			for(Ads ads : myAdsList){
				name = ads.getName();
				aName = a.getName();
				if(name.equals(aName)){
					value = "yes";
				}
			}
			
			return value;
		}
		
		public static void clearArray(){
			adsList.removeAll(adsList);
			
		}
}
