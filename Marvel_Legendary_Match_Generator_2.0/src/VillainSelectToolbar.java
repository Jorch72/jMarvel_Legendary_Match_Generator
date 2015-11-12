import java.awt.GridLayout;

import javax.swing.JPanel;

public class VillainSelectToolbar extends JPanel {
	public CardButton[] button = new CardButton[7];
	
	public VillainSelectToolbar(HeroDeck heroes, VillainDeck villains, NextButton nextbtn){
		GridLayout VillainGrid = new GridLayout(0, 5);
		setLayout(VillainGrid);
		for(int i=0;i<button.length;i++){
			button[i]=new CardButton(villains.getVillain(i),i,nextbtn,heroes,villains);
			add(button[i]);
		}
	}
	
	public void clickandhide(int index){
		button[index].doClick();
		button[index].setEnabled(false);
	}
}
