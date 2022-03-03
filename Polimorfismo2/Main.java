package Polimorfismo2;

public class Main {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Lobo l = new Lobo();
		Cachorro c = new Cachorro();
		
		m.emitirSom();
		l.emitirSom();
		c.emitirSom();
		
		c.reagir("Oi");
		c.reagir("Qual foi?");
		
		c.reagir(true);
		c.reagir(false);
		
		c.reagir(15);
		c.reagir(11);
		c.reagir(19);
		
		c.reagir(12, 8);
		c.reagir(3, 4);
		c.reagir(12, 13);
		c.reagir(4, 11);
	}
}
