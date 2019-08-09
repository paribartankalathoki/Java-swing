
/**
 * @author Paribartan
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage {
	public static void main(String[] args) {

//		JFrame frame = new JFrame("Java Swing") or;
		JFrame frame = new JFrame();
		frame.setTitle("Login Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		JLabel usernameLabel = new JLabel();
		usernameLabel.setText("Username: ");
		usernameLabel.setBounds(100, 170, 100, 20);
		frame.add(usernameLabel);
		
		JTextField usernameTextField = new JTextField();
		usernameTextField.setBounds(180, 170, 120, 20);
		frame.add(usernameTextField);
		
		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Password: ");
		passwordLabel.setBounds(100, 200, 100, 20);
		frame.add(passwordLabel);
		
		JPasswordField passwordTextField = new JPasswordField();
		passwordTextField.setBounds(180, 200, 120, 20);
		frame.add(passwordTextField);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		      usernameTextField.setText("");
		      passwordTextField.setText("");
		     }
		  });
		reset.setBounds(100, 230, 68, 20);
		frame.add(reset);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String username = usernameTextField.getText();
				String password = passwordTextField.getText();
				
				if(username.equals(password)) {
					 usernameTextField.setText("");
				      passwordTextField.setText("");
//					JOptionPane.showConfirmDialog(frame, "Hello, " + username + "\nYour Username: " + username + "\nYour Password: "+ password);
				      JOptionPane.showMessageDialog(frame, "\nYour Username: " + username + "\nYour Password: "+ password, "Message!!", JOptionPane.INFORMATION_MESSAGE);
					System.out.println("Username: " + username);
					System.out.println("Password: " + password);
				} else {
					 usernameTextField.setText("");
				      passwordTextField.setText("");
				      JOptionPane.showMessageDialog(frame, "\nInvalid Username or Password!", "Message!!", JOptionPane.ERROR_MESSAGE);
//					JOptionPane.showConfirmDialog(frame, "Invalid username  or password!");
				}
				
			}
		});
		login.setBounds(232, 230, 65, 20);
		frame.add(login);
		
		frame.setVisible(true);

	}

}
