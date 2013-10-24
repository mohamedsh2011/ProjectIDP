package Controller;
import java.util.ArrayList;

import Model.*;

public class AdsController {

	
	
	public static ArrayList<Ads> retrieveAds(Subcription s){
		
		ArrayList<Ads> toSend = new ArrayList<Ads>();
		
		for(String subtype : s.getSub()){
			
			ArrayList<Ads> temp = new ArrayList<Ads>();
			temp = AdsManager.retrieveAds(subtype);
			for(Ads a:temp){
				toSend.add(a);
			}
		}
	
		return toSend;
	}
	
	public static ArrayList<Ads> retrieveAllAds(){
		ArrayList<Ads> allAds = AdsManager.retrieveAllAds();
		return allAds;
	}
	
	public static ArrayList<Ads> retrieveMyAds(){
		
		ArrayList<Ads> toSend = new ArrayList<Ads>();
		toSend = AdsManager.retrieveMyAds();
		
		return toSend;
	}	
	
	public static ArrayList<Ads> addAd(String name){
		System.out.println("AdsController:" + name);
		ArrayList<Ads> toSend = new ArrayList<Ads>();
		toSend = AdsManager.addAd(name);
		System.out.println("AdsController:" + toSend.size());
		
		return toSend;
	}	
	
	public static ArrayList<Ads> removeAd(String name){
		
		ArrayList<Ads> toSend = new ArrayList<Ads>();
		toSend = AdsManager.removeAd(name);
		
		return toSend;
	}	
	
	public static String isSaved(Ads a){
		String value = AdsManager.isSaved(a);
		return value;
	}
	
	public static void clearSavedAds(){
		AdsManager.clearSavedAds();
	}
	
}
