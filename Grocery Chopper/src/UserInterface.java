//import java.awt.FlowLayout;  // awt = Abstract Windowing Toolkit
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
//import javax.swing.*;  << may be better to just import all classes from the javax.swing package

@SuppressWarnings("serial") // Warning will occur without this. Book says to suppress warning. Research further? 
public class UserInterface extends JFrame {    // "extends" means I am adding functionality not already present in JFrame, without altering JFrame directly

		public UserInterface() {                      // constructor declaration. This will call various methods from the Java API.
			setTitle("GeORGE");
			//setLayout(new FlowLayout());	//setLayout() puts the new FlowLayout object in charge of arranging components on the frame
											//FlowLayout() positions objects on the frame centered near the top
			setLayout(new GridLayout(5, 1, 20, 3));
			setSize(300, 100);             // 300 x 100 pixels (wide x tall)
			setDefaultCloseOperation(EXIT_ON_CLOSE); // Refers to the "X" button
			
			MenuBar menu = new MenuBar(); 
			setJMenuBar(menu.createMenu()); // Adds the menu bar to the frame
			
			add(new JLabel("Welcome to GeORGE Pre-Alpha"));
			add(new JButton("CLICK TO TEST"));       //Sets the button label. Button does not yet actually do anything. "add" places button on object's surface.
			add(new JLabel("This button does absolutely nothing."));
			add(new JLabel("You may continue clicking as suits your primitive pleasure."));
			pack();
			setVisible(true);
		}
}
