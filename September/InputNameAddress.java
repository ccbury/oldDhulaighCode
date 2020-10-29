/** 9
 * @(#)InputNameAddress.java
 * Take a users name and age and print these details
 * @author Conor Bury
 * @version 1.00 2016/9/20
 */

import java.util.Scanner;

public class InputNameAddress {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	// Declare the strings
    	String name;
    	String address;
    	int age;
    	
    	// Take the users details
    	System.out.print("Input name: ");
    	name = input.nextLine();
    	System.out.print("Input your address: ");
    	address = input.nextLine();
    	System.out.print("Input age: ");
    	age = input.nextInt();
    	
    	// Print the details
    	System.out.println("Welcome " + name + " aged " + age + " Year(s) old.. You live at " + address);
    	
    	
    	
    }//End of main method
    
    
}//End of class