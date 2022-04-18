package br.com.fiap.pacman;

import java.util.Random;

public class Ghost extends GameObject{
	
	Random random = new Random();
	
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
				
				switch (direction) {
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
		}
	

	public int getDirection() {
		return direction;
	}

	public void setDirection() {

	switch(random.nextInt(3)) {
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
