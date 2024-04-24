package application;

import javax.swing.*;       //x because it comes from java extended package
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener { //ActionListener:-- for adding click event in the buttons.

    JButton rules,back;
    JTextField tfname;
    Login(){  // constructor of login class for open the frame when the main method is called.
        getContentPane().setBackground(Color.WHITE); // for change the color of frame.
        setLayout(null); // for making own layout that define we are not using the JFrame's layout.

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("application\\icon\\login.jpeg")); //for adding the image in the frame.
        JLabel image = new JLabel(i1); //
        image.setBounds(0,0,600,500);// for making own layout according to us
        add(image);// for placing the image in frame

        JLabel  heading = new JLabel("Simple Minds"); // for writing in the frame.
        heading.setBounds(750,60,300,45);// for showing in the frame.
//        heading.setForeground(Color.RED);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));// for set the font
        heading.setForeground(new Color(30,144,254)); // for changing the fount color of the heading.
        add(heading);// for adding in the frame

        JLabel   name = new JLabel("Enter your name");
        name.setBounds(740,150,300,40);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
        name.setForeground(new Color(30,144,254));
        add( name);

        tfname = new JTextField();  //for crating a box on the frame (for taking users input).
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        rules = new JButton("Rules");// for creating the button of rule's name.
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));//changing the color of button
        rules.addActionListener(this); //for asking to the methode that this is button which is clicked by user.
        rules.setForeground(Color.WHITE);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200,500);//frame length and width.
        setLocation(200,200);//for setting the location of frame.
        setVisible(true); //for visible the frame by default the frame visibility is false.
    }

    public void actionPerformed(ActionEvent ac){// on ActionListener,  unimplemented abstract methods and we override the method
        if(ac.getSource() == rules){// for checking which button is clicked
            String name = tfname.getText();// for taking users input and use it.
            setVisible(false); //for closing the frame
            new Rules(name);// visible the name and call the rules class and run their method.
        }else if(ac.getSource() == back){//when this button is clicked the frame is closed.
            setVisible(false); // for hiding the frame.
        }

    }
    public static void main(String[] args) {
        new Login();  //anonymous object because we do not need to store i variable.
    }
}
