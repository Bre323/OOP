package Herança;

public class Aluno extends Pessoa {

	//ATRIBUTOS
	private int matricula;
	private String curso;
	
	
	//CONSTRUTOR
	Aluno(String nome, int idade, String sexo, int matricula, String curso) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setMatricula(matricula);
		this.setCurso(curso);
	}


	//MÉTODOS
	@Override
	public String toString() {
		return super.toString() + "\nMatricula: " + this.matricula + "\nCurso: " + this.curso + "\n";
	}
	
	public void cancelarMatricula() {
		System.out.println("MATRÍCULA CANCELADA!!");
	}
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do " + this.getNome() + "\n");
	}
	
	
	
	//GETTERS
	public int getMatricula() {
		return this.matricula;
	}
	
	public String getCurso() {
		return this.curso;
	}
	
	
	
	//SETTERS
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
