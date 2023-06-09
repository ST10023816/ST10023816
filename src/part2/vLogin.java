/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;
//imports java swing class so that this class can inherits its static methods (Orielly, 2023)
import javax.swing.*;

public class vLogin {

    storedUser existingUser;
    //used to see if the Username has met the requirements
    public boolean checkUserName(String userName){

        //contains "_" and is not greater than 5
        if(userName.contains("_") && userName.length() <= 5){
            return true;
        }
        else{
            return false;
        }
    }

    //used to see if the Password has met the requirements
    public boolean checkPasswordComplexity(String password){

        //holds a string of special characters
        String specialCharacter = "¬!£$%^&*(_~?<>";
        boolean isNum = false;
        boolean isSpecial = false;
        boolean isCapital = false;

        //checks if the length of the password is greater or equal to 8
        if (password.length() >= 8) {
            for (int i = 0; i < password.length (); i++){
                // determines whether a specified character is a digit or not (GeeksofGeeks, 2023)
                if (Character.isDigit(password.charAt(i))) {
                    isNum = true;
                }
                //check whether the specified character is an uppercase character or not (Studytonight, 2023)
                else if (Character.isUpperCase(password.charAt(i))) {
                    isCapital = true;
                }
                //check whether the specified character is an special character or not
                else if (specialCharacter.contains(Character.toString(password.charAt(i)))) {
                    isSpecial = true;
                }
            }
            if (isNum == true && isCapital == true && isSpecial == true ) {
                return true;
            }
        }

        return false;
    }

    //return an error message
    public String registeredUser(String type){

        if(type == "userName"){
            return "The username is incorrectly formatted";
        }
        else{
            return "The password does not meet the complexity requirements.";
        }
    }


    //used to determine if all the conditions have been met
    public boolean conditionsMet(String userName,String password){
        boolean wasMet = false;
        boolean uName= checkUserName(userName);
        boolean pWord= checkPasswordComplexity(password);

        //stores all the conditions in an array
        boolean [] isConditionsMet = {uName, pWord};

        //checks if isConditionsMet all contain true statements
        for(int i = 0; i < isConditionsMet.length; i++){

            if(isConditionsMet[i] == false){
                errorMessage(i);
                break;
            }
            else if (i == 1 && isConditionsMet[i] == true ){
                wasMet = true;
            }
        }

        return wasMet;

    }

    //will be used to verify if the user exists
    public boolean loginUser(String userName, String password){

        boolean Username = false;
        boolean Password = false;
        String username = existingUser.getUserName();
        String pword = existingUser.getPassword();

        if(username.equals(register.username)){
            Username = true;
        }
        if(password.equals(register.Password)){
            Password = true;
        }
        if(Username == true && Password == true){
            return true;
        }
        else{
            return false;
        }

    }

    //displays an error message if a condition is not met
    public void errorMessage(int num){

        switch(num)
        {
            case 0 :
                JOptionPane.showMessageDialog(null, registeredUser("userName"));
                break;
            case 1 :
                JOptionPane.showMessageDialog(null, registeredUser("password"));
                break;
        }
    }

    //returns a message if the user has logged in successfully or not
    public String returnLoginStatus(String status){


        if(status == "successful"){

           return "A successful login";
        }
        else{
            return "A failed login";
        }

    }

    //once the user has register, this method will be used to capture those data
    public void storedRegisteredUser(storedUser user){

        existingUser = user;
    }

    public String returnInfo(){
        return existingUser.getFirstName() + " " + existingUser.getLastName();
    }


}
