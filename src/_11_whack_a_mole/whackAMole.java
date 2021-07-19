package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random ran = new Random();
	JButton button;
	int molesWhacked;
	
	void drawButtons(Random ran) {
		int ranNum = ran.nextInt(25);
		for (int i = 0; i < 25; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			if (i == ranNum) {
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

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODOd Auto-generated method stub
		String buttonText = button.getText();
		
		if(arg0.getSource().equals(button)&&buttonText==("mole!")) {
		molesWhacked++;
		}
		else {
			speak("test");
		}
		frame.dispose();
		drawButtons(ran);
	}

}