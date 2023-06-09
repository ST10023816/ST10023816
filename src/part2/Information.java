package part2;

//imports java swing class so that this class can inherits its static methods(Orielly, 2023)
import javax.swing.*;

//imports java awt class so that this class can inherits its methods (Tutorialspoint, 2023)
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// will implement the Actionlistener in the class(JavaTPoint, 2021)

public class Information implements ActionListener{ /* public is a Java keyword which declares a member's access as public. 
                                             Public members are visible to all other classes. 
                                             This means that any other class can access a public field or method. */
        
    
//gets the inputs stored in the TextField
       public static String UserInfo ;
        public static String Statement ;
        public static String Quit ;

    //JFrame will be used to construct a new frame (Tutorialspoint, 2023)
    JFrame frame;

    //will be used to construct a new Button Component
    JButton b1;

    //will be used to construct a new Panel Components
    JPanel p1;
    JPanel p2;
    //will be used to construct a new TextField Component
    JTextField UserInfoText;
    JTextField StatementText;
    JTextField QuitText;

    //will be used to construct a new Label Components
    JLabel UserInfoLabel;
    JLabel StatementLabel;
    JLabel QuitLabel;
   

   
    //constructor
    public Information() {

        //constructs new components
        frame = new JFrame();
        //sets the components properties
        frame.setTitle("Welcome to EasyKanban");
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
        UserInfoText = new JTextField();
        StatementText = new JTextField();
        QuitText = new JTextField();

        //creating label objects
        UserInfoLabel = new JLabel("Add Tasks : ");
        StatementLabel = new JLabel("Show report : ");
        QuitLabel = new JLabel("Quit : ");
        
        //creating panel objects
        p1 = new JPanel(new GridLayout(4,1));
        p1.setPreferredSize(new Dimension(300,80));

        //adding label, TextField and PasswordField properties into the p1 and p2 panels
        p1.add(UserInfoLabel);
        p1.add(UserInfoText);
        p1.add(StatementLabel);
        p1.add(StatementText);
        p1.add(QuitLabel);
        p1.add(QuitText);
     
        frame.getContentPane().add(p1);
        frame.add(p1);
    }
      private void setPanel2(){

        //creating button objects
        b1 = new JButton("proceed");

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
        UserInfoText.setText("");
        StatementText.setText("");

    }

    public void setInfo(String UserInfo, String Statement, String Quit){
        user.setUserInfo(UserInfo);
        user.setStatement(Statement);
        user.setQuit(Quit);

    }
    
vInformation info = new vInformation();
    @Override
    public void actionPerformed(ActionEvent e) {
         //gets the inputs stored in the TextField
        String UserInfo = UserInfoText.getText();
        String Statement = StatementText.getText();
        String Quit = QuitText.getText();

        boolean checkTaskDescription;

        vInformation infoObj = new vInformation();
        checkTaskDescription = info.taskDescription( UserInfo, Statement,  Quit);

        //if true, the account has been successfully created
        if(checkTaskDescription){

            //add the information to the user class
            setInfo(UserInfo, Statement, Quit);

            //empties the fields of data
            removeFieldText();

            frame.dispose();
            
            String userinfo = JOptionPane.showInputDialog(null, "Choose a option: \n" + 
                    "1. Create a user profile\n" +
                    "2. Search users statement\n" + 
                    "3. Quit Application");
    
            for (int x = 0; x < 3; x++) {   
            String option = null;
         x = Integer.parseInt(option);
         if (x == 1){
              UserInfoLabel = new JLabel();
             String task1 = JOptionPane.showInputDialog(null,"TaskName :"+ "\nTaskDescription :" + 
                "\ndevDetails :"+ "\nTaskID :"+ "\nTaskNumber :"
                + "\nTaskDuration :" + "\nTaskStatus :");
         }
             String descrip = JOptionPane.showInputDialog(null, " Task Description: ");
             while(!info.checkTaskDescription(descrip)){
                 JOptionPane.showInputDialog(null, "Enter description");
             } 
             if (x == 2)
                     {
                     JOptionPane.showMessageDialog(null, "Coming soon");
             } else if (x == 3){
                     System.exit(0);
                     }
         }
         String seconds = JOptionPane.showInputDialog(null, "Enter the total hours");
           
        
    }
    }
    
    private static class user {

        private static void setUserInfo(String UserInfo) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setStatement(String Statement) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setQuit(String Quit) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

      
    }
}

