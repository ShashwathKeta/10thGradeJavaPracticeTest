package com.shashwath;

public class TrimMusicProgram {
	public static void printMusic (int [] samples, String title) {
		System.out.println(title);
		for (int i = 0; i < samples.length-1; i ++) {			
			if (i == samples.length-2) {
				System.out.println(samples[i]);
			}
			else {
				System.out.print(samples[i] + ", ");
			}
		}
	}
	public static void trimNoise (int [] samples, int amplitude) {
		for (int i = 0; i < samples.length-1; i++) {
			if (samples[i] > amplitude) {
				samples[i] = amplitude;
			}
			if ( samples [i] < -amplitude) {
				samples[i] = -amplitude;
			}
		}
	}
	public static void main(String args[]) {
		int [] samples = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
		
		printMusic(samples, "Original Music");
		System.out.println();
		trimNoise(samples, 2000);
		printMusic(samples, "Corrected Music");
	}
}
