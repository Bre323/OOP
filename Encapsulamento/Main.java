package Encapsulamento;

public class Main {

	public static void main(String[] args) {
		
		Controle controle = new Controle();
	
		controle.ligar();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.play();
		controle.abrirMenu();
		controle.fecharMenu();
		controle.desligar();
	}

}
