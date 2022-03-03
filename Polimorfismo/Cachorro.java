package Polimorfismo;

public class Cachorro extends Mamifero {

	Cachorro(String corPelo) {
		super(corPelo);
	}

	
	@Override
	public void emitirSom() {
		System.out.println("Au Au!");
	}
	
	public void enterrarOsso() {
		System.out.println("Osso enterrado com sucesso!");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o rabo...");
	}
}
