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
	
	
	boolean player1Turn;
	
	Random ran = new Random();
	
	
	
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
		
		firstTurn();
		}
	
	private void firstTurn() {
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		if (ran.nextInt(2) == 0) {
			player1Turn = true;
			textField.setText("X turn");
		}
		else {
			player1Turn = false;
			textField.setText("O turn");
		}
		
	}

	public void addButtons() {
		
		for(int i = 0;i<9;i++) {
			buttons[i] = new JButton();
			button.add(buttons[i]);
			buttons[i].setFont(new Font("Serif", Font.BOLD,40));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			
		}
		
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<9;i++) {
			if(e.getSource() == buttons[i]) {
				if(player1Turn) {
					if(buttons[i].getText() == ""){
						buttons[i].setForeground(Color.BLUE);
						buttons[i].setText("X");
						player1Turn = false;
						textField.setText("O Turn");
						check();
							
					}
					
				}
				else {
					if(buttons[i].getText() == ""){
						buttons[i].setForeground(Color.RED);
						buttons[i].setText("O");
						player1Turn = true;
						textField.setText("X Turn");
						check();
							
					}
					
				}
			}
		}
		// TODO Auto-generated method stub
		
	}

	private void check() {
		// TODO Auto-generated method stub
		
		if(buttons[0].getText()=="X" && buttons[1].getText()=="X" && buttons[2].getText()=="X") {
			xwins(0,1,2);
		}
		if(buttons[3].getText()=="X" && buttons[4].getText()=="X" && buttons[5].getText()=="X") {
			xwins(3,4,5);
		}
		if(buttons[6].getText()=="X" && buttons[7].getText()=="X" && buttons[8].getText()=="X") {
			xwins(6,7,8);
		}
		if(buttons[0].getText()=="X" && buttons[3].getText()=="X" && buttons[6].getText()=="X") {
			xwins(0,3,6);
		}
		if(buttons[1].getText()=="X" && buttons[4].getText()=="X" && buttons[7].getText()=="X") {
			xwins(1,4,7);
		}
		if(buttons[2].getText()=="X" && buttons[5].getText()=="X" && buttons[8].getText()=="X") {
			xwins(2,5,8);
		}
		if(buttons[0].getText()=="X" && buttons[4].getText()=="X" && buttons[8].getText()=="X") {
			xwins(0,4,8);
		}
		if(buttons[2].getText()=="X" && buttons[4].getText()=="X" && buttons[6].getText()=="X") {
			xwins(2,4,6);
		}
		
		if(buttons[0].getText()=="O" && buttons[1].getText()=="O" && buttons[2].getText()=="O") {
			Owins(0,1,2);
		}
		if(buttons[3].getText()=="O" && buttons[4].getText()=="O" && buttons[5].getText()=="O") {
			Owins(3,4,5);
		}
		if(buttons[6].getText()=="O" && buttons[7].getText()=="O" && buttons[8].getText()=="O") {
			Owins(6,7,8);
		}
		if(buttons[0].getText()=="O" && buttons[3].getText()=="O" && buttons[6].getText()=="O") {
			Owins(0,3,6);
		}
		if(buttons[1].getText()=="O" && buttons[4].getText()=="O" && buttons[7].getText()=="O") {
			Owins(1,4,7);
		}
		if(buttons[2].getText()=="O" && buttons[5].getText()=="O" && buttons[8].getText()=="O") {
			Owins(2,5,8);
		}
		if(buttons[0].getText()=="O" && buttons[4].getText()=="O" && buttons[8].getText()=="O") {
			Owins(0,4,8);
		}
		if(buttons[2].getText()=="O" && buttons[4].getText()=="O" && buttons[6].getText()=="O") {
			Owins(2,4,6);
		}
		
	}

	private void Owins(int i, int j, int k) {
		// TODO Auto-generated method stub
		buttons[i].setBackground(Color.ORANGE);
		buttons[j].setBackground(Color.ORANGE);
		buttons[k].setBackground(Color.ORANGE);
		textField.setText("O won");
		clear();
		
	}

	private void xwins(int i, int j, int k) {
		// TODO Auto-generated method stub
		buttons[i].setBackground(Color.ORANGE);
		buttons[j].setBackground(Color.ORANGE);
		buttons[k].setBackground(Color.ORANGE);
		textField.setText("X won");
		clear();
	}

	private void clear() {
		// TODO Auto-generated method stub
		for(int i = 0;i<9;i++) {
			
			buttons[i].setEnabled(false);
			
		}
		
	}

}
