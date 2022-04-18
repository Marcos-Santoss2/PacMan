package br.com.fiap.pacman;


public class Player extends GameObject{
	
	private int direction;
	private int life;
	
	
	public Player() {
	}
	
	public Player(int x, int y, int direction) {
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

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	
	
	

}
