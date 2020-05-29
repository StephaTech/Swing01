import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel {
	
	//variables
	private JButton helloButton;
	private JButton goodbyeButton;
	
	//constructor
	public Toolbar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		//default layout manager for every JPanel.  
		//It simply lays out components in a single row, starting a new row
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
									
}
