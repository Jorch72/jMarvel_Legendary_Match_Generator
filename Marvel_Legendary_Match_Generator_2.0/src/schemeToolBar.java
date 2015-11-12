import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class schemeToolBar extends JPanel {
	private JButton[] button = new JButton[8];
	private Color black = new Color(122, 122, 122);
	private Color white = new Color(255, 255, 255);

	private void resetColor() {
		for (JButton btn : button) {
			btn.setBackground(white);
		}
	}

	public schemeToolBar(gameSetting settings, schemeStack scheme, NextButton nextbtn) {
		GridLayout SchemeGrid = new GridLayout(0, 2);
		setLayout(SchemeGrid);
		button[0] = new JButton(scheme.getCardName(0));
		button[1] = new JButton(scheme.getCardName(1));
		button[2] = new JButton(scheme.getCardName(2));
		button[3] = new JButton(scheme.getCardName(3));
		button[4] = new JButton(scheme.getCardName(4));
		button[5] = new JButton(scheme.getCardName(5));
		button[6] = new JButton(scheme.getCardName(6));
		button[7] = new JButton(scheme.getCardName(7));
		resetColor();

		add(button[0]);
		add(button[1]);
		add(button[2]);
		add(button[3]);
		add(button[4]);
		add(button[5]);
		add(button[6]);
		add(button[7]);

		button[0].addActionListener(new ActionListener() { //Unleash the Power of the Cosmic Cube

			@Override
			public void actionPerformed(ActionEvent e) {
				resetColor();
				button[0].setBackground(black);
				scheme.setScheme(0);
				scheme.printScheme();
				nextbtn.set3();
				settings.setSchemeTwists(8);
			}
		});
		
		button[1].addActionListener(new ActionListener() {  //Super Hero Civil War

			@Override
			public void actionPerformed(ActionEvent e) {
				resetColor();
				button[1].setBackground(black);
				scheme.setScheme(1);
				scheme.printScheme();
				nextbtn.set3();
			}
		});
		
		button[2].addActionListener(new ActionListener() { //Portals to Dark Dimensions

			@Override
			public void actionPerformed(ActionEvent e) {
				resetColor();
				button[2].setBackground(black);
				scheme.setScheme(2);
				scheme.printScheme();
				nextbtn.set3();
			}
		});
		
		button[3].addActionListener(new ActionListener() { //Negative Zone Prison Breakout

			@Override
			public void actionPerformed(ActionEvent e) {
				resetColor();
				button[3].setBackground(black);
				scheme.setScheme(3);
				scheme.printScheme();
				nextbtn.set3();
			}
		});
		
		button[4].addActionListener(new ActionListener() { //The Legacy Virus

			@Override
			public void actionPerformed(ActionEvent e) {
				resetColor();
				button[4].setBackground(black);
				scheme.setScheme(4);
				scheme.printScheme();
				nextbtn.set3();
			}
		});
		
		button[5].addActionListener(new ActionListener() { //Secret Invasion of the Skrull Shapeshifters

			@Override
			public void actionPerformed(ActionEvent e) {
				resetColor();
				button[5].setBackground(black);
				scheme.setScheme(5);
				scheme.printScheme();
				nextbtn.set3();
			}
		});
		
		button[6].addActionListener(new ActionListener() { //Replace Earth's Leaders with Killbots

			@Override
			public void actionPerformed(ActionEvent e) {
				resetColor();
				button[6].setBackground(black);
				scheme.setScheme(6);
				scheme.printScheme();
				nextbtn.set3();
			}
		});
		
		button[7].addActionListener(new ActionListener() { //Midtown Bank Robbery

			@Override
			public void actionPerformed(ActionEvent e) {
				resetColor();
				button[7].setBackground(black);
				scheme.setScheme(7);
				scheme.printScheme();
				nextbtn.set3();
			}
		});
	}
}
