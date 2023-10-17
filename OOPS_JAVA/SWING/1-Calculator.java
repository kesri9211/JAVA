package javaclass.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Define a class named Calculator that extends JFrame and implements ActionListener
public class Calculator extends JFrame implements ActionListener {
    JTextField inputfield1;   // Text field for user input 1
    JTextField inputfield2;   // Text field for user input 2
    JButton button;           // Button to trigger calculation
    JTextField outputfield;   // Text field to display the result

    // Constructor for the Calculator class
    Calculator() {
        setTitle("Simple Calculator");  // Set the title of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set close operation
        setSize(300, 100);  // Set the size of the JFrame
        setLayout(new FlowLayout());  // Set the layout manager to FlowLayout

        // Initialize input fields, button, and output field
        inputfield1 = new JTextField(10);
        inputfield2 = new JTextField(10);
        button = new JButton("Calculate");
        outputfield = new JTextField(10);

        outputfield.setEditable(false);  // Make the output field non-editable

        // Add components to the JFrame
        add(inputfield1);
        add(inputfield2);
        add(button);
        add(outputfield);

        button.addActionListener(this);  // Register the button for action events
    }

    // Override the actionPerformed method from ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(inputfield1.getText());  // Parse input 1 as a double
            double num2 = Double.parseDouble(inputfield2.getText());  // Parse input 2 as a double
            double result = num1 + num2;  // Calculate the result

            outputfield.setText(Double.toString(result));  // Display the result in the output field
        } catch (NumberFormatException ex) {
            // Handle the case where input is not a valid number
            outputfield.setText("Invalid Input");
        }
    }

    // Main method to create an instance of Calculator and make it visible
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setVisible(true);
    }
}

