package br.com.fiap.pacman;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Ghost extends GameObject{
	
	
	private int direction;

	public Ghost() {
	}
	
	public Ghost(int x, int y, int direction) {
		setX(x);
		setY(y);
		this.direction = direction;
	}
	
public boolean verifica(){
		
		int x = getX();
		int y = getY();
		int d = getDirection();
		int t = getScreenSize();
		
		if (x + 10 < t && d == 90) {
			return true;
		} 
		if (x - 10 > 0 && d == 270) {
			return true;
		} 
		if (y + 10 > 0 && d == 0) {
			return true;
		} 
		if (y - 10 < t && d == 180) {
			return true;
		}
		
		return false;
		
		}
	
	
		public void move() {	
			
			if (verifica() == true){
				
				int delay = 1000;   // delay de 5 seg.
				int interval = 1000;  // intervalo de 1 seg.
				Timer timer = new Timer();

				timer.scheduleAtFixedRate(new TimerTask() {
				        public void run() {
				        	 
				        	 Random random = new Random(7);
							 setDirection(random.nextInt(3)); 
					
							
				        }
				    }, delay, interval);
				
				switch (getDirection()) {
				case 0: 
					setY(getY()-10);
				break;	
				case 90: 
					setX(getX()+10);
				break;	
				case 180: 
					setY(getY()+10);
				break;	
				case 270: 
					setX(getX()-10);	
				break;
				}
			}
			System.out.println("Ghost: " + getDirection());
		}
	

	public int getDirection() {
		return direction;
	}

	public void setDirection(int r) {
	
	switch(r) {
		case 0:
			this.direction = 0; 
			
		case 1:
			this.direction = 90;
		
		case 2:
			this.direction = 180;
		
		case 3:
			this.direction = 270;	
		
		}
}
		
}
