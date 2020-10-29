/**
 * @(#)customerTest.java
 *
 *
 * @author 
 * @version 1.00 2017/1/19
 */

import java.util.Scanner;
public class customerTest {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	String strBalance;
    	
    	System.out.print("Enter customer name: ");
    	String name = input.nextLine();
    	System.out.print("Enter cusstomer address: ");
    	String address = input.nextLine();
    	System.out.print("Enter customer balance: ");
    	double balance = input.nextDouble();
    	
    	customer C1 = new customer(name,address,balance);
    	
    	System.out.println(C1.toString());
    	
    	System.out.print("\nPlease enter a new balance for this customer: ");
    	strBalance = input.next();
    	while (!strBalance.matches("\\d+")){
    		System.out.println("ERROR IN INPUT\nPlease enter digits only!");
    		System.out.print("\nPlease enter a new balance for this customer: ");
    		strBalance = input.next();	
    	}
    	balance = Integer.parseInt(strBalance);
    	
    	C1.setBalance(balance);
    	
    	//Add an amount to the customers balance.
    	System.out.print("\nEnter amount to lodge to balance: ");
    	C1.setBalance(input.nextDouble() + C1.getBalance());
    	
    	System.out.println("The new balance for the customer is - "+C1.getBalance());
    }//End main
    
    
}///End class