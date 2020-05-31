import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	
	//variables
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private StringListeners textListener;
	
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
	public void setStringListeners(StringListeners listener) {
		this.textListener = listener;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton cliked = (JButton)e.getSource();
		
		if (cliked == helloButton) {
			if(textListener !=null);
				textListener.textEmitted("Hello\n");

		}
		else if(cliked == goodbyeButton){
			if(textListener !=null) {
				textListener.textEmitted("Goodbye\n");
			}
		}
	}
	
}
