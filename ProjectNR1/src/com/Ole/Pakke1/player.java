package com.Ole.Pakke1;



public class player {
	public static int leftx = 250;
	public static int topy = 10; 
	public static int rightx = leftx + 40;
	public static int bottomy = topy + 70;
	public static boolean Jump = false;
	static void changeX(int amount){
		leftx += amount;
		rightx += amount;
		
	}
	static void changeY(int amount){
		topy += amount;
		bottomy+= amount;
	}
}
