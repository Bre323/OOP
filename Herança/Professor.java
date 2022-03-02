package Herança;

public class Professor extends Pessoa {
	
	//ATRIBUTOS
	private String especialidade;
	private float salario;

	
	//CONSTRUTOR
	Professor(String nome, int idade, String sexo, String spec, float salario) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setEspecialidade(spec);
		this.setSalario(salario);
	}
	
	
	//MÉTODOS
	@Override
	public String toString() {
		return super.toString() + "\nEspecialidade: " + this.especialidade + "\nSalário: " + this.salario + "\n";
	}
	
	public void receberAumento(float aumento) {
		this.setSalario(this.getSalario() + aumento);
		System.out.println("SEU SALÁRIO AUMENTOU!!");
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Aumento de " + aumento + "\n");
	}
	
	
	//GETTERS
	public String getEspecialidade() {
		return this.especialidade;
	}
	
	public float getSalario() {
		return this.salario;
	}
	
	
	//SETTERS
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
