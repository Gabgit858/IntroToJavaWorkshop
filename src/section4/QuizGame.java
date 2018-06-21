package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int x = 0;
		// 2.  Ask the user a question 
		String Q1 = JOptionPane.showInputDialog("What is factorial 5?");
		// 3.  Use an if statement to check if their answer is correct
		if(Q1.equals("120")) {
			x = x+1;
			JOptionPane.showMessageDialog(null, "You are correct");
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		else { 
			x = x -1;
			JOptionPane.showMessageDialog(null, "Wrong");

		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		String Q2 = JOptionPane.showInputDialog("What is my sister's favorite color?");
		// 3.  Use an if statement to check if their answer is correct
		if(Q2.equals("Blue")) {
			x = x+1;
			JOptionPane.showMessageDialog(null, "You are correct");
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		else { 
			x = x -1;
			JOptionPane.showMessageDialog(null, "Wrong");

		}
		JOptionPane.showMessageDialog(null,"Score= "+ x);
	}
	

}
