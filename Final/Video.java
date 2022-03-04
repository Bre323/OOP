package Final;

public class Video implements AcaoVideo {
	
	//ATRIBUTOS
	private String titulo;
	private int aval;
	private int likes;
	private int views;
	private boolean reproduzindo;
	
	
	
	//CONSTRUTOR
	Video(String titulo) {
		this.titulo = titulo;
		this.aval = 0;
		this.likes = 0;
		this.views = 0;
		this.reproduzindo = false;
	}

	
	
	//MÉTODOS
	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.likes++;
	}
	
	@Override
	public String toString() {
		return "Título: " + this.titulo + "\nAvaliação: " 
				+ this.aval + "\nLikes: " + this.likes + "\nViews: " 
				+ this.views + "\nEsta Reproduzindo >>> " +this.reproduzindo + "\n";
	}

	
	
	//GETTERS
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getAval() {
		return this.aval;
	}
	
	public int getLikes() {
		return this.likes;
	}
	
	public int getViews() {
		return this.views;
	}
	
	public boolean getReproduzindo() {
		return this.reproduzindo;
	}
	
	
	
	//SETTERS
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAval(int aval) {
		int novaAval;
		novaAval = (int) ((this.aval + aval)/this.views);
		this.aval = novaAval;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public void setViews(int views) {
		this.views = views;
	}
	
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
}
