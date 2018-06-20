package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String me = JOptionPane.showInputDialog(null,"Do you know how to wirte code?");
		// 2. If they say "yes", tell them they will rule the world.
if(me.equals("Yes")) {
JOptionPane.showMessageDialog(null,"Bow Down to the master of Java or cherish bellow and enter the underworld freek!");	
}
else {
		// 3. Otherwise, wish them good luck washing dishes.
JOptionPane.showMessageDialog(null, "Good luck washing my moms dirty feet!");
}
}
}

