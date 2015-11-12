
public class schemeStack {
	private int schemeChosen;
	private Card[] scheme = new Card[8];

	public schemeStack() {
		scheme[0] = new Card("Unleash the Power of the Cosmic Cube");
		scheme[1] = new Card("Super Hero Civil War");
		scheme[2] = new Card("Portals to Dark Dimensions");
		scheme[3] = new Card("Negative Zone Prison Breakout");
		scheme[4] = new Card("The Legacy Virus");
		scheme[5] = new Card("Secret Invasion of the Skrull Shapeshifters");
		scheme[6] = new Card("Replace Earth's Leaders with Killbots");
		scheme[7] = new Card("Midtown Bank Robbery");
	}

	public int getScheme() {
		return schemeChosen;
	}

	public void setScheme(int index) {
		schemeChosen = index;
		/*
		 * for (Card card : scheme) { card.setAvaible(index); }
		 */
	}

	public void setScheme(Card card) {
		this.schemeChosen = card.getIsAvaible();
	}
	
	public String getCardName(int index){
		return scheme[index].getName();
	}
	
	public String printScheme(){
		System.out.println(this.schemeChosen + ": " + this.getCardName(this.schemeChosen));
		return scheme[schemeChosen].getName();
	}
}
