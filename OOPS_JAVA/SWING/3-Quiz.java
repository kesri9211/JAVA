package javaclass.Swing;

// Import necessary classes from Swing and AWT libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Define a class named QuizApp that extends JFrame and implements ActionListener
public class QuizApp extends JFrame implements ActionListener {
    JLabel label;   // Label to display the quiz question
    JButton button;  // Button to show the answer

    // Constructor for the QuizApp class
    QuizApp() {
        setTitle("Quiz App");  // Set the title of the JFrame
        setLayout(new FlowLayout());  // Set the layout manager to FlowLayout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set close operation
        setSize(200, 100);  // Set the size of the JFrame

        label = new JLabel();  // Initialize the label
        button = new JButton("Show Answer");  // Initialize the button

        label.setText("What is the capital of France?");  // Set the initial text for the label
        add(label);  // Add the label to the JFrame
        add(button);  // Add the button to the JFrame

        button.addActionListener(this);  // Register the button for action events
    }

    // Override the actionPerformed method from ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Paris.");  // When the button is clicked, set the label text to "Paris."
    }

    // Main method to create an instance of QuizApp and make it visible
    public static void main(String[] args) {
        QuizApp app = new QuizApp();
        app.setVisible(true);
    }
}

