/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;
//imports java swing class so that this class can inherits its static methods (Orielly, 2023)
import javax.swing.JOptionPane;
public class vRegistration {

    //used to see if the First Name has met the requirements
    public boolean firstNameValidation(String firstName) {

        //holds a string of special characters
        String specialCharacter = "¬!£$%^&*(_~?<>";
        boolean isNum = false;
        boolean isSpecial = false;

        //checks if there are no digits or special characters in the First Name
        for (int i = 0; i < firstName.length(); i++) {
            // determines whether a specified character is a digit or not (GeeksofGeeks, 2023)
            if (Character.isDigit(firstName.charAt(i))) {
                isNum = true;
            } //check whether the specified character is an special character or not
            else if (specialCharacter.contains(Character.toString(firstName.charAt(i)))) {
                isSpecial = true;
            }
        }
        if (isNum == false && isSpecial == false) {
            return true;
        } else {
            return false;
        }

    }

    //used to see if the Last Name has met the requirements
    public boolean lastNameValidation(String lastName) {

        //holds a string of special characters
        String specialCharacter = "¬!£$%^&*(_~?<>";
        boolean isNum = false;
        boolean isSpecial = false;

        //checks if there are no digits or special characters in the Last Name
        for (int i = 0; i < lastName.length(); i++) {
            // determines whether a specified character is a digit or not (GeeksofGeeks, 2023)
            if (Character.isDigit(lastName.charAt(i))) {
                isNum = true;
            } //check whether the specified character is an special character or not
            else if (specialCharacter.contains(Character.toString(lastName.charAt(i)))) {
                isSpecial = true;
            }
        }
        if (isNum == false && isSpecial == false) {
            return true;
        } else {
            return false;
        }

    }

    //used to see if the Username has met the requirements
    public boolean userNameValidation(String userName) {

        //contains "_" and is not greater than 5
        if (userName.contains("_") && userName.length() <= 5) {
            return true;
        } else {
            return false;
        }

    }

    //used to see if the Password has met the requirements
    public boolean passwordValidation(String password) {

        //holds a string of special characters
        String specialCharacter = "¬!£$%^&*(_~?<>";
        boolean isNum = false;
        boolean isSpecial = false;
        boolean isCapital = false;

        //checks if the length of the password is greater or equal to 8
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                // determines whether a specified character is a digit or not (GeeksofGeeks, 2023)
                if (Character.isDigit(password.charAt(i))) {
                    isNum = true;
                } //check whether the specified character is an uppercase character or not (Studytonight, 2023)
                else if (Character.isUpperCase(password.charAt(i))) {
                    isCapital = true;
                } //check whether the specified character is an special character or not
                else if (specialCharacter.contains(Character.toString(password.charAt(i)))) {
                    isSpecial = true;
                }
            }
            if (isNum == true && isCapital == true && isSpecial == true) {
                return true;
            }
        }

        return false;
    }

    //used to determine if all the conditions have been met
    public boolean conditionsMet(String firstName, String lastName, String userName, String password) {
        boolean wasMet = false;
        boolean fName = firstNameValidation(firstName);
        boolean lName = lastNameValidation(lastName);
        boolean uName = userNameValidation(userName);
        boolean pWord = passwordValidation(password);

        //stores all the conditions in an array
        boolean[] isConditionsMet = {fName, lName, uName, pWord};

        //checks if isConditionsMet all contain true statements
        for (int i = 0; i < isConditionsMet.length; i++) {

            if (isConditionsMet[i] == false) {
                errorMessage(i);
                break;
            } else if (i == 3 && isConditionsMet[i] == true) {
                wasMet = true;
            }
        }

        return wasMet;

    }

    public void errorMessage(int num) {

        switch (num) {
            case 0:
                JOptionPane.showMessageDialog(null, "Your First Name must not be empty");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Your Last Name must not be empty");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please \n "
                        + "ensure that your username contains an underscore \n"
                        + " and is no more than 5 characters in length .”");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please \n"
                        + " ensure that the password contains at least 8 \n"
                        + " characters, a capital letter, a number and a \n"
                        + "special character.");
                break;
        }
    }
}

