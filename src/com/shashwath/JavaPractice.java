package com.shashwath;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream("image.png");
		try {
			Image logo = ImageIO.read(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		BufferedImage img = null;
		String imageFileName = "C:\\Users\\Shash\\workspace\\TestExample\\src\\image.png";
		try {
			System.out.println("Loading image: C:\\Users\\Shash\\workspace\\TestExample\\src\\image.png ");
		    img = ImageIO.read(new File(imageFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		int x = 0;
		int y = 0;

		int imageWidth = img.getWidth();
		int imageHeight = img.getHeight();
		
		JFrame oframe = new JFrame();

		JLabel olblimage = new JLabel(new ImageIcon(imageFileName));
		oframe.getContentPane().add(olblimage, BorderLayout.CENTER);
		oframe.setSize( 616, 614);
		oframe.setVisible(true);

		
		for (x = 0; x < imageWidth-2; x++) {
			for ( y = 0; y < imageHeight-2; y++) {

				int clr = img.getRGB(x, y);
				int red = (clr & 0x00ff0000) >> 16;
				int green = (clr & 0x0000ff00) >> 8;
				int blue = clr & 0x000000ff;
				@SuppressWarnings("unused")
				int argb = red << 16 + green << 8 + blue;
				if (red > 150) {
					img.setRGB(x, y, new Color(255, 0, 0, 127).getRGB());
				}
			} // End of for loop y		
		} // End of for loop x
		
		JFrame frame = new JFrame();

		JLabel lblimage = new JLabel(new ImageIcon(img));
		frame.getContentPane().add(lblimage, BorderLayout.CENTER);
		frame.setSize( 616, 614); 
		frame.setVisible(true);
	}

}
	
