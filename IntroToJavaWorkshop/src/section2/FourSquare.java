package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot joelsmells=new Robot ();

	void go() {
		// 4. Make the robot move as fast as possible
		joelsmells.setSpeed(9001);

		// 5. Set the pen width to 5
		joelsmells.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int i=0;i<4;i++) {
		

			// 7. Set the pen color to random
		joelsmells.setRandomPenColor();
	
			// 1. Call the drawSquare() method
		drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
		joelsmells.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	
	void drawSquare() {
		joelsmells.penDown();
		
		for(int i=0;i<4;i++) {
			joelsmells.move(100);
			joelsmells.turn(90);
		}
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
	}
		
		
	

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



