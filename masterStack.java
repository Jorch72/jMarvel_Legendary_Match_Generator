
public class masterStack {
	private int masterChosen=0;
	private Card[] master = new Card[4];

	public masterStack() {
		master[0] = new Card("Red Skull", 0);
		master[1] = new Card("Doctor Doom", 1);
		master[2] = new Card("Magneto", 2);
		master[3] = new Card("Loki", 3);
	}

	public int getMaster() {
		return masterChosen;
	}
	
	public String printMaster() {
		System.out.println(this.getMaster() + ": " + master[this.getMaster()].getName());
		return master[masterChosen].getName();
	}

	public void setMaster(Card card) {
		this.masterChosen = card.getIsAvaible();
	}

	public void setMaster(int index) {
		masterChosen = index;
		/*for (Card card : master) {
			card.setAvaible(index);
		}*/
	}
	
	public Card getCard(int index){
		return master[index];
	}
	
	public String getCardName(int index){
		return master[index].getName();
	}
}
