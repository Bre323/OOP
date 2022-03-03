package Polimorfismo;

public class Crocodilo extends Reptil {

	Crocodilo(String corEscama) {
		super(corEscama);
	}

	
	@Override
	public void alimentar() {
		System.out.println("Comendo uns animais indefesos por aí...");
	}
}
