public class Match_Gen {

	public static void main(String[] args) {
		
		HeroDeck heroes = new HeroDeck();
		VillainDeck villains = new VillainDeck();
		gameSetting settings = new gameSetting();
		

		new MainFrame(heroes, villains, settings);
	}

}
