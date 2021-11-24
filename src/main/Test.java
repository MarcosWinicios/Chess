package main;

public class Test {
	public static void main(String[] args) {
		User user = User.getUser("Marcos", "99999999", "marcos@gmail.com");
		
		User user2 = User.getUser("João", "88888888", "joao@gmail.com");
		
		System.out.println(user.name); //Marcos
		System.out.println(user2.name); //Marcos
		
		user2.name = "Pedro";
		
		System.out.println(user.name);//Pedro
		System.out.println(user2.name);//Pedro
	}
}
