package com.shashwath;

import java.awt.Toolkit;
import java.util.Scanner;

public class Beeper {
	
	boolean buttonPushed = true;
	
	
	public boolean isButtonPushed() {
		return buttonPushed;
	}


	public void setButtonPushed(boolean buttonPushed) {
		this.buttonPushed = buttonPushed;
	}


	public static void main(String[] args) {
		
		Beeper b = new Beeper();
		
		while (b.isButtonPushed()) {
			try {
				System.out.println ( "first line - inside try block" );
				Thread.sleep(20 * 1000);
				Toolkit.getDefaultToolkit().beep();
				Scanner keyboard = new Scanner(System.in);
				
				if (keyboard.nextLine() != null) {
					b.setButtonPushed(false);

					System.out.println ( "inside key pressed" );
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				System.out.println ( "exception happened" );

			}

			System.out.println ( "last line in while loop" );
		}

		System.out.println ( "Outside while loop" );
	}
	
	

}
