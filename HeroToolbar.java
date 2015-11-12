import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class HeroToolbar extends JPanel {
	public CardButton[] button = new CardButton[15];

	public HeroToolbar(HeroDeck heroes, VillainDeck villains, NextButton nextbtn) {
		GridLayout HeroGrid = new GridLayout(0, 5);
		setLayout(HeroGrid);
		for (int i = 0; i < heroes.getHeroCount(); i++) {
			button[i] = new CardButton(heroes.getCard(i),i,nextbtn,heroes,villains);
			add(button[i]);
		}
	}
}
