package _11_whack_a_mole;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackAMole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton moleButton;
	Random ran = new Random();

	void buttonMaker(Random ran) {
		ran.nextInt(25);
		for (int i = 0; i < 25; i++) {

			JButton button = new JButton();
			panel.add(button);
			
		
		}
	}

	void setup() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(500, 500);

		panel.setLayout(new GridLayout(5, 5));
		buttonMaker(ran);

	}

}