package Polimorfismo;

public class Peixe extends Animal {

	//ATRIBUTOS
	private String corEscama;
	
	
	//CONSTRUTOR
	Peixe(String corEscama) {
		this.setCorEscama(corEscama);
	}
	
	
	//MÉTODOS DA CLASSE
	@Override
	public void locomover() {
		System.out.println("Continue a nadar...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo comidas que vagam pelo mar...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som!");
	}
	
	public void soltarBolhas() {
		System.out.println("*glub glub*");
	}

	
	//GETTERS E SETTERS
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
