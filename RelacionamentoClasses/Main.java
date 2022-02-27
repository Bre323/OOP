package RelacionamentoClasses;

public class Main {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[8];
		l[0] = new Lutador("Fagner Silva", "Brasil", 29, 1.60f, 57.9f, 13, 2, 0);
		l[1] = new Lutador("Chriscolas Rage", "USA", 38, 1.80f, 73.5f, 10, 4, 1);
		l[2] = new Lutador("Arcade Rush", "Canada", 34, 1.75f, 65.5f, 9, 5, 4);
		l[3] = new Lutador("Aigonakurosh yu", "Japao", 23, 1.79f, 87.9f, 14, 1, 4);
		l[4] = new Lutador("Mario Zepelin", "Italia", 25, 1.90f, 99.8f, 6, 6, 5);
		l[5] = new Lutador("Crickson Raycie", "Brasil", 47, 1.76f, 78.6f, 17, 0, 1);
		l[6] = new Lutador("Tripa Tripoloski", "Russia", 36, 1.95f, 111.2f, 13, 2, 2);
		l[7] = new Lutador("Sumwer Oveduhray bow", "Jamaica", 28, 1.99f, 114.4f, 12, 3, 2);
		
		Luta MATCH01 = new Luta();
		Luta MATCH02 = new Luta();
			
		MATCH01.marcarLuta(l[0], l[5]);
		MATCH01.lutar();
		
		MATCH02.marcarLuta(l[6], l[7]);
		MATCH02.lutar();
		
		l[6].status();
		l[7].status();
	}
}
