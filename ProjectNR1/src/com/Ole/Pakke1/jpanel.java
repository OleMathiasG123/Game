package com.Ole.Pakke1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class jpanel extends JPanel {

	private static final long serialVersionUID = 1L;
Logics l;
int width;
int height;
boolean visible;
int x;
int y;
public Image image;
BufferedImage sprite;


	public jpanel()  {
		l = new Logics();
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		setBackground(Color.BLACK);
		try {
		 sprite =  ImageIO.read(new File(getClass().getResource("Sprite.png").toURI()));
		}
		catch(Exception e) {
			System.out.println("ekfmekfnmkef");
		}
	
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//l.fallcheck();
		
		l.checkY();
		l.checkX();
		l.Gravitycheck();
		g.clearRect(0, 0, jframe.WIDTH*jframe.SCALE, jframe.HEIGHT*jframe.SCALE);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, jframe.WIDTH*jframe.SCALE, jframe.HEIGHT*jframe.SCALE);
		
		g.setColor(Color.BLUE);
		
		g.fillRect(Platform.px, Platform.py, Platform.pxRight-Platform.px,Platform.pyBottom-Platform.py);
		//g.setColor(Color.BLACK);
		//g.fillRect(player.leftx, player.topy, player.rightx-player.leftx, player.bottomy-player.topy);
		g.drawImage(sprite,player.leftx, player.topy, player.rightx-player.leftx, player.bottomy-player.topy, null, null);
		
	}

}


