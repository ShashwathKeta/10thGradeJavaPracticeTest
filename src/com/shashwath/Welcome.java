package com.shashwath;

import java.util.Scanner;

public class Welcome {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome");
	System.out.println();
	System.out.print("Enter Your First Name ");
	String name = scan.nextLine();
	System.out.println();
	System.out.println("Welcome " + name);
	}
}
