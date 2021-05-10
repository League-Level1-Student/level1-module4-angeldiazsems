package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class NastySurprise implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton("Trick");
JButton button2 = new JButton("Treat");

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
void run(){
	frame.setVisible(true);
	frame.add(panel);
	frame.setSize(300, 300);
	panel.add(button);
	button.addActionListener(this);
panel.add(button);
panel.add(button2);
frame.pack();
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(button == arg0.getSource()) {
		showPictureFromTheInternet("https://weneedfun.com/wp-content/uploads/2015/10/Cute-puppy-Pictures-29.jpg");
	}
	if(button2 == arg0.getSource()) {
		showPictureFromTheInternet("https://news.okstate.edu/articles/agriculture/images/Spider_banner.jpg");
	}
	
	
	
}



}
