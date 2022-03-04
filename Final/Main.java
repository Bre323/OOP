package Final;

public class Main {

	public static void main(String[] args) {
		
		Video vod[] = new Video[5];
		vod[0] = new Video("Comprei morango e olha no que deu!!");
		vod[1] = new Video("Batman");
		vod[2] = new Video("Gameplay livestream");
		vod[3] = new Video("The Beatles at Rock am Ring 2021");
		vod[4] = new Video("One Piece Special EP 3564");
		
		User user[] = new User[2];
		user[0] = new User("Fulaninho", 20, "Masculino", "flanela.300");
		user[1] = new User("Micalateia", 23, "Feminino", "Micalla");
		
		Visualizacao view = new Visualizacao(user[1], vod[4]);
		view.avaliar(100.0f);
		Visualizacao view2 = new Visualizacao(user[1], vod[0]);
		view2.avaliar();
		
		System.out.println(vod[3].toString());
		System.out.println(user[0].toString());
		System.out.println(user[1].toString());
		System.out.println(view.toString());
		System.out.println(view2.toString());
	}
}
