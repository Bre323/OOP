package Final;

public class User extends Pessoa {
	
	//ATRIBUTOS
	private String login;
	private int totalAssistido;
	
	
	
	//CONSTRUTOR
	User(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totalAssistido = 0;
	}
	
	
	
	//MÉTODOS
	public void verVideo() {
		System.out.println("Vendo video....");
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nIdade: " 
				+ this.idade + "\nSexo: " + this.sexo + "\nTotal de XP: " 
				+ this.xp + "\nLogin: " +this.login + "\nVideos assistidos: " + this.totalAssistido + "\n";
	}

	
	
	//GETTERS E SETTERS
	public String getLogin() {
		return login;
	}

	public int getTotalAssistido() {
		return totalAssistido;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}
}
