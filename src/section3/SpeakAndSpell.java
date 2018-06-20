package section3;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {
public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
	String word="";
	for( int i= 0; i<6; i++) {
if(i==0) {
word="chickendsdwds";


}

	if(i==1) {
	word= "supercalifragilisticexpialidocious"; 
		}
		speak(word);

// 2. Catch the user's answer in a String
String place = JOptionPane.showInputDialog(null, "");
		// 3. If the user spelled the word correctly, speak "correct"
if(place.equals(word)) {
	speak("correct");
}
else {
speak("wrong");
}
}
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


