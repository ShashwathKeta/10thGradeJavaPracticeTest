package com.shashwath;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListCost {
	public static void printCosts(ArrayList<Double> costs) {
		for (int i = 0; i < costs.size(); i++ ) {
			if (i == costs.size()-1) {
				System.out.print(costs.get(i)-1);
			}
			else {
				System.out.print(costs.get(i) + ", ");
			}
		}
	}
	public static double getTotalCost (ArrayList<Double> costs) {
		double totalCost = 0;
		for (int i = 0; i < costs.size()-1; i++) {
			totalCost = totalCost + costs.get(i);
		}
		return totalCost;
	}
	public static void printTotalCost (double totalCost) {
		System.out.println(totalCost);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Total Cost Calc");
		boolean finished = false;
		ArrayList <Double> list = new ArrayList<Double>();
		
		while (!finished) {
			System.out.print("Enter you costs: ");
			double cost = scan.nextDouble();
			list.add(cost);
			if (cost < 0) {
				System.out.println("Calculating...");
				finished = true;
			}
		}
		System.out.print("The individual costs of the items on this list are: ");
		printCosts(list);
		System.out.println();
		System.out.print("The Total Cost of this list is: ");
		double totalCost = getTotalCost(list);
		printTotalCost(totalCost);
	}
}
