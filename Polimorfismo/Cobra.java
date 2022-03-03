package Polimorfismo;

public class Cobra extends Reptil {

	Cobra(String corEscama) {
		super(corEscama);
	}

	
	@Override
	public void emitirSom() {
		System.out.println("ssssssssss...");
	}
}
