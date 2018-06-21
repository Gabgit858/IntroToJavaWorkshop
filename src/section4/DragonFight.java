package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		Random randcookie = new Random();
		int r = randcookie.nextInt(11);
		Random randmymom = new Random();
		int z = randmymom.nextInt(11);
		Random randz = new Random();
		int y = randz.nextInt(36000);


		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth = 100;
	System.out.println(playerHealth);
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 1000;
		System.out.println(dragonHealth);
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerAttack = 1;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonAttack = 2;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String Q1 = JOptionPane.showInputDialog("Should you attack the dragon with a yell or kick. Honestly it doesn't matter the game is rigged.");
		// 9. If they typed in "yell":
		if(Q1.equals("yell")) {
			dragonHealth = dragonHealth - r;
		}
		
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick"

		if(Q1.equals("kick")) {
			dragonHealth = dragonHealth - z;
		}
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
		}	
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		playerHealth = playerHealth- y;
		
		
		// 13. If the user's health is less than or equal to 0
		if( playerHealth <= 0) {
			JOptionPane.showMessageDialog(null,"You lose SUCKER!");
		}
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
	if( dragonHealth <= 0) {
		JOptionPane.showMessageDialog(null,"You didn't kill the dragon, I told it to commit suicide, HAHAHAHHAHAHHAHA!");
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}
}

