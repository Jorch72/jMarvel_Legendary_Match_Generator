import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerSelectToolbar extends JPanel {
	private JButton[] button = new JButton[5];
	private Color black = new Color(122, 122, 122);
	private Color white = new Color(255, 255, 255);

	public PlayerSelectToolbar(gameSetting settings, NextButton nextbtn) {
		button[0] = new JButton("1");
		button[1] = new JButton("2");
		button[2] = new JButton("3");
		button[3] = new JButton("4");
		button[4] = new JButton("5");

		button[0].setBackground(white);
		button[1].setBackground(white);
		button[2].setBackground(white);
		button[3].setBackground(white);
		button[4].setBackground(white);

		GridLayout playerGrid = new GridLayout(0, 8);
		setLayout(playerGrid);

		button[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				button[0].setBackground(black);
				button[1].setBackground(white);
				button[2].setBackground(white);
				button[3].setBackground(white);
				button[4].setBackground(white);
				settings.setPlayers(1);
				settings.setHeroes(3);
				settings.setVillains(1);
				settings.setBystanders(1);
				settings.setHenchmen(1);
				nextbtn.set1();
			}
		});
		add(button[0]);

		button[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				button[0].setBackground(white);
				button[1].setBackground(black);
				button[2].setBackground(white);
				button[3].setBackground(white);
				button[4].setBackground(white);
				settings.setSettings(2, 2, 1, 5);
				settings.setBystanders(2);
				nextbtn.set1();
			}
		});
		add(button[1]);

		button[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				button[0].setBackground(white);
				button[1].setBackground(white);
				button[2].setBackground(black);
				button[3].setBackground(white);
				button[4].setBackground(white);
				settings.setSettings(3, 3, 1, 5);
				settings.setBystanders(8);
				nextbtn.set1();
			}
		});
		add(button[2]);

		button[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				button[0].setBackground(white);
				button[1].setBackground(white);
				button[2].setBackground(white);
				button[3].setBackground(black);
				button[4].setBackground(white);
				settings.setSettings(4, 3, 2, 5);
				settings.setBystanders(8);
				nextbtn.set1();
			}
		});
		add(button[3]);

		button[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				button[0].setBackground(white);
				button[1].setBackground(white);
				button[2].setBackground(white);
				button[3].setBackground(white);
				button[4].setBackground(black);
				settings.setSettings(5, 4, 2, 6);
				settings.setBystanders(12);
				nextbtn.set1();
			}
		});
		add(button[4]);
	}
}
