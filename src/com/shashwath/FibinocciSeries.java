package com.shashwath;

public class FibinocciSeries{
	
	public static void main(String[] args) {
		
		FibinocciSeries fs = new FibinocciSeries ();
		int[] resSeries;
		
		resSeries = fs.calculatefib(17);
		
		for(int i=0; i< resSeries.length; i++) {
			System.out.println ( resSeries[i] );
		}
		

	}
	
	/*
	 * This function calculates the Fibbonachi series
	 * Input: The length of the series
	 */
	public int[] calculatefib (int finalPosition) {
		
		 int[] x = new int[finalPosition];
		 
		x[0]=0;
		x[1]=1;
		 
		for(int pos = 2; pos<=finalPosition-1; pos++ ) {
			x[pos]= x[pos-2] + x[pos-1];
			// System.out.format ( "%d \n" , x[pos] );
		}
		 
		 return x;
	}

	/*
	 * This function prints the array with one node per line 
	 */
	public void printFibOneElementPerLine( int[] x ) {
		for(int i=0; i< x.length; i++) {
			System.out.println ( x[i] );
		}
	}
	
	/*
	 * This function prints the array in [1, 2, 3...]
	 */
	public void printFibAsArray (int[] x) {
		
		System.out.format("[" + x[0]);
		// System.out.format("[");
		
		//for ( int i : x) {
		for (int i = 1; i< x.length; i++) {
			System.out.format( "," + i);	
		}
		
		System.out.format("]");
	}
}
