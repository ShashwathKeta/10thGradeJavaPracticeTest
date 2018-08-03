package com.shashwath;

import java.util.Scanner;

public class RomanNumeralTranslator {
	public static int findRomanValue (char ch) {
		switch(ch) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default:
			System.out.println("Learn to be like like the romans");
			return 0;
		}
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Roman Numeral Translator");
		for (int k = 0; k < Integer.MAX_VALUE; k++) {
			System.out.println();
			System.out.print("Enter a Roman number ");
			String num = scan.nextLine();
			char [] romanNumeral = new char[num.length()];
			
			if (num.equals("0")) {
				System.out.println("Hasta La Vista Baby!");
				break;
			}
			else {
				for (int i = 0; i < num.length(); i++) {
					char character = num.charAt(i);
					romanNumeral[i] = character;
				}
				int baseTen = 0;
				for (int pos = 0; pos < romanNumeral.length-1; pos++) {
					int iValue = findRomanValue(romanNumeral[pos]);
					int iPlusValue = findRomanValue(romanNumeral[pos+1]);
					if (iValue >= iPlusValue) {
						baseTen = baseTen + iValue;
					}
					else {
						baseTen = baseTen - iValue;
					}
				}
				baseTen = baseTen + findRomanValue(romanNumeral[romanNumeral.length-1]);
				System.out.println("The base ten version of " + num + " is " + baseTen);
			}
		}
	}
}
