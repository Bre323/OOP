package intro;

public class Caneta {
	public String modelo;
	public String cor;
	protected float ponta;
	private int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor da caneta: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está Tampada? " + this.tampada);
		System.out.println("\n");
	}
	
	public void rabiscar() {
		if (this.tampada) {
			System.out.println("ERRO. Não posso rabiscar\n");
		} else {
			System.out.println("Rabiscando coisas...\n");
		}
		
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}
}
