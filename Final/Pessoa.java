package Final;

public abstract class Pessoa {
	
	//ATRIBUTOS
	protected String nome;
	protected int idade;
	protected String sexo;
	protected int xp;
	
	
	
	Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.xp = 0;
	}
	
	
	
	//MÉTODO
	public void ganharXP() {
		this.xp++;
	}
	
	
	
	//GETTERS
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public int getXP() {
		return this.xp;
	}
	
	
	
	//SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setXP(int xp) {
		this.xp = xp;
	}
}
