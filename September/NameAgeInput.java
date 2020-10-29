/** 6
 * @(#)NameAgeInput.java
 * Take the users name and age and print these values.
 * @author Conor Bury
 * @version 1.00 2016/9/16
 */

//Used for taking user input
import java.util.Scanner;

public class NameAgeInput {

    public static void main(String args[]) {
		
		//Used for taking user input    	
    	Scanner input = new Scanner(System.in);	
    	
    	//Daclare variables	
    	String name;
    	int age;
    	
    	//Prompt the user
    	System.out.print("Enter your name:");
    	name = input.nextLine();			// nextLine is used for multiple word input
    	
    	System.out.println();
    	
    	System.out.print("Enter you age in numbers:");
    	age = input.nextInt();				//nextInt is used to input numbers
    	
    	//Print the users name
    	System.out.println();
    	System.out.println("Your name is " + name +  " and you are " + age);
    	
    }//End of main method
    
    
}//End of class