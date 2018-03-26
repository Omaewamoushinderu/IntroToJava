package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog(null,"Enter your name");
	JOptionPane.showMessageDialog(null, "Nice to meet you " +name);
	
}
}