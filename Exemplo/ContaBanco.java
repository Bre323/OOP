package Exemplo;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	ContaBanco(){
		this.saldo = 0;
		this.status = false;
	}
	
	
	//ESTADO DA CONTA
	public void estadoConta() {
		System.out.println("___________________________");
		System.out.println("Conta: " + this.numConta);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	
	//ABRIR E FECHAR CONTA
	public void abrirConta(String tipo) {
		this.tipo = tipo;
		this.setStatus(true);
		
		if (tipo == "cc") {
			setSaldo(50);
			System.out.println("Conta Corrente criada com sucesso");
		}
		else if (tipo == "cp") {
			System.out.println("Conta Poupança criada com sucesso");
			setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		}
		else if(this.getSaldo() < 0) {
			System.out.println("Conta em débito");
		}
		else {
			this.setStatus(false);
			System.out.println("A conta foi fechada");
		}
	}
	
	
	
	//OPERAÇÕES BANCÁRIAS
	public void depositar(float valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + this.dono + " >>> " + valor + "$");
		}
		else {
			System.out.println("ERROR");
		}
	}
	
	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() > valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.dono + " >>> " + valor + "$");
			}
			else {
				System.out.println("Saldo Insuficiente");
			}
		}
		else {
			System.out.println("Impossível fazer o saque! >>> Conta fechada");
		}
	}
	
	public void pagarMensal() {
		float v = 0;
		
		if (this.tipo == "cc") {
			v = 12;
		}
		else if (this.tipo == "cp") {
			v = 20;
		}
		
		if (this.getStatus()) {
			if (this.getSaldo() > 0) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga >>> valor = " + v);
			}
			else {
				System.out.println("Saldo Insuficiente!");
			}
		}
		else {
			System.out.println("Impossível pagar a mensalidade >>> Conta fechada");
		}
	}

	
	
	//GETTERS
	public String getDono() {
		return this.dono;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	
	
	//SETTERS
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
}
