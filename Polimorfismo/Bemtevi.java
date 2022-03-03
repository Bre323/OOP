package Polimorfismo;

public class Bemtevi extends Ave {

	Bemtevi(String corPenas) {
		super(corPenas);
	}
	

	@Override
	public void emitirSom() {
		System.out.println("Bem-te-viiii!");
	}
}
