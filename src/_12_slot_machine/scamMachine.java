package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class scamMachine implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("SPIN");
	Random ran = new Random();
	
	
	void setup() {
		frame.setVisible(true);
		frame.setSize(800,800);
		frame.add(panel);
		panel.add(button);
		try {
			JLabel createLabelImage = createLabelImage("cherry.jpg");
			panel.add(createLabelImage);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			JLabel createLabelImage = createLabelImage("lemon.jpg");
			panel.add(createLabelImage);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			JLabel createLabelImage = createLabelImage("orange.png");
			panel.add(createLabelImage);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		button.addActionListener(this);
	}
	
	
	
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}




	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int ran0 = ran.nextInt(2);
		int ran1 = ran.nextInt(2);
		int ran2 = ran.nextInt(2);
	
		try {
			if(ran0 == 0) {
			JLabel createLabelImage = createLabelImage("cherry.jpg");
			panel.add(createLabelImage);
			}
			else if(ran0 == 1) {
				JLabel createLabelImage = createLabelImage("lemon.jpg");
				panel.add(createLabelImage);
			}
			else {
				
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}
	
    
	
	
	
}
