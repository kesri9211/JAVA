package javaclass.Swing;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.Random;

//creating math quiz app
public class MathQuizApp extends JFrame implements ActionListener {
    Random random = new Random();
    static int num1, num2;      //static variables
    int Answer;                 //instance variable
    int getText;                //instance variable


    //components in JFrame
    JLabel l1 = new JLabel("Display Question ->");
    JLabel l2 = new JLabel("Question type ->");
    JButton b1 = new JButton("Generate");
    JTextField t1 = new JTextField(10);
    JButton b2 = new JButton("Submit");
    JComboBox c1 = new JComboBox();


    //Constructor of MathQuizApp
    public MathQuizApp(){

        //initializing frame properties
        setVisible(true);
        setTitle("Math Quiz App");
        setBounds(570, 270,400, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        //aligning JComponents
        l2.setBounds(30 , 20 , 150 , 30);
        c1.setBounds(210 ,20 , 100 , 30);
        l1.setBounds(30 , 80 , 150 , 30);
        b1.setBounds(210 ,80 , 100 , 30);
        t1.setBounds(30 ,140 , 100 , 30);
        b2.setBounds(210 , 140 , 100 , 30);


        //adding components into frame
        add(l2);
        add(c1);
        add(l1);
        add(b1);
        add(t1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        c1.setSelectedItem(0);

        //Options of Combo Box
        c1.addItem("Select");
        c1.addItem("Addition");
        c1.addItem("Subtraction");
        c1.addItem("Multiplication");
        c1.addItem("Division");

    }


    //Method for Selecting random number
    public void RandomNo(){
        if(c1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Please Select Question Type!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }else if(c1.getSelectedIndex() == 1){
            num1 = random.nextInt(50);
            num2 = random.nextInt(50);
            l1.setText("What is " + num1 + " + " + num2 );
        }else if(c1.getSelectedIndex() == 2){
            num1 = random.nextInt(50);
            num2 = random.nextInt(50);
            l1.setText("What is " + num1 + " - " + num2 );
            if(num1 < num2){
                JOptionPane.showMessageDialog(this, "Not Valid Question!", "Message", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(this, "Please Re-click on button!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }else if(c1.getSelectedIndex() == 3){
            num1 = random.nextInt(50);
            num2 = random.nextInt(50);
            l1.setText("What is " + num1 + " * " + num2 );
        }else if (c1.getSelectedIndex() == 4){
            num1 = random.nextInt(50);
            num2 = random.nextInt(50);
            l1.setText("What is " + num1 + " / " + num2 );
            if(num2 == 0){
                JOptionPane.showMessageDialog(this, "Can't divide by Zero!", "Message", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(this, "Please Re-click on button!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    //Code for Validating result
    public void CheckAnswer(){
        try {
            if(c1.getSelectedIndex() == 1){
                Answer = num1 + num2;
                getText = Integer.parseInt(t1.getText());
                if(getText == Answer){
                    JOptionPane.showMessageDialog(this, "Correct Answer.", "Message", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(this, "Wrong Answer!", "Message", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(this, "Correct Answer is: " + Answer , "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }else if(c1.getSelectedIndex() == 2){
                Answer = num1 - num2;
                getText = Integer.parseInt(t1.getText());
                if(getText == Answer){
                    JOptionPane.showMessageDialog(this, "Correct Answer.", "Message", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(this, "Wrong Answer!", "Message", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(this, "Correct Answer is: " + Answer , "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }else if(c1.getSelectedIndex() == 3){
                Answer = num1 * num2;
                getText = Integer.parseInt(t1.getText());
                if(getText == Answer){
                    JOptionPane.showMessageDialog(this, "Correct Answer.", "Message", JOptionPane.INFORMATION_MESSAGE);

                }else {
                    JOptionPane.showMessageDialog(this, "Wrong Answer!", "Message", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(this, "Correct Answer is: " + Answer , "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }else if (c1.getSelectedIndex() == 4){
                float Answer = (num1 / num2);
                getText = Integer.parseInt(t1.getText());
                if(getText == Answer){
                    JOptionPane.showMessageDialog(this, "Correct Answer.", "Message", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(this, "Wrong Answer!", "Message", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(this, "Correct Answer is: " + Answer , "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please enter valid input!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }



    //Action Performed by Buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            RandomNo();
        }else{
            if(c1.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(this, "Please Select Question Type!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            CheckAnswer();
        }
    }


    //Main Method
    public static void main(String[] args) {
        MathQuizApp m1 = new MathQuizApp();
    }
}
