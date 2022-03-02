package Heran�a;

public abstract class Pessoa {
	
	//ATRIBUTOS
	private String nome;
	private int idade;
	private String sexo;
	
	
	//M�TODOS
	public String toString() {
		return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo();
	}
	
	public final void fazerNiver() {
		setIdade(getIdade() + 1);
		System.out.println("PARAB�NS PELOS SEUS " + this.idade + " ANOS, " + this.nome + " !!!");
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
}
