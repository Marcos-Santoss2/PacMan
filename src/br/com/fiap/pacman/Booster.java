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
	
	public void habilidade(Player player){
		

		Timer timer = new Timer();
		
		setVisivel(false);
		player.setInvencivel(true);
		System.out.println("Invencivel");
		
		TimerTask TornarVencivel = new TimerTask() {
			 @Override
			    public void run() {
			        player.setInvencivel(false);
			        System.out.println("Vencivel");
			   };
		};
		
		timer.schedule(TornarVencivel, duracao);	
		
		}
	
	
	public int getDuracao() {
			return duracao;
		}

	public void setDuracao(int duracao) {
			this.duracao = duracao;
		}
		
		
		
	

}
