package Encapsulamento;

public class Controle implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	//CONSTRUTOR
	Controle() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	
	
	//FUN��ES DO CONTROLE
	@Override
	public void ligar() {
		if(getLigado()) {
			System.out.println("Ja est� ligado");
		}
		else {
			this.setLigado(true);
		}
	}
	
	@Override
	public void desligar() {
		if(!getLigado()) {
			System.out.println("Ja est� desligado");
		}
		else {
			this.setLigado(false);
		}
	}
	
	@Override
	public void abrirMenu() {
		if(getLigado()) {
			System.out.println("Ligado: " + this.getLigado());
			System.out.print("Volume: " + this.getVolume() + " ");
			
			for(int i = 0; i < this.getVolume(); i += 10) {
				System.out.print("=");
			}
			
			System.out.println("\nTocando: " + this.getTocando());
		}
		else {
			System.out.println("Imposs�vel abrir Menu!");
		}
	}
	
	@Override
	public void fecharMenu() {
		if(getLigado()) {
			System.out.println("MENU FECHADO!!");
		}
		else {
			System.out.println("Imposs�vel fechar menu!");
		}
	}
	
	@Override
	public void aumentarVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		} 
		else {
			System.out.println("Imposs�vel aumentar volume!");
		}
	}
	
	@Override
	public void diminuirVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		} 
		else {
			System.out.println("Imposs�vel diminuir volume!");
		}
	}
	
	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}
	
	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}
	
	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		else {
			System.out.println("Imposs�vel reproduzir!");
		}
	}
	
	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		else {
			System.out.println("Imposs�vel pausar!");
		}
	}
	
	
	//GETTERS
	public int getVolume() {
		return this.volume;
	}
	
	public boolean getLigado() {
		return this.ligado;
	}
	
	public boolean getTocando() {
		return this.tocando;
	}
	
	
	
	//SETTERS
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
}
