/** 23
 * @(#)PassCheck.java
 * Take in a grade from the user and tell them if they passed
 * @author 
 * @version 1.00 2016/9/29
 */

import java.util.Scanner;

public class PassCheck {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	
    	double grade;
    	
    	System.out.print("Enter your grade: ");
    	grade = input.nextDouble();
    	
    	if(grade>49){
    		System.out.println("Your Passed!");
    	}
    	else{
    		System.out.println("You failed...");
    	}
    	
    }// End main method
    
    
}//End class