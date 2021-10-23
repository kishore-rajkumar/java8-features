package java8.features.lambda;

import java.awt.Button;
import java.awt.Frame;

public class PostJava8ButtonListener {

	public static void main(String[] args) {
		Frame frame = new Frame("ActionListener before java 8");
		Button button = new Button("Click here");
		button.setBounds(50, 100, 80, 50);

		button.addActionListener((e) -> {
			System.out.println("Lamda expresion: Action performed!");
		});

		frame.add(button);
		frame.setSize(200, 200);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
