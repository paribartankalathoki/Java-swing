/**
 * @author Paribartan
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JavaSwing {

	public static void main(String[] args) {
		
//		JFrame frame = new JFrame("Java Swing") or;
		JFrame frame = new JFrame();
		frame.setTitle("Java Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 300);
		
		JLabel helloLabel = new JLabel();
		helloLabel.setText("Hello World");
		
		frame.add(helloLabel);
		
		frame.setVisible(true);

	}

}
