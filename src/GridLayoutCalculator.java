import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutCalculator extends JFrame {

	public GridLayoutCalculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		
//		JPanel displayPanel = new JPanel();
//		displayPanel.setSize(280, 40);
//		JTextField displayField = new JTextField();
//		displayField.setSize(280, 40);
//		displayPanel.add(displayField);
//		add(displayPanel);
		
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setSize(280, 160);
		buttonsPanel.setLayout(new GridLayout(4, 4));
		
		JButton oneButton = new JButton("1");
		JButton twoButton = new JButton("2");
		JButton threeButton = new JButton("3");
		JButton fourButton = new JButton("4");
		JButton fiveButton = new JButton("5");
		JButton sixButton = new JButton("6");
		JButton sevenButton = new JButton("7");
		JButton eightButton = new JButton("8");
		JButton nineButton = new JButton("9");
		JButton zeroButton = new JButton("0");
		JButton plusButton = new JButton("+");
		JButton minusButton = new JButton("-");
		JButton divideButton = new JButton("/");
		JButton multiplyButton = new JButton("*");
		JButton clearButton = new JButton("C");
		JButton equalButton = new JButton("=");
		
		buttonsPanel.add(sevenButton);
		buttonsPanel.add(eightButton);
		buttonsPanel.add(nineButton);
		buttonsPanel.add(divideButton);
		
		buttonsPanel.add(fourButton);
		buttonsPanel.add(fiveButton);
		buttonsPanel.add(sixButton);
		buttonsPanel.add(multiplyButton);
		
		buttonsPanel.add(oneButton);
		buttonsPanel.add(twoButton);
		buttonsPanel.add(threeButton);
		buttonsPanel.add(minusButton);
		
		buttonsPanel.add(zeroButton);
		buttonsPanel.add(clearButton);
		buttonsPanel.add(equalButton);
		buttonsPanel.add(plusButton);
		
		add(buttonsPanel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CalculatorUsingSwing();
	}
}