package Polimorfismo;

public class Ave extends Animal {
	
	//ATRIBUTOS
	private String corPenas;

	
	//CONSTRUTOR
	Ave(String corPenas) {
		this.setCorPenas(corPenas);
	}
	
	
	//MÉTODOS DA CLASSE
	@Override
	public void locomover() {
		System.out.println("Voando...");
	}

	@Override
	public void alimentar() {
		System.out.println("Se alimentando de frutas...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Fazendo som de uma ave...");
	}

	public void fazerNinho() {
		System.out.println("Ninho feito!!");
	}
	
	
	//GETTERS E SETTERS
	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}

}
