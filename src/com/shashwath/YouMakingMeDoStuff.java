package com.shashwath;
import java.lang.System.*;

public class YouMakingMeDoStuff {
	public static void main(String[] args) {
		int aNum = 7;
		aNum = aNum%3;
		System.out.println(aNum);
		int bNum = 11;
		bNum = bNum *2;
		System.out.println(bNum);
		int cNum = 9;
		cNum ++;
		System.out.println(cNum);
		System.out.println(3+2*3);
		System.out.println(Math.sqrt(36));
		System.out.println(Math.floor(8.99));
		System.out.println(Math.ceil(8.99));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.round(8.5));
		double dNum = 8.0;
		dNum = dNum + 2;
		System.out.println(dNum);
		int eNum = 9, fNum = 8;
		int gNum = eNum + fNum;
		double hNum = gNum;
		System.out.println(hNum);
		int kNum = 9;
		kNum = kNum+5;
		System.out.println(kNum);
		System.out.println(Math.pow(Math.sqrt(9), 2));

		
		try {
			int divByzeroTest = 27/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Divide by zero threw exception");
			e.printStackTrace();
		}
		
		char aChar = 'B';
		System.out.println(aChar + 2);
		double oNum = 2/3;
		System.out.println(oNum);
		System.out.println(5%3);
		System.out.println(1/4);
		System.out.println(12.7%3);
		
	}
}
