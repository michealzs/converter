

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class ConverterGui {
	// Exit event handler
	private static class ExitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	// Distance converter event handler
	private static class DistanceButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String input = JOptionPane.showInputDialog("Input miles distance to convert");
			if (input != null) {
				try {
					double inputValue = Double.parseDouble(input);
					// Create an instance of the distance converter
					DistanceConverter dConverter = new DistanceConverter(inputValue);
					double newDistance = dConverter.convert();
					JOptionPane.showMessageDialog(null, inputValue + " Miles equals  " + newDistance + " kilometers.");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Enter a valid number.");
				}
			}
		}
	}

	// Temperature converter event handler
	private static class TemperatureButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String input = JOptionPane.showInputDialog("Input fahrenheit temperature to convert");
			if (input != null) {
				try {
					double inputValue = Double.parseDouble(input);
					// Create an instance of the temperature converter
					TemperatureConverter tCoverter = new TemperatureConverter(inputValue);
					double newTemperature = tCoverter.convert();
					JOptionPane.showMessageDialog(null, inputValue + " F equals " + newTemperature + " C");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Enter a valid number.");
				}
			}
		}
	}

	public static void main(String[] args) {
		// Create frame
		JFrame window = new JFrame("Welcome to Converter");

		// Create pannel for buttons
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		// Instances for the buttons
		JButton distanceButton = new JButton("Distance Converter");
		JButton temperatureButton = new JButton("Temperature Converter");
		JButton exitButton = new JButton("Exit");

		// Create the exit listener and add it to the exit buttorn
		ExitHandler exit = new ExitHandler();
		exitButton.addActionListener(exit);
		panel.add(exitButton, BorderLayout.SOUTH);

		// Create the distance listener and add it to the exit buttorn
		DistanceButtonHandler distance = new DistanceButtonHandler();
		distanceButton.addActionListener(distance);
		panel.add(distanceButton, BorderLayout.CENTER);

		// Create the temperature listener and add it to the exit buttorn
		TemperatureButtonHandler temperature = new TemperatureButtonHandler();
		temperatureButton.addActionListener(temperature);
		panel.add(temperatureButton, BorderLayout.EAST);

		window.setContentPane(panel); // Add the contents
		window.setSize(450, 200); // Set the size of the window
		window.setLocation(300, 400); // Set the display location
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the action for when the JFrame is closed.
		window.setVisible(true); // Make the window visible
	}

}
