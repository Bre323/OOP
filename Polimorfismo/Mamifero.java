package Polimorfismo;

public class Mamifero extends Animal {
	
	//ATRIBUTOS
	private String corPelo;

	
	//CONSTRUTOR
	Mamifero(String corPelo) {
		this.setCorPelo(corPelo);
	}
	
	
	//FUN��ES DA CLASSE
	@Override
	public void locomover() {
		System.out.println("Correndo...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo o que um mam�fero come...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Fazendo som de um mam�fero...");
	}

	
	//GETTERS E SETTERS
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
