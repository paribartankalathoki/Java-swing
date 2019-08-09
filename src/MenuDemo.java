import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.KeyStore;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * @author Paribartan
 *
 */
public class MenuDemo extends JFrame{
	
	public MenuDemo() {
		setTitle("Menu Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		
		JMenuBar jMenuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		jMenuBar.add(fileMenu);
		
		JMenuItem newMenuItem = new JMenuItem("New");
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		
		newMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MenuDemo();
				
			}
		});
		fileMenu.add(newMenuItem);
		
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		
		exitMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		fileMenu.add(exitMenuItem);
		
		
		JMenu editMenu = new JMenu("Edit");
		jMenuBar.add(editMenu);
		
		JMenu helpMenu = new JMenu("Help");
		jMenuBar.add(helpMenu);
		
		setJMenuBar(jMenuBar);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new MenuDemo();

	}

}
