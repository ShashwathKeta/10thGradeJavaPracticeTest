import java.lang.System.*;

public class APCompSciTester {
	public void StarsAndStripes()
	   {
	   	  System.out.println("Shashwath Keta APCS 2017");
	   	  System.out.println();
	   	  System.out.println();
	      System.out.println("StarsAndStripes");
	      printTwoBlankLines();
	   }


	   public static void printTwentyStars()
	   {
	   	System.out.println("********************");
	   	
	   }

	   public static void printTwentyDashes()
	   {
	   	System.out.println("--------------------");
	   	
	   }

	   public static void printTwoBlankLines()
	   {
	   	System.out.println(); 
	   	System.out.println();
	   }
	   
	   public static void printASmallBox()
	   {
		   printTwentyDashes();
		   printTwentyStars();
		   printTwentyDashes();
		   printTwentyStars();
		   printTwentyDashes();
		   printTwentyStars();
		   printTwentyDashes();
	   }
	 
	   public static void printABigBox()
	   { 	
		   printTwentyDashes();
		   printTwentyStars();
		   printTwentyDashes();
		   printTwentyStars();
		   printTwentyDashes();
		   printTwentyStars();
		   printTwentyDashes(); 
		   printTwentyDashes();
		   printTwentyStars();
		   printTwentyDashes();
		   printTwentyStars();
		   printTwentyDashes();
		   printTwentyStars();
		   printTwentyDashes();
	   } 

	   	  
	  // end of class StarsAndStripes
	 public static void main(String args[])
	 {
	      
	      printASmallBox();
	      printTwoBlankLines();
	      printABigBox();
	   }
}
