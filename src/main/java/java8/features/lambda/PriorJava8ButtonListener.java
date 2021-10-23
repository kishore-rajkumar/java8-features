package java8.features.lambda;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Without using Lambda expression: Prior to java 8 we used the anonymous inner classe 
 * to implement the only abstract method of functional interface.
 * */

public class PriorJava8ButtonListener {
	public static void main(String[] args) {

		Frame frame = new Frame("ActionListener before java 8");
		Button button = new Button("Click here");
		button.setBounds(50, 100, 80, 50);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Annonymous function: Action performed!");
			}
		});

		frame.add(button);
		frame.setSize(200, 200);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
