package com.cursoemvideo.getscreensize;

import java.awt.*;

public class GetScreenSizeV2 {
	
	public static void main (String args[]) {
		
		Dimension dt = Toolkit.getDefaultToolkit().getScreenSize();
		
		int alt = (int)dt.getHeight();
		
		int lar = (int)dt.getWidth();
		
		System.out.println("A tela tem " + alt + " de altura por " + lar + " de largura");
				
	}
	
	}
	

