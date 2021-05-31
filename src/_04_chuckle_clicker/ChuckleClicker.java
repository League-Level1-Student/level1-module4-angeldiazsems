package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
	public static void main(String[] args) {
		ChuckleClicker chuckle = new ChuckleClicker();
		chuckle.makeButtons();
	}

 void makeButtons(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("joke");
	JButton button2 = new JButton("punchline");
	frame.setVisible(true);
	frame.setSize(100, 100);
	panel.add(button2);
	panel.add(button1);
	frame.add(panel);
	
	
}
 


}

