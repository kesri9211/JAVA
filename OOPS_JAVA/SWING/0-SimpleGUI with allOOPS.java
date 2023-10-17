/*To demonstrate all the concepts of OOPs in Java; creating a simple Java GUI 
application that consists of a single button. When the button is clicked, 
it should perform a specific action. Create MyFrame Class with Encapsulation (Constructor), 
Inheritance, Polymorphism (ActionListener), and Interface.Complete the MyFrame class
to create a GUI window (Jframe) with the title “Button Example” and dimensions 300x200 pixels. 
Create a button labeled &quot;Click Me&quot; and add it to the JFrame. When the button is clicked, it should print
the message &quot;Button clicked!&quot; to the console.*/

package javaclass.Button;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*MyFrame class is extending JFrame and this is a type of inheritance, and it represents
IS-A relationship between MyFrame and JFrame classes, which implies MyFrame is a JFrame.
MyFrame also implementing ActionListener which is an interface this shows we are having multiple inheritance in our program.
 */
public class MyFrame extends JFrame implements ActionListener {
/*In the below line we are creating reference of JButton, and it is having HAS-A relationship with MyFrame which implies that MyFrame has a JButton or MyFrame has a
button. */
JButton button;
/*In the below line we are creating constructor of MyFrame class as constructor is a
first method which gets called when we create an instance of a class. Hence, we initialized the
initial state of our MyFrame and all the properties which we required in our frame when it's created.
*/
MyFrame(){
/*setTitle(), setSize(), and setDefaultCloseOperation(), these methods we are inheriting
from JFrame class, and we use these methods to define our frame properties.
*/
setTitle("My First Frame");
setSize(300,200); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/*We are creating a button object with label "Click Me" and store it in the button reference.*/
button = new JButton("Click Me");
/*Here, we are using addActionListener() method of JButton class which will detect
an event or action happen on a button and perform some operation then event or action occurred.
*/
button.addActionListener(this);
/*add() method is coming from JFrame class which is used to add
components on frame. So, here we are adding our button component into our frame.
*/

add(button); }
/*actionPerformed() is coming from ActionListener interface, and we
are passing an argument or ActionEvent type. This method execute set instruction
or code written inside it when some event or action happen. Which is example of Polymorphism
*/
@Override
public void actionPerformed(ActionEvent e) { System.out.println("Button Clicked!");
}
public static void main(String[] args) {
/* Here we are creating one instance of MyFrame class
which will create a frame with ane button component in it, and that button will do something when it gets clicked.
*/
MyFrame frame1 = new MyFrame();
/* By default, frame is not visible, So we have to make visible by using setVisible() method which is coming from JFrame class and pass value true.*/
frame1.setVisible(true); }
}
