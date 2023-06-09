/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;

//imports java swing class so that this class can inherits its static methods (Orielly, 2023)
import javax.swing.*;

//imports java awt class so that this class can inherits its methods (Tutorialspoint, 2023)
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// will implement the Actionlistener in the class(JavaTPoint, 2021)
public class Login implements ActionListener{

    //JFrame will be used to construct a new frame (Tutorialspoint, 2023)
    JFrame frame;

    //will be used to construct a new Button Component
    JButton b1;

    // will be used to construct a new Panel Components
    JPanel p1;
    JPanel p2;

    //will be used to construct a new TextField Component
    JTextField userText;

    //will be used to construct a new PasswordField Component
    JPasswordField passwordText;

    //will be used to construct a new Label Components
    JLabel userLabel;
    JLabel passwordLabel;

    //Class object
    storedUser user;

    public Login(storedUser logginIN) {

        //constructs new components
        frame = new JFrame();
        //sets the components properties
        frame.setTitle("Login Form");
        frame.setLayout(new FlowLayout());
        user = logginIN; //passes the loggin class objects values and stores them in the user class object
        setPanel1();//class the method to create the panel
        setPanel2();//class the method to create the panel
        frame.setSize(350,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setPanel1(){

        //creating TextField objects
        passwordText = new JPasswordField();
        userText = new JTextField();

        //setting the Password TextField to display '*' characters
        passwordText.setEchoChar('*');

        //creating label objects
        userLabel = new JLabel("Enter UserName : ");
        passwordLabel = new JLabel("Enter Password : ");

        //creating panel objects
        p1 = new JPanel(new GridLayout(2,1));
        p1.setPreferredSize(new Dimension(300,50));

        //adding label, TextField and PasswordField properties into the p1 and p2 panels
        p1.add(userLabel);
        p1.add(userText);
        p1.add(passwordLabel);
        p1.add(passwordText);

        frame.getContentPane().add(p1);
        frame.add(p1);
    }

    private void setPanel2(){

        //creating button objects
        b1 = new JButton("Login");

        p2 = new JPanel();
        p2.setPreferredSize(new Dimension(350,100));

        //adding b1 and b2 properties into the p1 and p2 panels
        p2.add(b1);

        //this anonymous class is used to implement the action listener to the register button (JavaTPoint. 2021)
        b1.addActionListener(this);

        frame.getContentPane().add(p2);
        frame.add(p2);
    }

    //Will clear up the field
    public void removeFieldText(){
        userText.setText("");
        passwordText.setText("");
    }

    //overrides the actionPerformed method when the button is clicked(JavaTPoint, 2021)
    @Override
    public void actionPerformed(ActionEvent e) {

        //gets the inputs stored in the userName TextField
        String username = userText.getText();

        //retrieves the password that was stored in a char array "JPasswordField"
        String password = String.valueOf(passwordText.getPassword());

        boolean areConditionsMet;

        vLogin log = new vLogin();
        log.storedRegisteredUser(user);
        areConditionsMet = log.conditionsMet(username, password);

        //if the conditions are true
        if(areConditionsMet){
            boolean userExist = log.loginUser(username, password);
            //if user exists
            if(userExist){
                removeFieldText();
                //JOptionPane Message Dialog (Orielly, 2023)
                JOptionPane.showMessageDialog(null, log.returnLoginStatus("successful"));
                JOptionPane.showMessageDialog(null, "Welcome " + log.returnInfo() + " \n"
                                                                + "it is great to see you again.");
                frame.dispose();
            }
            else{
                //JOptionPane Message Dialog (Orielly, 2023)
                JOptionPane.showMessageDialog(null, "Username or password incorrect,\n please try again");
                JOptionPane.showMessageDialog(null, log.returnLoginStatus("failed"));
            }

        }

    }
}


