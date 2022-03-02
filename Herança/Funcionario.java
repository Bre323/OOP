package Herança;

public class Funcionario extends Pessoa {

	//ATRIBUTOS
	private String setor;
	private boolean trabalhando;
	
	
	//CONSTRUTOR
	Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setSetor(setor);
		this.setTrabalhando(trabalhando);
	}
	
	
	//MÉTODOS
	@Override
	public String toString() {
		return super.toString() + "\nSetor: " + this.setor + "\nTrabalhando: " + this.trabalhando + "\n";
	}
	
	public void mudarTrabalho() {
		this.setTrabalhando(!getTrabalhando());
	}
	
	
	//GETTERS
	public String getSetor() {
		return this.setor;
	}
	
	public boolean getTrabalhando() {
		return this.trabalhando;
	}
	
	
	//SETTERS
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
}
