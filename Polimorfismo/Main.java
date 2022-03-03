package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero("Preto");
		Reptil r = new Reptil("Verde");
		Peixe p = new Peixe("Azul");
		Ave a = new Ave("Branco");
		Canguru can = new Canguru("Marrom");
		Cachorro dog = new Cachorro("Branco");
		Cobra cob = new Cobra("Verde");
		Tartaruga tar = new Tartaruga("Verde");
		Crocodilo cro = new Crocodilo("Roxo");
		Goldfish go = new Goldfish("Gold");
		Arara ara = new Arara("Vermelho");
		Aguia ag = new Aguia("Laranja");
		Bemtevi bem = new Bemtevi("Amarelo");
		
		
		
		m.alimentar();
		r.alimentar();
		p.alimentar();
		a.alimentar();
		
		m.locomover();
		r.locomover();
		p.locomover();
		a.locomover();
		
		m.emitirSom();
		r.emitirSom();
		p.emitirSom();
		a.emitirSom();
		
		p.soltarBolhas();
		a.fazerNinho();
		
		
		can.locomover();
		can.usarBolsa();
		
		dog.emitirSom();
		dog.enterrarOsso();
		dog.abanarRabo();
		
		tar.locomover();
		
		cro.alimentar();
		go.alimentar();
		ara.alimentar();
		ag.alimentar();
		
		cob.emitirSom();
		bem.emitirSom();
	}
}
