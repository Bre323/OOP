package Exc01;

public class Livro implements Publicação{
	
	//ATRIBUTOS
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	//CONSTRUTOR
	Livro(String titulo, String autor, int totalPaginas, int pagAtual, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.leitor = leitor;
	}
	
	
	
	//FUNÇÕES DA CLASSE
	public void detalhes() {
		System.out.println("--------------DETALHES---------------");
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Paginas: " + this.totalPaginas);
		System.out.println("Página Atual: " + this.pagAtual);
		System.out.println("Aberto: " + this.aberto);
		System.out.println("Leitor: " + this.leitor.getNome());
		System.out.println("-------------------------------------");
	}
	
	@Override
	public void abrir() {
		setAberto(true);
	}
	
	@Override
	public void fechar() {
		setAberto(false);
	}
	
	@Override
	public void folhear(int pag) {
		if(getAberto()) {	
			if(pag > getTotalPaginas()) {
				setPagAtual(getTotalPaginas());
			}
			else if(pag < 0) {
				setPagAtual(0);
			}
			else {
				setPagAtual(pag);	
			}
		}
		
		else {
			System.out.println("IMPOSSÍVEL FOLHEAR COM O LIVRO FECHADO!!!");
		}
	}
	
	@Override
	public void nextPage() {
		if(getAberto()) {
			setPagAtual(getPagAtual() + 1);
		}
		
		else {
			System.out.println("IMPOSSÍVEL AVANÇAR PÁGINA COM O LIVRO FECHADO!!!");
		}
	}
	
	@Override
	public void prevPage() {
		if(getAberto()) {
			setPagAtual(getPagAtual() - 1);
		}
		
		else {
			System.out.println("IMPOSSÍVEL VOLTAR PÁGINA COM O LIVRO FECHADO!!!");
		}
	}
	
	

	//GETTERS
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getTotalPaginas() {
		return this.totalPaginas;
	}
	
	public int getPagAtual() {
		return this.pagAtual;
	}
	
	public boolean getAberto() {
		return this.aberto;
	}
	
	public Pessoa getLeitor() {
		return this.leitor;
	}
	
	
	
	//SETTERS
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
}
