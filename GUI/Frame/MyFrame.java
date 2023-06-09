import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    
    MyFrame()
    {
                //JFrame = a GUI window to add components to

        //JFrame frame = new JFrame(); //create a frame
        this.setTitle("Nur Atikah"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out application
        this.setSize(420,420);//sets the size of the frame
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("logo.png"); // create an imageicon
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(000000)); //change color of bacground

    }
}
 