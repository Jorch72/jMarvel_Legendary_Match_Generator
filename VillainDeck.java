
public class VillainDeck {
	private Card villains[] = new Card[7];
	private Card henchmen[] = new Card[4];
	private int maxVill, maxHench, selectedVill, selectedHench;

	public VillainDeck() {
		villains[0] = new Card("Hydra");
		villains[1] = new Card("Spider-Foes");
		villains[2] = new Card("Radiation");
		villains[3] = new Card("Brotherhood of Mutants");
		villains[4] = new Card("Skrulls");
		villains[5] = new Card("Enemies of Asgard");
		villains[6] = new Card("Masters of Evil");

		henchmen[0] = new Card("Savage Land Mutates");
		henchmen[1] = new Card("Doombot Legion");
		henchmen[2] = new Card("Sentinels");
		henchmen[3] = new Card("Hand Ninjas");

		this.check();
	}

	private void check() {
		this.selectedHench = 0;
		this.selectedVill = 0;
		for (Card hench : henchmen) {
			if (hench.getIsAvaible() == 1) {
				this.selectedHench++;
			}
		}
		for (Card vill : villains) {
			if (vill.getIsAvaible() == 1) {
				this.selectedVill++;
			}
		}
	}
	
	public void setMaxes(int maxVill, int maxHench){
		this.maxVill=maxVill;
		this.maxHench=maxHench;
	}
	
	public boolean villReady(){
		this.check();
		System.out.println("MaxVill: " + this.maxVill + ", Selected: " + this.selectedVill);
		if(this.selectedVill==this.maxVill){
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getselVil(){
		return this.selectedVill;
	}
	
	public boolean henchReady(){
		this.check();
		System.out.println("MaxHench: " + this.maxHench + ", Selected: " + this.selectedHench);
		if(this.selectedHench==this.maxHench){
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getselHench(){
		return this.selectedHench;
	}

	public void setVillain(int id) {
		if (villains[id].getIsAvaible() == 0) {
			villains[id].setCard(1);
		} else {
			villains[id].setCard(0);
		}
	}

	public void setHenchmen(int id) {
		if (henchmen[id].getIsAvaible() == 0) {
			henchmen[id].setCard(1);
		} else {
			henchmen[id].setCard(0);
		}
	}

	public String getVillainName(int id) {
		return villains[id].getName();
	}

	public String getHenchmenName(int id) {
		return henchmen[id].getName();
	}

	public Card getVillain(int id) {
		return villains[id];
	}

	public Card getHenchmen(int id) {
		return henchmen[id];
	}

	public int getVillainCount() {
		return villains.length;
	}

	public int getHenchCount() {
		return henchmen.length;
	}

	public int getVillainAvaible(int id) {
		return villains[id].getIsAvaible();
	}

	public int getHenchmenAvaible(int id) {
		return henchmen[id].getIsAvaible();
	}
}
