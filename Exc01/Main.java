package Exc01;

public class Main {
	
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] b = new Livro[5];
		
		p[0] = new Pessoa("Fred", 25, "Masculino");
		p[1] = new Pessoa("Mary", 28, "Feminino");
		p[2] = new Pessoa("Amanda", 19, "Feminino");
		
		b[0] = new Livro("Parry Hotter", "R.K Jowling", 702, 0, p[0]);
		b[1] = new Livro("Jercy Packson", "Riork", 400, 50, p[0]);
		b[2] = new Livro("Java", "Javaboss", 254, 120, p[1]);
		b[3] = new Livro("Dojo Mojo", "Jojeorge", 1232, 700, p[2]);
		b[4] = new Livro("One Pizza", "Anonymous", 455, 200, p[2]);
		
		
		b[0].abrir();
		b[0].folhear(34);
		b[0].prevPage();
		b[0].detalhes();
	}
}
