package com.shashwath;

import java.util.Scanner;

public class TablePractice {
	public static String [][] makerFiller(int rows, int columns){
		int x;
		int y;
		
		String [][] practice1 = new String [rows][columns];
		for(x=0; x<rows; x++) {
			for(y=0; y<columns; y++) {
				practice1[x][y]="";
			}
		}
		return practice1;
	}
	
	public static String[][] assignment(String [][] array, String thingy, int row, int column){
		array[row][column] = thingy;
		return array;
	}
	
	public static String[][] assignAll(String[][] practice1){
		practice1 = assignment(practice1, "Boys", 0, 0);
		practice1 = assignment(practice1, "Liam", 0, 1);
		practice1 = assignment(practice1, "Noah", 0, 2);
		practice1 = assignment(practice1, "Lucas", 0, 3);
		practice1 = assignment(practice1, "Mason", 0, 4);
		practice1 = assignment(practice1, "Oliver", 0, 5);
		practice1 = assignment(practice1, "Logan", 0, 6);
		practice1 = assignment(practice1, "Ethan", 0, 7);
		practice1 = assignment(practice1, "Elijah", 0, 8);
		practice1 = assignment(practice1, "Aiden", 0, 9);
		practice1 = assignment(practice1, "James", 0, 10);
		practice1 = assignment(practice1, "Girls", 1, 0);
		practice1 = assignment(practice1, "Emma", 1, 1);
		practice1 = assignment(practice1, "Olivia", 1, 2);
		practice1 = assignment(practice1, "Ava", 1, 3);
		practice1 = assignment(practice1, "Sophia", 1, 4);
		practice1 = assignment(practice1, "Isabella", 1, 5);
		practice1 = assignment(practice1, "Mia", 1, 6);
		practice1 = assignment(practice1, "Amelia", 1, 7);
		practice1 = assignment(practice1, "Charlotte", 1, 8);
		practice1 = assignment(practice1, "Harper", 1, 9);
		practice1 = assignment(practice1, "Aria", 1, 10);
		return practice1;
	}
	
	public static void printBoys(String[][] array, int rows, int columns) {
		int x;
		
		for(x=0;x<columns;x++) {
			System.out.println(x + ". " + array[0][x]);
		}
	}
	
	public static void printGirls(String[][] array, int rows, int columns) {
		int x;
		
		for(x=0;x<columns;x++) {
			System.out.println(x + ". " + array[1][x]);
		}
	}
	
	public static void printStarter(String[][] array, int rows, int columns) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What letter would you like to search");
		String letter = scan.next();

		for(int j = 0; j<columns; j++) {
			String name = array[0][j];
			char[] character = new char[name.charAt(1)];
			String charact = "" + character;
			if(charact == letter) {
				System.out.println(array[0][j]);
			}
			
			for(int k = 0; k<columns; k++) {
				String name1 = array[1][j];
				char[] character1 = new char[name1.charAt(1)];
				String charact1 = "" + character1;
				if(charact1 == letter) {
					System.out.println(array[1][j]);
				}
			}
		}
	}
	
	public static void main(String args[]) {
		String [][] practice1 = makerFiller(2,11);
		practice1 = assignAll(practice1);
		printStarter(practice1, 2, 11);
	}
}
