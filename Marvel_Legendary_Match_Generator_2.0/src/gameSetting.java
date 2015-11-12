public class gameSetting {
	private int numberOfPlayers = 0;
	private int numberOfHeroes = 0;
	private int numberOfVillains = 0;
	private int numberOfHenchmen = 0;
	private int numberOfSchemeTwists = 0;
	private int numberOfBystanders = 0;
	masterStack masters = new masterStack();
	schemeStack schemes = new schemeStack();

	public gameSetting() {

	}

	public void setPlayers(int players) {
		this.numberOfPlayers = players;
	}

	public int getPlayers() {
		return this.numberOfPlayers;
	}

	public masterStack getMasters() {
		return masters;
	}
	
	public String printMaster() {
		return masters.printMaster();
	}

	public schemeStack getScheme() {
		return schemes;
	}
	
	public String printScheme() {
		return schemes.printScheme();
	}

	public void setHeroes(int numberOfHeroes) {
		this.numberOfHeroes = numberOfHeroes;
	}

	public int getHeroes() {
		return this.numberOfHeroes;
	}

	public void setVillains(int numberOfVillains) {
		this.numberOfVillains = numberOfVillains;
	}

	public int getVillains() {
		return this.numberOfVillains;
	}

	public void setHenchmen(int numberOfHenchmen) {
		this.numberOfHenchmen = numberOfHenchmen;
	}

	public int getHenchmen() {
		return this.numberOfHenchmen;
	}

	public void setSchemeTwists(int numberOfSchemeTwists) {
		this.numberOfSchemeTwists = numberOfSchemeTwists;
	}

	public int getSchemeTwists() {
		return this.numberOfSchemeTwists;
	}

	public void setBystanders(int numberOfBystanders) {
		this.numberOfBystanders = numberOfBystanders;
	}

	public int getBystanders() {
		return this.numberOfBystanders;
	}

	public void setSettings(int numberOfPlayers, int numberOfVillains, int numberOfHenchmen, int numberOfHeroes) {
		this.numberOfPlayers = numberOfPlayers;
		this.numberOfVillains = numberOfVillains;
		this.numberOfHenchmen = numberOfHenchmen;
		this.numberOfHeroes=numberOfHeroes;
	}
	
	public void calcSettings(){
		this.numberOfSchemeTwists=8;
		if(this.schemes.getScheme()==1){ // Civil War
			if(this.numberOfPlayers==4 || this.numberOfPlayers==5){
				this.numberOfSchemeTwists=5;
			}
			if(this.numberOfPlayers==2){
				this.numberOfSchemeTwists=4;
			}
		}
		if(this.schemes.getScheme()==6) { //Killbots
			this.numberOfSchemeTwists=5;
			this.numberOfBystanders=18;
		}
		if(this.schemes.getScheme()==2) { //Dark Portals
			this.numberOfSchemeTwists=7;
		}
		if(this.schemes.getScheme()==5) { //Skrull
			this.numberOfHeroes=6;
		}
		if(this.schemes.getScheme()==6) { //Bank Robbery
			this.numberOfBystanders=12;
		}
	}
}
