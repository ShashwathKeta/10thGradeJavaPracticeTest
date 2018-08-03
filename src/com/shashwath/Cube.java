package com.shashwath;

public class Cube {

	public Cube() {
		super();
		System.out.print("Number of cubes = " + cnt++ + "\n" );
	}
	
	static int cnt = 0;
	int length = 10;
	int breadth = 10;
	int height = 10;
	int shashwath;
	
	 
	
	public int getShashwath() {
		return shashwath;
	}


	public void setShashwath(int shashwath) {
		this.shashwath = shashwath;
	}


	public void setLength( int l ) {
		this.length = l;
	}
	
	
	public void setBreath( int b )
	{
		this.breadth = b;
	}
	
	public void setHeight( int h ) 
	{
		this.height = h;
	}
	
	public int getVolume()
	{
		return (length * breadth * height);
	}
	
	public int getSurfaceArea()
	{
		return (
				2 * length * height 
				+ 2 * height * breadth 
				+ 2 * length * breadth
				);
	}
	public static void main(String[] args) {
		Cube cubeObj; // Creates a Cube Reference
		
		cubeObj = new Cube(); // Creates an Object of Cube
		System.out.println("Volume of Cube is : " + cubeObj.getVolume());
		System.out.println("Surface Area of Cube is : " + cubeObj.getSurfaceArea());

	}
}
