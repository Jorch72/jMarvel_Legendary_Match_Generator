
public class Card {
	String name;
	int isAvaible;  // if hero/villain card:  0: Not Chosen / 1: Chosen / 2- : Expansion
					// if scheme/master card: index of the chosen card

	public Card() {
		this.name = "blank";
		this.isAvaible = 2;
	}
	
	public Card(String name) {
		this.name = name;
		this.isAvaible = 0;
	}

	public Card(String name, int isAvaible) {
		this.name = name;
		this.isAvaible = isAvaible;
	}

	public void setCard() {
		if(isAvaible==0) {
			isAvaible=1;
		}
		else {
			isAvaible=0;
		}
	}

	public void setCard(String name, int isAvaible) {
		this.name = name;
		this.isAvaible = isAvaible;
	}

	public void setCard(int isAvaible) {
		this.isAvaible = isAvaible;
	}

	public String getName() {
		return this.name;
	}

	public int getIsAvaible() {
		return this.isAvaible;
	}
	
	public void setAvaible(int index){
		this.isAvaible=index;
	}

}
