package javaclass.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Define a class named ComboApp that extends JFrame and implements ActionListener
public class ComboBox extends JFrame implements ActionListener {
    JFrame frame;             // JFrame to use for JOptionPane
    JLabel label;             // Label to display a message
    JButton button;           // Button to trigger an action
    JComboBox<String> combo;  // ComboBox for selecting programming languages

    // Constructor for the ComboApp class
    ComboBox() {
        setTitle("ComboBox App");  // Set the title of the JFrame
        setSize(300, 100);         // Set the size of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set close operation
        setLayout(new FlowLayout());  // Set the layout manager to FlowLayout

        label = new JLabel("Choose any programming language: ");  // Create a label
        combo = new JComboBox<>();   // Create a JComboBox
        button = new JButton("Submit");  // Create a button

        // Add items (programming languages) to the combo box
        combo.addItem("Java");
        combo.addItem("Python");
        combo.addItem("C++");
        combo.addItem("C");

        add(label);    // Add the label to the JFrame
        add(combo);    // Add the combo box to the JFrame
        add(button);   // Add the button to the JFrame

        button.addActionListener(this);  // Register the button for action events
    }

    // Override the actionPerformed method from ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        // Show a message dialog with the selected programming language
        JOptionPane.showMessageDialog(frame, "You Choose " + combo.getSelectedItem());
    }

    // Main method to create an instance of ComboApp and make it visible
    public static void main(String[] args) {
        ComboBox app = new ComboBox();
        app.setVisible(true);
    }
}

