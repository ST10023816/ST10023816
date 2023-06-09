
package part2;

//imports java swing class so that this class can inherits its static methods(Orielly, 2023)
import javax.swing.*;

//imports java awt class so that this class can inherits its methods (Tutorialspoint, 2023)
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// will implement the Actionlistener in the class(JavaTPoint, 2021)
public class register implements ActionListener{
 //gets the inputs stored in the TextField
       public static String firstName ;
        public static String lastName ;
        public static String username ;

        //retrieves the password that was stored in a char array "JPasswordField"
        public static String Password ;


    //JFrame will be used to construct a new frame (Tutorialspoint, 2023)
    JFrame frame;

    //will be used to construct a new Button Component
    JButton b1;

    //will be used to construct a new Panel Components
    JPanel p1;
    JPanel p2;
    //will be used to construct a new TextField Component
    JTextField userText;
    JTextField firstNameText;
    JTextField lastNameText;

    // will be used to construct a new PasswordField Component
    JPasswordField passwordText;

    //will be used to construct a new Label Components
    JLabel userLabel;
    JLabel fistNameLabel;
    JLabel lastNameLabel;
    JLabel passwordLabel;

    //Class object
    storedUser user = new storedUser();

    //constructor
    public register() {

        //constructs new components
        frame = new JFrame();
        //sets the components properties
        frame.setTitle("Registration Form");
        frame.setLayout(new FlowLayout());
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
        firstNameText = new JTextField();
        lastNameText = new JTextField();

        //setting the Password TextField to display '*' characters
        passwordText.setEchoChar('*');

        //creating label objects
        fistNameLabel = new JLabel("Enter First Name : ");
        lastNameLabel = new JLabel("Enter Last Name : ");
        userLabel = new JLabel("Enter UserName : ");
        passwordLabel = new JLabel("Enter Password : ");

        //creating panel objects
        p1 = new JPanel(new GridLayout(4,1));
        p1.setPreferredSize(new Dimension(300,80));

        //adding label, TextField and PasswordField properties into the p1 and p2 panels
        p1.add(fistNameLabel);
        p1.add(firstNameText);
        p1.add(lastNameLabel);
        p1.add(lastNameText);
        p1.add(userLabel);
        p1.add(userText);
        p1.add(passwordLabel);
        p1.add(passwordText);

        frame.getContentPane().add(p1);
        frame.add(p1);
    }

    private void setPanel2(){

        //creating button objects
        b1 = new JButton("Register");

        p2 = new JPanel();
        p2.setPreferredSize(new Dimension(350,100));

        //adding b1 and b2 properties into the p1 and p2 panels
        p2.add(b1);

        //this anonymous class is used to implement the action listener to the register button (JavaTPoint. 2021)
        b1.addActionListener(this);

        frame.getContentPane().add(p2);
        frame.add(p2);
    }

    public void removeFieldText(){
        userText.setText("");
        passwordText.setText("");

    }

    public void setInfo(String firstName, String lastName, String username, String Password){
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(username);
        user.setPassword(Password);

    }

    //overrides the actionPerformed method when the button is clicked(JavaTPoint, 2021)
    @Override
    public void actionPerformed(ActionEvent e) {

        //gets the inputs stored in the TextField
        String firstName = firstNameText.getText();
        String lastName = lastNameText.getText();
        String username = userText.getText();

        //retrieves the password that was stored in a char array "JPasswordField"
        String Password = String.valueOf(passwordText.getPassword());

        boolean areConditionsMet;

        vRegistration reg = new vRegistration();
        areConditionsMet = reg.conditionsMet(firstName, lastName, username, Password);

        //if true, the account has been successfully created
        if(areConditionsMet){

            //add the information to the user class
            setInfo(firstName, lastName, username, Password);

            //empties the fields of data
            removeFieldText();

            frame.dispose();

            //JOptionPane Message Dialog (Orielly, 2023)
            JOptionPane.showMessageDialog(null,"You Have successfully registered your account");
            JOptionPane.showMessageDialog(null,"You will be directed to the login page ");

         Login log = new Login(user);

        }
//1.	JavaTPoint. 2021. How to write ActionListener. (n.d). Available at: https://www.javatpoint.com/java-actionlistener [30 April 2023].
    }
}

