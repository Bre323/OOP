package Polimorfismo2;

public class Mamifero extends Animal {

	protected String corPelo;
	
	@Override
	public void emitirSom() {
		System.out.println("Fazendo o som que um mamífero faz...");
	}
}
