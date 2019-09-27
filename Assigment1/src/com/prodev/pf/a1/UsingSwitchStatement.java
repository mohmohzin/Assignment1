package com.prodev.pf.a1;

import java.util.Scanner;

public class UsingSwitchStatement {
	public static void main(String[] args) {
		/*
		 * TODO : Replace If statement with Switch Statement
		 */
		int grade;

		Scanner read = new Scanner(System.in);
		System.out.print("Enter Your Grade : ");
		grade = read.nextInt();

		// start
		if (grade > 0 && grade < 5) {
			System.out.println("Your in Basic Level");
		} else if (grade > 5 && grade < 8) {
			System.out.println("Your in Middle Level");
		} else if (grade > 8 && grade < 12) {
			System.out.println("Your in High Level");
		} else {
			System.out.println("Your Grade is  Unsupported");
		}
		// end

		read.close();
	}
}
