package Model;

import java.util.ArrayList;

public class Subcription {

	private String user;
	private ArrayList<String> Subs = new ArrayList<String>();


	public Subcription(String a , String b){
		user = a;
		Subs.add(b);
	}
	
	public void NewSubcription(ArrayList<String> a){
		Subs = a;
	}
	
	public String getUser(){
		return user;
	}
	
	public ArrayList<String> getSub(){
		return Subs;
	}

}