/** 4
 * @(#)InputName.java
 * Take in a users name and print "hello *user*"
 * @author
 * @version 1.00 2016/9/15
 */
 
 //used when taking inputs from the user
import java.util.Scanner;

public class InputName {

    public static void main(String args[]) {
    	
		//used when taking inputs from the user
    	Scanner input = new Scanner(System.in);
    	
    	//promt the user
    	String name;
    	
    	//take in the users name and store it
    	System.out.println("Enter your name: ");
		
		//store the users input to the variable
    	name = input.next();
  		
  		//print the users name
  		System.out.println("hello" + " " + name);

    }//End of main method


}//End of class