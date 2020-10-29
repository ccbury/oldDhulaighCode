/** 12
 * @(#)Grade.java
 * Take in result and tell the user their grade
 * @author 
 * @version 1.00 2016/9/22
 */

import java.util.Scanner;
public class Grade {

    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int grade;
    String subject;
    
    System.out.print("What subject did you do? ");
    subject = input.nextLine();
    
    System.out.print("What grade did you get? ");
    grade = input.nextInt();
    
    if(grade<40){
    	System.out.println("You failed "+ subject +"...");
    }
    else if(grade<55) {
    	System.out.println("You got a D in " + subject + ".");
    }
    else if(grade<70) {
    	System.out.println("You got a C in " + subject +"!");
    }
    else if(grade<85) {
    	System.out.println("You got a B in " + subject +"!");
    }
    else{
    	System.out.println("You got an A in " + subject + "!");
    }// End of if/else
    
    
    }// End of main method 
    
    
}// End of class