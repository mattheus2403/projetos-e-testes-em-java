package com.cursoemvideo.getscreensize;

import java.awt.*;

public class GetScreenSize {
	
	public static void main(String args[]) {
		
		Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
		
		int width = (int)dimensao.getWidth();
		int height = (int)dimensao.getHeight();
		
		System.out.println("A sua tela tem a dimensão de " + width + " X " + height);
		
	}
}