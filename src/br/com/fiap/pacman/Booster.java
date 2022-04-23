package br.com.fiap.pacman;
import java.util.Timer;
import java.util.TimerTask;

import br.com.fiap.pacman.Player;

public class Booster extends Item{
	
	int duracao;
	Player player  = new Player();
	
	public Booster() {
		
	}
	
	public Booster(int x, int y, int duracao) {
		setX(x);
		setY(y);
		setDuracao(duracao);
		
	}
	
	public void boosterSkill(Player player){
		
		Timer timer = new Timer();
		
		setVisivel(false);
		player.setInvencivel(true);
		System.out.println("Habilidade Ativada");
		
		timer.schedule(new TimerTask() {
		    public void run() {
		    	System.out.println("Habilidade Desativada");
		        player.setInvencivel(false);
		   };
	}, duracao);	
		
		}
	
	
	public int getDuracao() {
			return duracao;
		}

	public void setDuracao(int duracao) {
			this.duracao = duracao;
		}
		
		
		
	

}
