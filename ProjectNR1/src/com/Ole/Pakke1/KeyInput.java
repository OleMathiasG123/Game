package com.Ole.Pakke1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {

	public static boolean Keys;
	jpanel panel;

	public KeyInput(jpanel p){
		panel = p;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		int KeyCode = e.getKeyCode();

		
		
			
			

		switch(KeyCode){
		case KeyEvent.VK_A:
			
			player.changeX(-1);
			break;
		case KeyEvent.VK_D:
			
			player.changeX(1);
			break;

		case KeyEvent.VK_S:
			
			player.changeY(1);
			break;


		}
		panel.repaint();

	}

	@Override
	public void keyReleased(KeyEvent arg0) {


	}

	@Override
	public void keyTyped(KeyEvent arg0) {


	}

}
