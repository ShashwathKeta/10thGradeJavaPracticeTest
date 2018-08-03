package com.shashwath;

import java.util.Scanner;

public class Base8Number {
	public static String baseEightConverter (int num) {
		String ans = "";
		while (num > 0) {
			int r = num % 8;
			num = num /8;
			ans = r + ans;
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Base Eight Number Converter");
		boolean finished = false;
		while (finished == false) {
			System.out.println();
			System.out.print("Enter a number ");
			int num = scan.nextInt();
			
			if (num == 0) {
				System.out.println("How could you kill me like this?");
				finished = true;
			}
			else {
				System.out.println(baseEightConverter(num) + " is the base eight version of " + num);
			}
		}
	}

}
