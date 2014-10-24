package com.Ole.Pakke1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

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

	public jpanel(){
		l = new Logics();
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		setBackground(Color.BLACK);
		
		
	
	}
	public void LoadSprite() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource("Sprite.png"));
		width = image.getWidth(null);
		height = image.getHeight(null);
		visible = true;
		x = 100;
		y = 300;
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		l.checkY();
		l.checkX();
		l.Gravitycheck();
		g.clearRect(0, 0, jframe.WIDTH*jframe.SCALE, jframe.HEIGHT*jframe.SCALE);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, jframe.WIDTH*jframe.SCALE, jframe.HEIGHT*jframe.SCALE);
		
		g.setColor(Color.BLUE);
		
		g.fillRect(Platform.px, Platform.py, Platform.px2-Platform.px,Platform.py2-Platform.py);
		g.fillRect(player.leftx, player.topy, player.rightx-player.leftx, player.bottomy-player.topy);
		
		
	}

}


