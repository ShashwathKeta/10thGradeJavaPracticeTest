package com.shashwath;

import java.util.Scanner;

public class LetterGradeFinder {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Letter Grade Finder");
		System.out.println();
		System.out.print("Enter your Grade ");
		double grade = scan.nextDouble();
		
		if (grade > 95) {
			System.out.println("Your letter grade is an A");
		}
		else if (grade <= 94 && grade >= 87) {
			System.out.println("Your letter grade is a B");
		}
		else if (grade <= 86 && grade >= 75) {
			System.out.println("Your letter grade is a C");
		}
		else if (grade <= 74 && grade >= 70) {
			System.out.println("Your letter grade is a D");
		}
		else if (grade <= 69) {
			System.out.println("You Failed.");
		}
	}
}
