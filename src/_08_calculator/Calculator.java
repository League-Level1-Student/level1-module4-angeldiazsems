package _08_calculator;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator implements ActionListener {
	
JFrame frame = new JFrame();

JPanel panel = new JPanel();
JTextField field1 = new JTextField(10);
JTextField field2 = new JTextField(10);
JButton add = new JButton("add");
JButton sub = new JButton("subtract");
JButton mul = new JButton("multiply");
JButton div = new JButton("divide");
String input;
String input2;
void setup(){
	
	frame.setVisible(true);
	frame.setSize(300, 120);
	frame.add(panel);
	panel.add(field1);
	panel.add(field2);
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	add.addActionListener(this);
	sub.addActionListener(this);
	div.addActionListener(this);
	mul.addActionListener(this);
	field1.addActionListener(this);
	field2.addActionListener(this);
	

	
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
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource() == add) {
		
		String input = field1.getText();
		Integer.parseInt(input);
		
		String input2 = field1.getText();
		Integer.parseInt(input2);
		
		
		System.out.println(addition(input,input2)); 
	}
	
}

}


