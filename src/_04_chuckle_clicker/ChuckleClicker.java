package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {

		ChuckleClicker chuckle = new ChuckleClicker();
		chuckle.makeButtons();
	}

	JButton button1 = new JButton("joke");
	JButton button2 = new JButton("punchline");

	void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setVisible(true);
		frame.setSize(100, 100);
		panel.add(button2);
		panel.add(button1);
		frame.add(panel);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "hi");
		if (arg0.getSource() == button1) {
JOptionPane.showMessageDialog(null, "why did the chicken not cross the road");
		}
		if (arg0.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "because he wanted to be orginal");
					}

	}

}
