package main;

public class User {
	public String name;
	public String phone;
	public String email;
	
	private static User instance = null;
	
	private User(String name, String phone, String email) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	private User() {}
	public static User getUser (String name, String phone, String email) {
		if(instance == null)
			instance =  new User(name, phone, email);
		return instance;
	}
}
