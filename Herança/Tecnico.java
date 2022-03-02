package Heran�a;

public class Tecnico extends Aluno {
	
	private int registro;
	
	
	
	Tecnico(String n, int id, String s, int mat, String c, int reg) {
		super(n, id, s, mat, c);
		this.setRegistro(reg);
	}

	
	
	@Override
	public String toString() {
		return super.toString() + "Registro: " + this.registro + "\n";
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " � de curso t�cnico!! Pagamento de curso t�cnico de " + this.getNome() + " realizado com sucesso!!\n");
	}
	
	public void praticar() {
		System.out.println(this.getNome() + " est� praticando o que aprendeu em " + this.getCurso() + "\n");
	}
	
	
	
	public int getRegistro() {
		return this.registro;
	}
	
	public void setRegistro(int registro) {
		this.registro = registro;
	}
}
