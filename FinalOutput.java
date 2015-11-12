import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FinalOutput extends JPanel {
	public JTextArea outputPanel;

	public FinalOutput(HeroDeck heroes, VillainDeck villains, gameSetting settings) {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		outputPanel = new JTextArea();
		outputPanel.setText("");
		this.printSettings(settings);
		outputPanel.append("-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
		this.printHeroes(heroes);
		outputPanel.append("-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
		this.printVillaindeck(villains, settings);
		add(outputPanel);
	}

	private void printHeroes(HeroDeck heroes) {
		outputPanel.append("Your herodeck contains: \n");
		System.out.println("Print Heroes");
		for (int i = 0; i < 15; i++) {
			System.out.println(i + ": " + heroes.getHeroName(i) + ", " + heroes.getHeroAvaible(i));
			if (heroes.getHeroAvaible(i) == 1) {
				outputPanel.append("14 cards of " + heroes.getHeroName(i) + "\n");
			}
		}
	}

	private void printVillaindeck(VillainDeck villains, gameSetting settings) {
		outputPanel.append("Your villaindeck contains: \n");
		for (int i = 0; i < 7; i++) {
			if (villains.getVillainAvaible(i) == 1) {
				outputPanel.append("8 cards of " + villains.getVillainName(i) + "\n");
			}
		}
		for (int i = 0; i < 4; i++) {
			if (villains.getHenchmenAvaible(i) == 1) {
				if (settings.getPlayers() > 1) {
					outputPanel.append("10 cards of " + villains.getHenchmenName(i) + "\n");
				} else {
					outputPanel.append("3 cards of " + villains.getHenchmenName(i) + "\n");
				}
			}
		}
		outputPanel.append(settings.getSchemeTwists() + " cards of Schemetwists\n");
		outputPanel.append(settings.getBystanders() + " cards of Bystanders\n");
	}

	private void printSettings(gameSetting settings) {
		outputPanel.append("Your Mastermind is: " + settings.printMaster() + "\n");
		outputPanel.append("Your Scheme is: " + settings.printScheme() + "\n");

	}

}
