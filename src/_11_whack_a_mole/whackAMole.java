package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random ran = new Random();
	Date date = new Date();
	JButton button;
	int molesWhacked = 0;
	int molesMissed = 0;
	
	void drawButtons(Random ran) {
		int ranNum = ran.nextInt(25);
		for (int i = 0; i < 25; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			if (i == ranNum) {
				this.button = button;
				button.setText("mole!");
			}
		}
	}

	void setup() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(500, 500);
		panel.setLayout(new GridLayout(5, 5));
		drawButtons(ran);
	
		
		
	}

	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODOd Auto-generated method stub
		String buttonText = button.getText();
		
		if(arg0.getSource().equals(button)&&buttonText .equals("mole!")) {
			JOptionPane.showMessageDialog(null, "you got the mole");
			molesWhacked++;
			if(molesWhacked == 10) {
				endGame(date, molesWhacked);
			}	
		}
		else {
			JOptionPane.showMessageDialog(null, "you missed the mole");
			molesMissed++;
			if(molesMissed == 5) {
				endGame(date, molesWhacked);
			}	
		}
		frame.remove(panel);
		panel = new JPanel();
		drawButtons(ran);
		frame.add(panel);
		panel.setLayout(new GridLayout(5, 5));
		panel.setPreferredSize(new Dimension(500,500));
		frame.pack();
		
		
	}

}