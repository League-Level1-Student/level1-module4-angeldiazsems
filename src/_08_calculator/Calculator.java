package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
JFrame frame = new JFrame();

JPanel panel = new JPanel();
JTextField text = new JTextField();
JTextField text2 = new JTextField();
JButton add = new JButton("add");
JButton sub = new JButton("subtract");
JButton mul = new JButton("multiply");
JButton div = new JButton("divide");

void setup(){
	frame.setVisible(true);
	frame.add(panel);
	panel.add(text);
	panel.add(text2);
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	
	
	
}
int addition(int a, int b){
	
	return(a+b);
}
int subtraction(int a, int b){
	
	return(a-b);
}
int multiply(int a, int b){
	
	return(a*b);
}
int divide(int a, int b){
	
	return(a/b);
}

}


