package Final;

public class Visualizacao {

	//ATRIBUTOS
	private User espectador;
	private Video filme;
	
	
	
	//CONSTRUTOR
	public Visualizacao(User espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	
	
	//MÉTODOS
	public void avaliar() {
		this.filme.setAval(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAval(nota);
	}
	
	public void avaliar(float porcentagem) {
		int total = 0;
		if(porcentagem <= 20) {
			total = 3;
		}
		else if(porcentagem <= 50) {
			total = 5;
		}
		else if(porcentagem <= 90) {
			total = 8;
		} 
		else if(porcentagem > 90) {
			total = 10;
		}
		else {
			total = 0;
		}
		this.filme.setAval(total);
	}
	
	public String toString() {
		return "View (Espectador: " + this.espectador 
				+ ", Filme: " + this.filme + ")\n";
	}
	
	
	
	//GETTERS E SETTERS
	public User getEspectador() {
		return this.espectador;
	}
	
	public Video getFilme() {
		return this.filme;
	}
	
	public void setEspectador(User espectador) {
		this.espectador = espectador;
	}
	
	public void setFilme(Video filme) {
		this.filme = filme;
	}
}
