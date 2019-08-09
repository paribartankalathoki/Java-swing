
/**
 * @author Paribartan
 *
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalculatorUsingSwing {
	private JFrame frame;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUsingSwing window = new CalculatorUsingSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorUsingSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 269, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
//		frame.getContentPane().setLayout(new GridLayout(4, 4));

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textField.setBounds(10, 11, 233, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnCE = new JButton("CE");
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCE.setBounds(10, 86, 50, 40);
//			btnCE.setBounds(69, 86, 50, 40);
		frame.getContentPane().add(btnCE);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnCE.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClear.setBounds(69, 86, 50, 40);
//			btnClear.setBounds(129, 86, 50, 40);
		frame.getContentPane().add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});

		JButton btnBackSpace = new JButton("X");
		btnBackSpace.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBackSpace.setBounds(129, 86, 50, 40);
		frame.getContentPane().add(btnBackSpace);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JButton btnPM = new JButton("+/-");
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPM.setBounds(11, 272, 50, 40);
		frame.getContentPane().add(btnPM);

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(69, 272, 50, 40);
		frame.getContentPane().add(btn0);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(129, 272, 50, 40);
		frame.getContentPane().add(btnDot);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEquals.setBounds(189, 272, 50, 40);
		frame.getContentPane().add(btnEquals);
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnEquals.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(11, 226, 50, 40);
		frame.getContentPane().add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(69, 226, 50, 40);
		frame.getContentPane().add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(129, 226, 50, 40);
		frame.getContentPane().add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnPlus.setBounds(189, 225, 50, 40);
		frame.getContentPane().add(btnPlus);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnPlus.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(189, 179, 50, 40);
		frame.getContentPane().add(btnMinus);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnMinus.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btnMultiply = new JButton("*");
		btnMultiply.setFont(new Font("Sylfaen", Font.BOLD, 25));
		btnMultiply.setBounds(189, 133, 50, 40);
		frame.getContentPane().add(btnMultiply);

		JButton btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDivide.setBounds(189, 86, 50, 40);
		frame.getContentPane().add(btnDivide);

//			JButton btnNewButton_11 = new JButton("New button");
//			btnNewButton_11.setBounds(129, 86, 50, 40);
//			frame.getContentPane().add(btnNewButton_11);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(11, 134, 50, 40);
		frame.getContentPane().add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(69, 133, 50, 40);
		frame.getContentPane().add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(129, 133, 50, 40);
		frame.getContentPane().add(btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(11, 181, 50, 40);
		frame.getContentPane().add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(70, 181, 50, 40);
		frame.getContentPane().add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(129, 180, 50, 40);
		frame.getContentPane().add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
	}
}
