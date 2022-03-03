package Polimorfismo;

public class Aguia extends Ave {

	Aguia(String corPenas) {
		super(corPenas);
	}

	
	@Override
	public void alimentar() {
		System.out.println("Capturando uns pintinhos andando pelos lugares...");
	}
}
