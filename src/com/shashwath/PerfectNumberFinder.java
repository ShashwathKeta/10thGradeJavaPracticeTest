package com.shashwath;

import java.util.Scanner;

public class PerfectNumberFinder {
	public static boolean perfectFinder(int num) {
		int count = 0;
		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0) {
				count = count + i;
			}
		}
		if (count == num) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Perfect Number Finder");
		boolean finished = false;
		while (!finished) {
			System.out.println();
			System.out.print("Enter a number ");
			int num = scan.nextInt();
			
			if (num == 0) {
				System.out.println("How could you kill me like this?");
				finished = true;
			}
			
			if (perfectFinder(num) == true) {
				System.out.println(num + " is a perfect number");
			}
			else if (perfectFinder(num) == false) {
				System.out.println(num + " is not a perfect number");
			}
		}
	}
}
