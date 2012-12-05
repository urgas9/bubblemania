package main;

import objects.Bubble;

public class ThreadMoveBubbles extends Thread {
	@Override
	public void run()
	{
		while (GameState.running) {
			try {
				for (Bubble b : GameState.bubbles){
					b.move();
					if(GameState.state==1)
						b.move();
					if(b.isOut(GameState.t_bg)){	//If bubble gets out of terrain
						//TODO remove bubble from list, this just hides it!!!
						b.show=false;
					}
				}

				Thread.sleep(30);
			} catch (Exception e) {
			}
		}
	}
}

