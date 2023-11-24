package edu.alexey.service;

public class AppRunner {

	public static void main(String[] args) {
		var userService = new UserService();
		System.out.println("Hello World");
		System.out.println(userService.getUser(25L));
	}

}
