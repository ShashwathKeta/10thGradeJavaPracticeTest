package com.shashwath;

public class StartHere {

	public static void main(String[] args) {
		
		FibinocciSeries fs = new FibinocciSeries ();
		int[] resSeries;
		
		resSeries = fs.calculatefib(1000);
		fs.printFibAsArray(resSeries);
		
	}
}
