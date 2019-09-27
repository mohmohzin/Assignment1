package com.prodev.pf.a1;

public class UseStringInput {
	public static void main(String[] args) {
		int amountOfCopy;
		String text;

		/*
		 * TODO : Create a new scanner object 
		 * Just want to get the two value of
		 * "amountOfCopy" and "text" from User Input with scanner
		 * Remove the comment that already done for you
		 * 
		 */

		// System.out.print("Enter the Text : ");
		text = "Hello,Sir!";
		// System.out.print("Enter the Amount of Copy : ");
		amountOfCopy = 10;

		while (amountOfCopy > 0) {
			System.out.println(amountOfCopy + " : " + text);
			amountOfCopy--;
		}

	}
}
