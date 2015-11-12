import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class masterToolbar extends JPanel {

	private JButton[] button = new JButton[4];
	private Color black = new Color(122, 122, 122);
	private Color white = new Color(255, 255, 255);
	
	private void resetColor(){
		for (JButton btn : button) {
			btn.setBackground(white);
		}
	}

	public masterToolbar(masterStack masters, NextButton nextbtn) {
		GridLayout MasterGrid = new GridLayout(0, 4);
		setLayout(MasterGrid);
		button[0]=new JButton(masters.getCardName(0));
		button[1]=new JButton(masters.getCardName(1));
		button[2]=new JButton(masters.getCardName(2));
		button[3]=new JButton(masters.getCardName(3));
		resetColor();

		button[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				resetColor();
				button[0].setBackground(black);
				masters.setMaster(0);
				masters.printMaster();
				nextbtn.set2();
			}
		});
		button[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				resetColor();
				button[1].setBackground(black);
				masters.setMaster(1);
				masters.printMaster();
				nextbtn.set2();
			}
		});
		button[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				resetColor();
				button[1].setBackground(black);
				masters.setMaster(1);
				masters.printMaster();
				nextbtn.set2();
			}
		});
		button[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				resetColor();
				button[2].setBackground(black);
				masters.setMaster(2);
				masters.printMaster();
				nextbtn.set2();
			}
		});
		button[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				resetColor();
				button[3].setBackground(black);
				masters.setMaster(3);
				masters.printMaster();
				nextbtn.set2();
			}
		});
		add(button[0]);
		add(button[1]);
		add(button[2]);
		add(button[3]);
	}
	
}
