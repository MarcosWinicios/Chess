package main;

public class User {
	private static String name;
	private static String phone;
	private static String email;
	
	private static User instance = null;
	
	private User(String name, String phone, String email) {
		User.name = name;
		User.email = email;
		User.phone = phone;
	}
	
	private User() {}
	
	public static User getUser () {
		if(instance == null)
			instance =  new User();
		return instance;
	}
}
