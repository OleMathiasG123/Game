package com.Ole.Pakke1;





public  class Game implements Runnable{
	boolean Running = false;
	
	jframe Frame;

	Thread thread = new Thread(this);
	
	public static void main(String []args) {
		new Game();

	}



	public Game() {
		Frame = new jframe();

		thread.start();
	}

	@Override
	public void run() 
	{
		System.out.println("STARTED");

		Running = true;

		while(Running) {
			Frame.p.repaint();
		}
	}



}





