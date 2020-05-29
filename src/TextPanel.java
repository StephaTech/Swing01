import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	
	//constructor
	public TextPanel() {
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());//setting layout of JPanel
		//creating very nice SCROOLPANE to the text Area
		add(new JScrollPane(textArea), BorderLayout.CENTER);//will take the entire layout because I am not setting SOUTH, NORTH...
	}
	//when cliked sends the command
	//look carefully this part and MainFrame when actionListenerperformed button is cliked HELLO YOU CLICKED COMES
	public void appendText(String text) {
		textArea.append(text);//calling class MainFrame actionListenerperformed button
	}
}
