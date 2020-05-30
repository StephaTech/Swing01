import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	
	//variables
	private JButton helloButton;
	private JButton goodbyeButton;
	private TextPanel textPanel;//create a field means(a missing variable)
	
	//constructor
	public Toolbar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		//default layout manager for every JPanel.  
		//It simply lays out components in a single row, starting a new row
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
	public void setTextPanel (TextPanel textPanel) {
		this.textPanel = textPanel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton cliked = (JButton)e.getSource();
		
		if (cliked == helloButton) {
			textPanel.appendText("Hello\n");
		}
		else if(cliked == goodbyeButton){
			textPanel.appendText("goodbye\n");
		}
	}
	
}
