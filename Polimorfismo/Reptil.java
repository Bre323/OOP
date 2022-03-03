package Polimorfismo;

public class Reptil extends Animal {

	//ATRIBUTOS
	private String corEscama;
	
	
	//CONSTRUTOR
	Reptil(String corEscama) {
		this.setCorEscama(corEscama);
	}
	
	
	//MÉTODOS DA CLASSE
	@Override
	public void locomover() {
		System.out.println("Rastejando...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Fazendo som de um réptil...");
	}

	
	//GETTERS E SETTERS
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
}
