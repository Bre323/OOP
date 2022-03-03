package Polimorfismo;

public class Tartaruga extends Reptil {

	Tartaruga(String corEscama) {
		super(corEscama);
	}
	
	
	@Override
	public void locomover() {
		System.out.println("Rastejando devagarinho por aí...");
	}
}
