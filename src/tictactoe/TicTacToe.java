package tictactoe;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/*
 * a tictactoe class that imports the various Guis
 */

public class TicTacToe implements ActionListener {
	
	JFrame frame = new JFrame();
	
	JPanel title = new JPanel();
	
	JLabel textField = new JLabel();
	
	JPanel button = new JPanel();
	
	JButton[] buttons = new JButton[9];
	
	
	
	public TicTacToe() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);	
		frame.getContentPane().setBackground(Color.cyan);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		

		title.setLayout(new BorderLayout());
		title.setBounds(0,0,800,100);
		title.add(textField);

		textField.setBackground(Color.CYAN);
		textField.setForeground(Color.white);
		textField.setFont(new Font("Serif", Font.BOLD, 20));
		textField.setHorizontalAlignment(JLabel.CENTER);
		textField.setText("TicTacToe");
		textField.setOpaque(true);
		
		
		button.setLayout(new GridLayout(3,3));
		button.setBackground(Color.cyan);
	
		
		frame.add(title,BorderLayout.NORTH);
		frame.add(button);
		
		addButtons();
		}
	
	public void addButtons() {
		
		for(int i = 0;i<9;i++) {
			buttons[i] = new JButton();
			button.add(buttons[i]);
			buttons[i].setFont(new Font("Serif", Font.BOLD,4));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			
		}
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
