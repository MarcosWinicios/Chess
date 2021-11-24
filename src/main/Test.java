package main;

public class Test {
	public static void main(String[] args) {
		User user = User.getUser();
		User user2 = user.getUser();
		
		System.out.println(user);
		System.out.println(user2);
	}
}
