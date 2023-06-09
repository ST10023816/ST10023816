/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;

import javax.swing.JOptionPane;

/**
 *
 * @author bridgette
 */
public class vInformation {
    

    boolean checkTaskDescription(String TaskDescription) {
       boolean length = false;
       for (int i = 0; i < TaskDescription.length(); i++)
       if( TaskDescription.length() == 50){
                length = true;
       }else {
           length = false;
       }
        return false;
       
    }
    private static String TaskDuration(int seconds){
        final int MINUTES_IN_AN_HOUR = 60;
        final int SECONDS_IN_AN_MINUTE = 60;
        
        int minutes = seconds / SECONDS_IN_AN_MINUTE ;
        seconds -= minutes * SECONDS_IN_AN_MINUTE ;
        
        
        int hours = minutes / MINUTES_IN_AN_HOUR ;
        minutes -= hours * MINUTES_IN_AN_HOUR ;
        
        return hours + "hours" + minutes + "minutes "+ seconds+ "seconds";
    }

  //used to determine if all the conditions have been met
     public boolean taskDescription (String UserInfo, String Statement, String Quit){
           boolean wasMet = false;
        boolean userinfo = UserInfoValidation(UserInfo);
        boolean statement = StatementValidation(Statement);
        boolean quit = QuitValidation(Quit);
        
         //stores all the conditions in an array
        boolean[] checkTaskDescription = {userinfo, statement, quit};

        //checks if isConditionsMet all contain true statements
        for (int i = 0; i < checkTaskDescription.length; i++) {

            if (checkTaskDescription[i] == false) {
                errorMessage(i);
                break;
            } else if (i == 3 && checkTaskDescription[i] == true) {
                wasMet = true;
            }
        }
         return wasMet;
     }

    private void errorMessage(int num) {
      switch (num) {
            case 0:
                JOptionPane.showMessageDialog(null, "Task successfully captured");
                break;  
                 case 1:
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                break;
                case 2:
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please \n "
                        + "ensure that your username contains an underscore \n"
                        + " and is no more than 5 characters in length .”");
                break;
    }
}

    private boolean QuitValidation(String Quit) {
       
        return false;
       
    }

    private boolean StatementValidation(String Statement) {
       
        return false;
       
    }

    private boolean UserInfoValidation(String UserInfo) {
        
        return false;
        
    }
}
     

