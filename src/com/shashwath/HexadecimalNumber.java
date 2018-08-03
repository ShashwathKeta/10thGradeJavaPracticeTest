package com.shashwath;

import java.util.Scanner;

public class HexadecimalNumber {
	public static String hexadecimalConverter (int num) {
		String ans = "";
		while (num > 0) {
			int r = num % 16;
			num = num /16;
			if (r < 10) {
			ans = r + ans;
			}
			switch (r) {
			case 10: ans = ans + "a";
				break;
			case 11: ans = ans + "b";
				break;
			case 12: ans = ans + "c";
				break;
			case 13: ans = ans + "d";
				break;
			case 14: ans = ans + "e";
				break;
			case 15: ans = ans + "f";
				break;
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hexadecimal Number Converter");
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
				System.out.println(hexadecimalConverter(num) + " is the Hexadecimal version of " + num);
			}
		}
	}
}