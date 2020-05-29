import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {//name the class like frame, button associating with the extension JFrame, JButton
	
	//variables
	private JButton btn;
	private TextPanel textPanel;
	private Toolbar toolbar;

	public MainFrame() {
		
		//superClass//equivalent to JFrame frame = new JFrame;
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		btn = new JButton("Click Me");//this is a button 
		textPanel = new TextPanel();// this is a panel
		
		//actionListener interface
		//giving action to the button when clicked
		btn.addActionListener(new ActionListener() {//annonymous

			//connection with TextPanel - constructor appendText
			public void actionPerformed(ActionEvent arg0) {
				textPanel.appendText("Hello you clicked!\n");//invoking a text from method
				
			}
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);//position and visibility
		add(btn, BorderLayout.SOUTH);
		
		// parental class
		//frame.setSize(600, 500);//dont need to call frame anymore
		setSize(600, 500);//this set the size of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this stop the program to run for complete
		setVisible(true);//this set the frame visible
	}
}
