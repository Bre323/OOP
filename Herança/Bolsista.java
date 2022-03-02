package Herança;

public class Bolsista extends Aluno {

	private float bolsa;
	
	
	
	Bolsista(String n, int id, String sex, int mat, String c, float b) {
		super(n, id, sex, mat, c);
		this.setBolsa(b);
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + "Bolsa: " + this.bolsa + "\n";
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista!! Pagamento de bolsista realizado com sucesso!!\n");
	}
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome() + "\n");
	}
	
	
	
	public float getBolsa() {
		return this.bolsa;
	}
	
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
