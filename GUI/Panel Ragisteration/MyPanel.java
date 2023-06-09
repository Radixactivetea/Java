import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MyPanel extends JPanel {
    private JButton submitButton;
    private JButton clearButton;
    private JLabel title;
    private JLabel courses;
    private JLabel labelMatric;
    private JComboBox courseList;
    private JTextField studentNameField;

    public MyPanel() {
        //construct preComponents
        String[] courseListItems = {"Software Engineering", "Network Engineering", "Data Science"};

        //construct components
        submitButton = new JButton ("Register");
        submitButton.addActionListener(new RegisterListener());
        clearButton = new JButton ("Clear");
        clearButton.addActionListener(new ClearListener());
        title = new JLabel ("Course Registration");
        courses = new JLabel ("Course");
        labelMatric = new JLabel ("Matric No.");
        courseList = new JComboBox (courseListItems);
        studentNameField = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension (752, 425));
        setLayout (null);

        //add components
        add (submitButton);
        add (clearButton);
        add (title);
        add (courses);
        add (labelMatric);
        add (courseList);
        add (studentNameField);

        //set component bounds (only needed by Absolute Positioning)
        submitButton.setBounds (85, 120, 100, 20);
        clearButton.setBounds (195, 120, 100, 20);
        title.setBounds (130, 10, 125, 25);
        courses.setBounds (20, 50, 100, 25);
        labelMatric.setBounds (10, 80, 100, 25);
        courseList.setBounds (85, 50, 210, 25);
        studentNameField.setBounds (85, 80, 210, 25);
    }

    private class RegisterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Get the selected course and student name
            String course = (String) courseList.getSelectedItem();
            String studentName = studentNameField.getText();

            // Write the information to a text file
            try {
                FileWriter fw = new FileWriter("registration.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(studentName + " has registered for " + course);
                bw.newLine();
                bw.close();
                JOptionPane.showMessageDialog(null,"Registration Successful!");
            } catch (IOException ioe) {
                JOptionPane.showMessageDialog(null,"Error Occured, please try again!");
                ioe.printStackTrace();
            }
        }
    }

    private class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Clear the JComboBox and JTextField
            courseList.setSelectedIndex(-1);
            studentNameField.setText("");
        }
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("Course Registration");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }
}