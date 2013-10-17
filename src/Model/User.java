package Model;
public class User {
	
String username ;
String password ;



public User (String usernameA,String passwordA){
	username = usernameA;
	password = passwordA;

}

public String getUsername(){
	return username;
}

public String getPassword(){
	return password;
}

public void setPassword(String passwordA){
	password = passwordA;
}


		

}
