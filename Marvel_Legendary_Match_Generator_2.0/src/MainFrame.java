import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	private CardSelectToolbar cardSelect;
	private gameSettingToolBar settingToolbar;
	private NextButton next1,next2;
	private FinalOutput output;

	public MainFrame(HeroDeck heroes,VillainDeck villains, gameSetting settings) {
		super("Marvel Match Generator");
		setLayout(new BorderLayout());
		next1= new NextButton();
		next2= new NextButton();
		
		settingToolbar = new gameSettingToolBar(settings,next1);
		cardSelect = new CardSelectToolbar(heroes,villains,settings,next2);

		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		add(settingToolbar, BorderLayout.NORTH);
		add(next1, BorderLayout.CENTER);
		next1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				add(cardSelect, BorderLayout.NORTH);
				System.out.println(settings.getHeroes() + " " + settings.getVillains() + " " + settings.getHenchmen());
				cardSelect.setMaxes(settings.getHeroes(), settings.getVillains(), settings.getHenchmen(),heroes,villains);
				settings.calcSettings();
				cardSelect.calcVillain(settings);
				settingToolbar.setVisible(false);
				next1.setVisible(false);
				add(next2, BorderLayout.CENTER);
				}		
		});
		next2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardSelect.setVisible(false);
				next2.setVisible(false);
				output=new FinalOutput(heroes,villains,settings);
				add(output,BorderLayout.CENTER);
			}
		});
		
		
	}
}
