package com.shashwath;

public class MultiplicationTables {
	
		    public static void main(String[] args) {
		    	long a = System.currentTimeMillis();
		    	
		    	int number;
		    	for ( number=1; number<=12; number++  ) {

		    		printMultiplicationTable(number); 
		    		
			       
		    	}  
		    	long b = System.currentTimeMillis();

	    		System.out.println("Time of Operation is: " );
			      
	    		System.out.format("%d" , b - a);
		    }
		
		    public static void printMultiplicationTable(int n) {
		       System.out.println("Multiplication table for "+n);
		
		       System.out.println("---------------------------");
		
		       for(int i = 1; i<=12;i++) {
		
		           System.out.format("%2d x %d = %3d\n", i,n,i*n);
		
		       }
		       
		
		    }
		
		     
		
		}


