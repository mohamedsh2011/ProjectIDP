package Model;
import java.util.ArrayList;
public class UserManager {

static private ArrayList<User> userList = new ArrayList<User>();



	public UserManager(){

		userList.add(new User("John","123"));
		
	}
	
	
	private static ArrayList<User> retrieveAll (){
		
		return userList;
	}
	
	public  static User retrieveUser(String name){
		
		for(User A : userList)
			if(A.getUsername().equals(name)){
				return A;
			}
				
		return null;
	}

}
