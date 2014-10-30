package com.Ole.Pakke1;

public class Logics {

	public boolean checkY(){
		if(player.bottomy >= Platform.py && player.leftx <  Platform.pxRight) {
			player.changeY(-1);

			return false;
		}
		/*if( player.leftx <  Platform.pxRight) {
			player.changeY(1);
			return false;
		}
		*/
		return true;
	}


	public void Gravitycheck() {
		
			player.changeY(1);
		

	}
	/*public void fallcheck() {
			 if(player.leftx < Platform.pxRight) {
				 player.changeY(1);
			 }
		 }
	 */




	public boolean checkX() {
		if(player.leftx <= 0) {
			player.changeX(1);
		}
		if(player.rightx >= 1074d) {
			player.changeX(-1);
		}
		return false;
	}



}
