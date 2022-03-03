package Polimorfismo;

public class Mamifero extends Animal {
	
	//ATRIBUTOS
	private String corPelo;

	
	//CONSTRUTOR
	Mamifero(String corPelo) {
		this.setCorPelo(corPelo);
	}
	
	
	//FUNÇÕES DA CLASSE
	@Override
	public void locomover() {
		System.out.println("Correndo...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo o que um mamífero come...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Fazendo som de um mamífero...");
	}

	
	//GETTERS E SETTERS
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
