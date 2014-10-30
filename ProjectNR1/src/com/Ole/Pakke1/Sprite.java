package com.Ole.Pakke1;

import java.awt.Image;
import java.awt.image.BufferedImage;


import java.io.*;

import javax.imageio.ImageIO;


public class Sprite {
	
	public Sprite() throws IOException{
		BufferedImage image = ImageIO.read(new File("Sprite.png"));
	}
	
	

}
