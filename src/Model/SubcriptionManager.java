package Model;

import java.util.ArrayList;

public class SubcriptionManager {

	private static ArrayList<Subcription> subList;
	
	
	public SubcriptionManager(){
		 subList= new ArrayList<Subcription>();
		load();
	}
	
	
	
	
	public static void load(){
		Subcription b = new Subcription("John","Telecom");
		subList.add(b);
	}
	
	
	
	public static void updateSubcriptionManager(String user,ArrayList<String> subs){

		System.out.print("The value is sent");
		for(Subcription sub: subList){
			System.out.println(sub + " loops");
			System.out.println(user + " server name :" + sub.getUser());
			if(sub.getUser().equals(user)){
				sub.NewSubcription(subs);
				System.out.print("New sub created");
			}
		}
	}	
		
		public static Subcription getSub(String user){
			load();
			for(Subcription sub: subList){
				if(sub.getUser().equals(user)){
					return sub;
				}
			}
			return null;
		
	}
		
		
		
		public static void removeSub(String user){
		
			
			for(Subcription sub: subList){
			
				if(sub.getUser().equals(user)){
					sub.getSub().clear();
				}
			}
		}		
		
}
	
