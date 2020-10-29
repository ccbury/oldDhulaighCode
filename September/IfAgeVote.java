/** 10
 * @(#)IfAgeVote.java
 * Determin if the user can vote
 * @author Conor Bury
 * @version 1.00 2016/9/20
 */

import java.util.Scanner;

public class IfAgeVote {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int age;
    	String name;
    	
    	System.out.print("What is your name? ");
    	name = input.nextLine();
    	
    	System.out.print("What age are you? ");
    	age = input.nextInt();
    	
    	
    	if (age >= 18){
    		System.out.println("Congrats "+ name +" you can vote at age "+ age);	
    	}
    	else{
    		System.out.println("Sorry "+ name +" you cannot vote. "+ age+ " is too young");
    	}// End of if/else statement
    
    }//End of main method
    
    
}//End of class