package RelacionamentoClasses;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	//CONSTRUTOR
	Lutador(String no, String nac, int id, float h, float w, int v, int d, int e) {
		setNome(no);
		setNacionalidade(nac);
		setIdade(id);
		setAltura(h);
		setPeso(w);
		setVitorias(v);
		setDerrotas(d);
		setEmpates(e);
	}
	
	
	     
	//FUNÇÕES DA CLASSE
	public void apresentar() {
		System.out.println("IIIIIIIIIIITS TIIIIIIIIIME!!!!!");
		System.out.println("*gangsta's paradise starts to play*");
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("Pesando " + this.getPeso() + "kg e " + this.getAltura() + " de altura");
		System.out.println("Eu apresento-lhes o " + this.getNome());
	}
	
	public void status() {
		System.out.println("-------------STATUS-------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade() + " anos");
		System.out.println("Altura: " + this.getAltura() + "m");
		System.out.println("Peso: " + this.getPeso() + "kg");
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Vitorias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
		System.out.println("--------------------------------");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	 
	
	//GETTERS
	public String getNome() {
		return this.nome;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public int getVitorias() {
		return this.vitorias;
	}
	
	public int getDerrotas() {
		return this.derrotas;
	}
	
	public int getEmpates() {
		return this.empates;
	}
	
	
	
	//SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public void setCategoria() {
		if(this.peso > 52.2 && this.peso <= 56.7) {
			this.categoria = "Peso Mosca";
		}
		else if(this.peso > 56.7 && this.peso <= 61.2) {
			this.categoria = "Peso Galo";
		}
		else if(this.peso > 61.2 && this.peso <= 65.8) {
			this.categoria = "Peso Pena";
		}
		else if(this.peso > 65.8 && this.peso <= 70.3) {
			this.categoria = "Peso Leve";
		}
		else if(this.peso > 70.3 && this.peso <= 77.1) {
			this.categoria = "Peso Meio-Médio";
		}
		else if(this.peso > 77.1 && this.peso <= 83.9) {
			this.categoria = "Peso Médio";
		}
		else if(this.peso > 83.9 && this.peso <= 92.9) {
			this.categoria = "Peso Meio-Pesado";
		}
		else if(this.peso > 92.9 && this.peso <= 120.2) {
			this.categoria = "Peso Pesado";
		}
		else if(this.peso < 52.2 || this.peso > 120.2) {
			this.categoria = "Inválido";
		}
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
