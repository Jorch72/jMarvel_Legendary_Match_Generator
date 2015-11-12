import java.awt.Color;

import javax.swing.JButton;

public class NextButton extends JButton {
	private boolean[] set = { false, false, false };
	private Color green = new Color(122, 255, 122);

	public NextButton() {
		this.setVisible(false);
		this.setText("Next");
		this.setBackground(green);
	}

	public void set1() {
		set[0] = true;
		this.check();
	}

	public void set1(boolean bool) {
		set[0] = bool;
		this.check();
	}

	public void set2() {
		set[1] = true;
		this.check();
	}
	
	public void set2(boolean bool) {
		set[1]=bool;
		this.check();
	}

	public void set3() {
		set[2] = true;
		this.check();
	}
	
	public void set3(boolean bool) {
		set[2]=bool;
		this.check();
	}

	private void check() {
		if ((set[0] == true && set[1] == true) && set[2] == true) {
			this.setVisible(true);
			System.out.println("Set Visible true!");
		}
		else {
			this.setVisible(false);
			System.out.println("Set Visible false!");
		}
	}

	public void printContent() {
		System.out.println("NextButton status: " + set[0] + " " + set[1] + " " + set[2]);
	}
	
	public void setAll(boolean hero, boolean vill, boolean hench){
		set[0]=hero;
		set[1]=vill;
		set[2]=hench;
		this.check();
	}

}
