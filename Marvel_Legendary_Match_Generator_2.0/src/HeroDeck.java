
public class HeroDeck {
	private Card[] content = new Card[15];
	private int maxHeroes, selectedHeroes;

	public HeroDeck() {
		content[0] = new Card("Wolverine");
		content[1] = new Card("Emma Frost");
		content[2] = new Card("Storm");
		content[3] = new Card("Gambit");
		content[4] = new Card("Rogue");
		content[5] = new Card("Cyclops");
		content[6] = new Card("Deadpool");
		content[7] = new Card("Spiderman");
		content[8] = new Card("Thor");
		content[9] = new Card("Captain America");
		content[10] = new Card("Iron Man");
		content[11] = new Card("Black Widow");
		content[12] = new Card("Hulk");
		content[13] = new Card("Hawkeye");
		content[14] = new Card("Nick Fury");
		this.check();
	}

	private void check() {
		this.selectedHeroes = 0;
		for (Card hero : content) {
			if(hero.getIsAvaible()==1){
				this.selectedHeroes++;
			}
		}
	}
	
	public void setMaxHero(int maxHeroes){
		this.maxHeroes=maxHeroes;
	}
	
	public boolean isReady(){
		this.check();
		System.out.println("Max heroes: " + this.maxHeroes+ ", Selected: " + this.selectedHeroes);
		if(this.maxHeroes==this.selectedHeroes){
			return true;
		}
		else {
			return false;
		}
	}

	public void setHero(int id, int isAvaible) {
		content[id].setCard(isAvaible);
	}

	public void setHero(int id) {
		if (content[id].getIsAvaible() == 0) {
			content[id].setCard(1);
		} else {
			content[id].setCard(0);
		}
	}

	public String getHeroName(int id) {
		return content[id].getName();
	}

	public int getHeroAvaible(int id) {
		return content[id].getIsAvaible();
	}

	public int getHeroCount() {
		return content.length;
	}

	public Card getCard(int id) {
		return content[id];
	}
}
