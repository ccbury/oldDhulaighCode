/** 11
 * @(#)PassFail.java
 * Take a grade from the user. Tell if pass or fail
 * @author 
 * @version 1.00 2016/9/22
 */
import java.util.Scanner;

public class PassFail {

    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int grade;
    String subject;
    
    System.out.print("What subject did you do? ");
    subject = input.nextLine();
    
    System.out.print("What grade did you get? ");
    grade = input.nextInt();
    
    if(grade<50){
    	System.out.println("You failed "+ subject +"...");
    
    }
    else{
    	System.out.println("You passed " + subject + "!!!!");
    }// End of IF
    
    }// End of method
    
    
}//End of class