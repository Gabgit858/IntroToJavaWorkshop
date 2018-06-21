package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random randcookie = new Random();
	int x = randcookie.nextInt(4);
	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome
String awesome = JOptionPane.showInputDialog("Enter something awesome!");
	// 5. If the random number is 0
 if( x==0) {
	 JOptionPane.showMessageDialog(null, "Thats awesome!");
 }
 
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if( x==1) {
	 JOptionPane.showMessageDialog(null, "Really, you think thats awesome");
	// -- tell the user whatever they entered is ok.
}
	// 7. If the random number is 2
if( x==2) {
	 JOptionPane.showMessageDialog(null, "Thats SO BORING!");
	// -- tell the user whatever they entered is ok.
}

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if( x==3) {
	 JOptionPane.showMessageDialog(null, "GO DIE IN A HOLE");
	// -- tell the user whatever they entered is ok.
}

	// -- write your own answer

}
}



