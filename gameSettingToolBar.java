import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gameSettingToolBar extends JPanel {
	private masterToolbar mastertoolbar;
	private schemeToolBar schemetoolbar;
	private PlayerSelectToolbar playerselect;
	private JLabel labelPlayer = new JLabel("Select Number of Players:");
	private JLabel labelMaster = new JLabel("Select a Master: ");
	private JLabel labelScheme = new JLabel("Select a Scheme: ");

	public gameSettingToolBar(gameSetting settings, NextButton nextbtn) {
		this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		playerselect = new PlayerSelectToolbar(settings,nextbtn);
		mastertoolbar = new masterToolbar(settings.getMasters(),nextbtn);
		schemetoolbar = new schemeToolBar(settings,settings.getScheme(),nextbtn);
		
		add(labelPlayer);
		add(playerselect);
		add(labelMaster);
		add(mastertoolbar);
		add(labelScheme);
		add(schemetoolbar);
	}
}
