package com.shashwath;

import java.util.Scanner;

public class BaseTwoNumbers {
	public static String binaryConverter (int num) {
		String ans = "";
		while (num > 0) {
			int r = num % 2;
			num = num/2;
			ans = r + ans;
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Binary Number Converter");
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
				System.out.println(binaryConverter(num) + " is the binary version of " + num);
			}
		}
	}
}