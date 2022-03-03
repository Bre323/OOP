package Polimorfismo;

public class Canguru extends Mamifero {

	Canguru(String corPelo) {
		super(corPelo);
	}

	
	@Override
	public void locomover() {
		System.out.println("Saltando nas colinas...");
	}
	
	public void usarBolsa() {
		System.out.println("Usando bolsa...");
	}
}
