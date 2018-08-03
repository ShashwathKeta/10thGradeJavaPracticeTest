/**
 * 
 */
package com.shashwath;

/**
 * @author Shash
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cube c = new Cube();
		
		c.setHeight(4);
		c.setBreath(9);
		c.setLength(5);
		
		
		// int cubeVolume = c.getVolume();
		
		System.out.print("Hello volume of cube: " + c.getVolume() );
	}

}
