package Herança;

public class Main {

	public static void main(String[] args) {
		
		Visitante v = new Visitante("Uwe", 11, "Masculino");
		System.out.println(v.toString() + "\n");
		
		Aluno a = new Aluno("Fulaninho", 22, "Masculino", 123123, "Medicina");
		System.out.println(a.toString());
		a.pagarMensalidade();
		
		Bolsista b = new Bolsista("Borsa", 22, "Masculino", 123125, "Informática", 199.99f);
		b.pagarMensalidade();
		System.out.println(b.toString());
		
		Tecnico t = new Tecnico("Joana", 30, "Feminino", 33333, "Cimento", 2323);
		t.pagarMensalidade();
		t.praticar();
		System.out.println(t.toString());
		
		Professor p = new Professor("Prof", 45, "Feminino", "Gastronomia", 6699.99f);
		System.out.println(p.toString());
		p.receberAumento(2000);
		
		Funcionario f = new Funcionario("Cleiton", 20, "Masculino", "RH", true);
		f.mudarTrabalho();
		System.out.println(f.toString());
	}
}
