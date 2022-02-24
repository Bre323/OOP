package Exemplo;

public class Main {

	public static void main(String[] args) {
		
		ContaBanco conta = new ContaBanco();
		conta.numConta = 1234;
		conta.setDono("Fulaninho");
		conta.abrirConta("cp");
		
		ContaBanco conta2 = new ContaBanco();
		conta2.numConta = 3213;
		conta2.setDono("Cleiton");
		conta2.abrirConta("cc");
		
		ContaBanco conta3 = new ContaBanco();
		conta3.setDono("Ciclano");
		
		
		//conta.estadoConta();
		//conta2.estadoConta();
		//conta3.estadoConta();
		
		conta.depositar(350);
		conta.pagarMensal();
		conta2.sacar(30);
		conta2.pagarMensal();
		
		conta.estadoConta();
		conta2.estadoConta();
	}

}
