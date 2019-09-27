package com.prodev.pf.a1;

import java.util.Scanner;

public class UsingDoWhy {
	public static void main(String[] args) {
		/*
		 * TODO : Use DoWhile Loop
		 * Make a loop wih do while that request to user insert correct password
		 * stop loop when user insert correct password "Prohibere"
		 */
		
		String password = "Prohibere";
		String userPassword;
		Scanner scanner = new Scanner(System.in);
		
		//start
		System.out.println("Enter the exit password : ");
		userPassword = scanner.nextLine();
		if(userPassword.equalsIgnoreCase(password))
			System.out.println("You Correct");
		else
			System.out.println("Your password not correct! Try Again.");
		//end
			
			
		
		scanner.close();

	}
}
