package com.shashwath;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNames {
	public static void printNames (ArrayList<String> names) {
		for (int i = 0; i < names.size(); i++) {
			if (i == names.size()-1) {
				System.out.print(names.get(i));
			}
			else {
				System.out.print(names.get(i)+ ", ");
			}
		}
	}
	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList<String>();
		boolean finished = false;
		Scanner scan = new Scanner(System.in);
		
		while (!finished) {
			System.out.print("Type in a name: ");
			String name = scan.nextLine();
			if (name.equals("print")) {
				finished = true;
			}
			else {
				names.add(name);
			}
		}
		printNames(names);
	}
}