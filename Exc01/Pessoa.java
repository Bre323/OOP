package Exc01;

public class Pessoa {
	
	//ATRIBUTOS
	private String nome;
	private int idade;
	private String sexo;
	
	
	
	//CONTRUTOR
	Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	
	
	//MÉTODOS
	public void dadosLeitor() {
		System.out.println("-----------DADOS DO LEITOR(A)-----------");
		System.out.println("Título: " + this.getNome());
		System.out.println("Autor: " + this.getIdade());
		System.out.println("Paginas: " + this.getSexo());
		System.out.println("-------------------------------------");
	}
	
	public void fazerNiver() {
		setIdade(getIdade() + 1);
		System.out.println("PARABÉNS PELOS SEUS " + this.idade + " ANOS, " + this.nome + "!!!");
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
