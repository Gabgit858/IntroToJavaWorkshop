package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	static Robot GabyGabyGoo = new Robot();

	public static void main(String[] args) {

		// START HERE

		GabyGabyGoo.setSpeed(157);
		GabyGabyGoo.moveTo(500, 500);
		GabyGabyGoo.penDown();
		GabyGabyGoo.setRandomPenColor();
		GabyGabyGoo.hide();
		for(int i = 0; i<4; i++) {
			GabyGabyGoo.setRandomPenColor();
			drawSquare();
			GabyGabyGoo.turn(90);
		}
		GabyGabyGoo.show();
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			GabyGabyGoo.move(200);
			GabyGabyGoo.turn(90);
		}
	}
}
