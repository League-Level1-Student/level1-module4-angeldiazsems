package _08_calculator;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	JLabel label = new JLabel("answer");
	String input;
	String input2;

	void setup() {

		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.add(panel);
		panel.add(field1);
		panel.add(field2);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(label);
	
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		field1.addActionListener(this);
		field2.addActionListener(this);

	}

	int addition(int a, int b) {

		return (a + b);

	}

	int subtraction(int a, int b) {

		return (a - b);
	}

	int multiply(int a, int b) {

		return (a * b);
	}

	int divide(int a, int b) {

		return (a / b);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		String input = field1.getText();
		int i1 = Integer.parseInt(input);

		String input2 = field2.getText();
		int i2 = Integer.parseInt(input2);
		int sum = 0;
		if (arg0.getSource() == add) {

			sum = addition(i1, i2);
			label.setText(""+sum);
		}
		if (arg0.getSource() == sub) {

			sum = subtraction(i1, i2);
			label.setText(""+sum);
		}
		if (arg0.getSource() == mul) {

			sum = multiply(i1, i2);
			label.setText(""+sum);
		}
		if (arg0.getSource() == div) {

			sum = divide(i1, i2);
			label.setText(""+sum);
		}

	}

}
