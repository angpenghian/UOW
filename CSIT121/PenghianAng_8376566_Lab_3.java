package UOW.CSIT121;
// Full name: Penghian Ang
// Java version: 17.0.7, 64 bit
// Tutorial Group: tutorial 1
// Declaration: I declare that this assignment is my own work and i have not passed this progranm to anyone else.
// I am willing to accept whatever penalty given to you. 


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon; 
import javax.swing.ImageIcon; 

class Myself extends JFrame {
    private final JLabel label1; // Name
    private final JTextField tf1; // Textfield to input name
    private final JLabel label2; // DOB
    private final JTextField tf2; // Textfield to input DOB
    private final JLabel label3; // Email
    private final JTextField tf3; // Textfield to input email
    private final JLabel label4; // Image label
    private final JLabel label5; // My comments to the subject, will update further
    private final JTextField[] textFieldArray = new JTextField[2]; // array of JTextFields to comment

    private String[] comments = { "121 is hard", "I wish java is easy like python" }; 

    public Myself() {
        super("Introduction to myself");
        setLayout(new FlowLayout());

        label1 = new JLabel("Name");
        add(label1);

        tf1 = new JTextField("Ang PengHian", 25);
        tf1.setEditable(false);
        add(tf1);

        label2 = new JLabel("Date of Birth");
        add(label2);

        tf2 = new JTextField("12 Feb 1996", 25);
        tf2.setEditable(false);
        add(tf2);

        label3 = new JLabel("Email");
        add(label3);

        tf3 = new JTextField("phang005@mymail.sim.edu.sg", 25);
        tf3.setEditable(false);
        add(tf3);

        label4 = new JLabel();
        Icon image = new ImageIcon("image.jpg");
        label4.setIcon(image);
        label4.setToolTipText("This is an image");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        add(label4);

        label5 = new JLabel("My comments on the subject, will update further");
        add(label5);

        TextFieldHandler handler = new TextFieldHandler();
        for (int i = 0; i < comments.length; i++) {
            textFieldArray[i] = new JTextField(25);
            textFieldArray[i].setText(comments[i]);
            textFieldArray[i].setHorizontalAlignment(SwingConstants.CENTER);
            textFieldArray[i].addActionListener(handler);
            add(textFieldArray[i]);
        }
    }

    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == textFieldArray[0]) {
                comments[0] = textFieldArray[0].getText();
            } else if (event.getSource() == textFieldArray[1]) {
                comments[1] = textFieldArray[1].getText();
                String string = String.format("Summary of your changes%n1. %s%n2. %s", comments[0], comments[1]);
                JOptionPane.showMessageDialog(null, string, "My suggestion to the course", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

public class PenghianAng_8376566_Lab_3 {
    public static void main(String[] args) {
        Myself ms = new Myself();
        ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ms.setSize(400, 500);
        ms.setVisible(true);
    }
}