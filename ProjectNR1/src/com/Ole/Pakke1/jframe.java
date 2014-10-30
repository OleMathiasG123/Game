package com.Ole.Pakke1;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JFrame;

public class jframe extends JFrame{
	public static final int WIDTH = 360;
	public static final int HEIGHT = 240;
	public static final int SCALE = 3;
	public static int FRAMEFPS = 0;
	public static int Nothing = 0;
	public static final Dimension dimension = new Dimension(WIDTH * SCALE, HEIGHT * SCALE);
	
	public int x = 20;
	public int y = 20;
	
	public jpanel p;
	
	
	public jframe() {
		
		new JFrame();
		
		 setTitle("Game " + "FPSCount: " + FRAMEFPS);
		 setSize(dimension);
		 setResizable(false);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 setLocationRelativeTo(null);
		 getContentPane().setBackground(Color.GRAY);
		 
		 p = new jpanel();
		 addKeyListener(new KeyInput(p));
		 add(p);
		 //if (Nothing == 0) {
			 //add(new jpanel());
			 //Nothing ++;
		 }

	 

	 
	//public void Update() {
		//add(new jpanel());
	
}
	 

	
	

	


