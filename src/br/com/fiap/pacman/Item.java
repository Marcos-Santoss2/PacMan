package br.com.fiap.pacman;

public class Item extends GameObject {

	private boolean visivel;

	
	
	Item(){
		
	}
	
	Item(int x, int y){
		
		setX(x);
		setY(y);
		
	}
		
	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}
	
}
