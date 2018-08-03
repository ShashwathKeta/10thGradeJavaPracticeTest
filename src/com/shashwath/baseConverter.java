package com.shashwath;

import java.util.Scanner; 

public class baseConverter {
	public static int hexadecimalConverter (String num) {
		
		char [] number = new char [num.length()];
		int length = num.length();
		
		int answer = 0;
		
		for (int i = length-1; i >= 0; i = i - 1) {
			number[i] = num.charAt(i);
			switch (number[i]) {
				case 'I': 
					if (number[i] <= number [i+1]) {
						answer = answer + 1; 
					}
					else {
						answer = answer - 1;
					}
					continue;
				case 'V': 
					answer = answer + 5; continue;
				case 'X': 
					answer = answer + 10; continue;
				case 'L': 
					answer = answer + 50; continue;
				case 'C': 
					answer = answer + 100; continue;
				case 'D': 
					answer = answer + 500; continue;
				case 'M': 
					answer = answer + 1000; continue;
				default:
					System.out.println("Oops: I just got to" + answer + " " + number[i]); break;
			}
		}
		
		return answer;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("type what you want to be converted ");
		String num = scan.nextLine();
		
		System.out.println( hexadecimalConverter(num) );
	}
}
