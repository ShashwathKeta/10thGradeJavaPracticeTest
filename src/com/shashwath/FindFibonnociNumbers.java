package com.shashwath;

import java.util.Scanner;
public class FindFibonnociNumbers {
	public static long [] findFibonociNumbers(int length) {
		long [] fibArray = new long[length];
		fibArray [0] = 1;
		fibArray [1] = 1;
		
		for (int i = 2; i <= fibArray.length-1; i++) {
			fibArray[i] = fibArray[i-2] + fibArray[i-1];
		}
		return fibArray;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Fibinoci Finder");
		boolean finished = true;
		while (finished = true) {
			System.out.println();
			System.out.print("How many fibinocci number would you like to know ");
			int length = scan.nextInt();
			
			if(length == 0) {
				System.out.println("Why do you have to kil me like this?");
				finished = false;
				break;
			}
			else {
				long [] fibArray = findFibonociNumbers(length);
		
				System.out.println("The first " + length + " fibinocci numbers are ");
				for (int i = 0; i < fibArray.length; i++) {
					System.out.println(fibArray[i]);
			}
		}
		}
	}
}

