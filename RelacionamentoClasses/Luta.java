package RelacionamentoClasses;

import java.util.Random;

public class Luta {
	
	//ATRIBUTOS
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	
	//FUNÇÕES DA CLASSE
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		}
		else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar() {
		
		if(this.getAprovada()) {
			System.out.println("=============DESAFIADO=============");
			this.desafiado.apresentar();
			System.out.println("=============DESAFIANTE============");
			this.desafiante.apresentar();
			System.out.println("\n");
			this.desafiado.status();
			System.out.println("\n");
			this.desafiante.status();
			System.out.println();
			
			Random random = new Random();
			int winner = random.nextInt(3);
			
			switch(winner) {
				case 0: //EMPATOU A LUTA
					System.out.println("EMPATE!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				
				case 1: //VITÓRIA DO DESAFIADO
					System.out.println(this.desafiado.getNome() + " WINS!!!");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					
				case 2: //VITTÓRIA DO DESAFIANTE
					System.out.println(this.desafiante.getNome() + " WINS!!!");
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
			}
		} 
		
		else {
			System.out.println("A luta não pode acontecer");
		}
	}
	
	
	
	//GETTERS
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	
	public int getRounds() {
		return this.rounds;
	}
	
	public boolean getAprovada() {
		return this.aprovada;
	}
	
	
	
	//SETTERS
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
