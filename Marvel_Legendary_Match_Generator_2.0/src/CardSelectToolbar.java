
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardSelectToolbar extends JPanel {
	private HeroToolbar heroselect;
	private VillainSelectToolbar villainselect;
	private HenchmenSelectToolbar henchmenselect;
	private int maxHero, maxVill, maxHench,selVill, selHench;
	private JLabel labelHeroes = new JLabel("Select Heroes: ");
	private JLabel labelVillains = new JLabel("Select Villains: ");
	private JLabel labelHenchmen = new JLabel("Select Henchmen: ");

	public CardSelectToolbar(HeroDeck heroes, VillainDeck villains, gameSetting settings, NextButton nextbtn) {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		heroselect = new HeroToolbar(heroes, villains, nextbtn);
		villainselect = new VillainSelectToolbar(heroes, villains, nextbtn);
		henchmenselect = new HenchmenSelectToolbar(heroes, villains, nextbtn);
		add(labelHeroes);
		add(heroselect);
		add(labelVillains);
		add(villainselect);
		add(labelHenchmen);
		add(henchmenselect);
	}

	public void setMaxes(int maxHero, int maxVill, int maxHench, HeroDeck heroes, VillainDeck villains) {
		this.maxHero = maxHero;
		this.maxVill = maxVill;
		this.maxHench = maxHench;
		heroes.setMaxHero(maxHero);
		villains.setMaxes(maxVill, maxHench);
		this.labelHeroes.setText("Select " + maxHero + " Heroes: ");
		this.labelVillains.setText("Select " + (maxVill-villains.getselVil()) + " Villains: ");
		this.labelHenchmen.setText("Select " + (maxHench-villains.getselHench()) + " Henchmen: ");

	}

	public void calcVillain(gameSetting settings) {
		if (settings.getScheme().getScheme() == 5) { // Skrull
			this.villainselect.clickandhide(4);
		}
		if (settings.getMasters().getMaster() == 0) { // RedSkull
			this.villainselect.clickandhide(0);
		}
		if (settings.getMasters().getMaster() == 1) { // Doom
			this.henchmenselect.clickandhide(1);
		}
		if (settings.getMasters().getMaster() == 2) { // Magneto
			this.villainselect.clickandhide(3);
		}
		if (settings.getMasters().getMaster() == 3) { // Loki
			this.villainselect.clickandhide(5);
		}
		
	}
}
