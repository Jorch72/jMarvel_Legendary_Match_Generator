import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.text.AbstractDocument.Content;

public class CardButton extends JButton {
	private int index;
	private boolean isBlack;
	private Color black = new Color(122, 122, 122);
	private Color white = new Color(255, 255, 255);

	public CardButton(Card card, int i, NextButton nextbtn, HeroDeck heroes, VillainDeck villains) {
		this.isBlack = false;
		this.setBackground(white);
		index = i;
		this.setText(card.getName());
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setColor();
				card.setCard();
				System.out.println(index + " " + card.getName() + " " + card.getIsAvaible());
				nextbtn.setAll(heroes.isReady(), villains.villReady(), villains.henchReady());
				nextbtn.printContent();
				}
		});
	}

	public void setColor() {
		if (isBlack == true) {
			this.setBackground(white);
			this.isBlack = false;
		} else {
			this.setBackground(black);
			this.isBlack = true;
		}

	}

	public int getIndex() {
		return index;
	}

	public void setCard() {

	}

}
