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
	
	
	
	
	
}
