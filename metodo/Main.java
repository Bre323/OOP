package metodo;

public class Main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.status();
		
		c1.setModelo("BIC Cristal");
		c1.setPonta(0.5f);
		
		c1.status();
	}
}
