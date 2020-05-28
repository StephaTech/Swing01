import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		// future threads, wont crash
		//This method allows us to post a "job" to Swing, which it will then run on the event 
		//dispatch thread at its next convenience.
		//make sure that the code to update it,is inside a call to invokeLater().
		SwingUtilities.invokeLater(new Runnable(){

			public void run() {
				JFrame frame = new JFrame("Hello World");
				frame.setSize(600, 500);//this set the size of the frame
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this stop the program to run for complete
				frame.setVisible(true);//this set the frame visible
			}
			
		});// the close )

	}

}
