package Polimorfismo;

public abstract class Animal {

	//ATRIBUTOS
	protected float peso;
	protected int idade;
	protected int membros;
	
	//MÉTODOS
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
}
