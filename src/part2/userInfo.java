/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;

public class userInfo {
     private String TaskName;
    private String TaskDescription;
    private String devDetails;
      private double TaskID;
    private int TaskNumber;
    private float TaskDuration;
    private String TaskStatus;
    
    public userInfo(String TaskName, String TaskDescription, double TaskID, int TaskNumber, float TaskDuration, String devDetails, String TaskStatus){ 
     //Open Key to proceed with the following instructions.
        this.TaskName = TaskName;
        this.TaskDescription = TaskDescription;
        this.devDetails = devDetails;
        this.TaskID = TaskID;
        this.TaskNumber = TaskNumber;
        this.TaskDuration = TaskDuration;
        this.TaskStatus = TaskStatus;
        
    }//close key indicating the instructions above has ended.

    private userInfo() {
          userInfo userObj = new userInfo();
          userObj.getTaskDescription();
        userObj.getTaskDuration();
        userObj.getTaskID();
        userObj.getTaskNumber();
        userObj.getTaskStatus();
        userObj.getdevDetails();
    }
   

    //retrieves the firstName from the global variable userName (W3school, 2023)
    public String getTaskName() {
        return TaskName;
    }

    //sets the firstName to the global variable userName (W3school, 2023)
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    //retrieves the lastName from the global variable userName (W3school, 2023)
    public String getTaskDescription() {
        return TaskDescription;
    }

    //sets the lastName to the global variable userName (W3school, 2023)
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }


    //retrieves the username from the global variable userName (W3school, 2023)
    public double getTaskID() {
        return TaskID;
    }

    //sets the username to the global variable userName (W3school, 2023)
    public void setTaskID(double TaskID) {
        this.TaskID = TaskID;
    }
    
      public int getTaskNumber() {
        return TaskNumber;
    }

    //sets the username to the global variable userName (W3school, 2023)
    public void setTaskNumber(int TaskNumber) {
        this.TaskNumber = TaskNumber;
    }
    
      public float getTaskDuration() {
        return TaskDuration;
    }

    //sets the username to the global variable userName (W3school, 2023)
    public void setTaskDuration(float TaskDuration) {
        this.TaskDuration = TaskDuration;
    }

    //retrieves the password from the global variable password (W3school, 2023)
    public String getdevDetails() {
        return devDetails;
    }

    //sets the password to the global variable password (W3school, 2023)
    public void setdevDetails(String devDetails) {
        this.devDetails = devDetails;
    }
        
     public String getTaskStatus() {
        return TaskStatus;
    }

    //sets the password to the global variable password (W3school, 2023)
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;    
    }
    public String toString() {
        return "TaskName :" +TaskName+ "\nTaskDescription :" +TaskDescription+ 
                "\ndevDetails :"+ devDetails+ "\nTaskID :"+ TaskID+ "\nTaskNumber :"
                + TaskNumber+ "\nTaskDuration :" + TaskDuration+ "\nTaskStatus :"
                + TaskStatus;
    }
   
//2.	Tutorialspoint. 2023.  Swing- JFrame class . (n.d). Available at: https://www.tutorialspoint.com/swing/swing_jframe.htm [30 April 2023].

    public void setUserInfo(String UserInfo) {
       
    }

    public void setStatement(String Statement) {
       
    }

    public void setQuit(String Quit) {
    
    }
 }

