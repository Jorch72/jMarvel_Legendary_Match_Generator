import java.awt.GridLayout;

import javax.swing.JPanel;

public class HenchmenSelectToolbar extends JPanel {
	public CardButton[] button = new CardButton[4];

	public HenchmenSelectToolbar(HeroDeck heroes, VillainDeck henchmen, NextButton nextbtn) {
		GridLayout HenchGrid = new GridLayout(0, 5);
		setLayout(HenchGrid);
		for(int i=0;i<button.length;i++){
			button[i]=new CardButton(henchmen.getHenchmen(i),i,nextbtn,heroes,henchmen);
			add(button[i]);
		}
	}
	
	public void clickandhide(int index){
		button[index].doClick();
		button[index].setEnabled(false);
	}
}
