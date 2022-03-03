package Polimorfismo2;

public class Cachorro extends Lobo {

	@Override
	public void emitirSom() {
		System.out.println("AU AU!!");
	}
	
	public void reagir(String frase) {
		if(frase.equals("toma comida") || frase.equals("Oi")) {
			System.out.println("O cachorro está abanando o rabo e latindo");
		}
		else {
			System.out.println("O cachorro está rosnando");
		}
	}
	
	public void reagir(int hora) {
		if(hora < 12) {
			System.out.println("O cachorro está abanando o rabo");
		}
		else if(hora >= 18) {
			System.out.println("O cachorro está ignorando as pessoas");
		}
		else {
			System.out.println("O cachorro está abanando o rabo e latindo");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("O cachorro está abanando o rabinho para o dono!!");
		}
		else {
			System.out.println("O cachorro está rosnando e latindo para o desconhecido!!");
		}
	}
	
	public void reagir(int idade, float peso) {
		if(idade < 5) {
			if(peso < 10) {
				System.out.println("O cachorro está abanando o rabo!");
			}
			else {
				System.out.println("O cachorro está latindo!");
			}
		}
		
		else {	
			if(peso < 10) {
				System.out.println("O cachorro está rosnando!");
			}
			else {
				System.out.println("O cachorro está ignorando todo mundo!");
			}
		}
	}
	
}
