/**
 * @(#)AssignmentTwo.java
 *
 *
 * @author 
 * @version 1.00 2016/12/1
 */

import java.util.Scanner;
public class AssignmentTwo {

    public static void main(String args[]) {
    
    }
    static Scanner input  = new Scanner(System.in);
    
    static int index;
	static String name[]= {"Ciaran", "Conor", "Jack", "Shay", "Karl"};
	static int pin [] = {123, 136, 303, 404, 505};
	static double balance[]= {404, 0, 42.50, -1000, 0.90};
	static boolean overdraft[] = {false, false, false, true, false};
    
    //Method to lodge money into the users account
	public static void lodge(){
		String lodgestr;
		int lodgeAmount;
		
		System.out.print("Enter amount to lodge >");
		lodgestr = input.next();
		
		lodgeAmount = validatePosDigits(lodgestr);
		
		balance[index] += lodgeAmount;
		
		System.out.println("Your new balance is "+balance[index]+"\n");
		
		displayMenu();
	}//End lodge() Method


	//Method to withdraw money from the users account
	public static void withdraw(){
		String withdrawstr;
		int withdrawAmount;
		
		System.out.print("Enter amount to withdraw >");
		withdrawstr = input.next();
		
		withdrawAmount = validatePosDigits();
		
		balance[index] -= withdrawAmount;
		
		System.out.println("Your new balance is "+balance[index]+"\n");
		
		displayMenu();
	}//End withdraw() Method


	//Method to change the users password. (Cannot be a current password)
	public static void changePassword(){
		boolean flag = false;
		
		
	}//End chanwgePassword() Method
    
}