package com.shashwath;

import java.util.Scanner;
public class FullNameWelcome {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println();
		System.out.print("Enter Your First Name ");
		String firstName = scan.nextLine();
		System.out.print("Enter Your Last Name");
		String lastName = scan.nextLine();
		System.out.println();
		System.out.println("Welcome " + firstName + " " + lastName);
	}

}
