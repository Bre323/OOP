package intro;

public class Class {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "McLaren";
		c2.cor = "Preta";
		c2.status();
		c2.destampar();
		c2.rabiscar();
	}

}
