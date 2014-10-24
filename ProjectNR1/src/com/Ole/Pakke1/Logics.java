package com.Ole.Pakke1;

public class Logics {

	public boolean checkY(){
		if(player.bottomy >= Platform.py + 2) {
			player.changeY(-1);
			return false;
		}
		return true;
	}
	
	
		 public void Gravitycheck() {
			 if(player.bottomy != Platform.py && player.Jump == false) {
				player.changeY(2);
			}
		 }
			
		
			
	
	
	public boolean checkX() {
		if(player.leftx <= 0) {
			player.changeX(1);
		}
		if(player.rightx <= 0) {
			player.changeX(-1);
		}
		return false;
	}



}
