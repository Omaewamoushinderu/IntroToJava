package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		System.out.println("Hello world");
	
		Robot thing=new Robot();
		thing.setSpeed(2000);
		thing.setPenColor(Color.BLUE);
		thing.penDown();
		for(int i=0;i<4;i++)
		thing.move(25);
		thing.turn(-90);
		thing.move(100);
		thing.turn(-90);
		thing.setPenColor(Color.GREEN);
		thing.penDown();
		for(int i=0;i<4;i++)
		thing.move(25);
		thing.turn(90);
		
		
	}
}
