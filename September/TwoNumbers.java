/** 21
 * @(#)TwoNumbers.java
 * Take an input and tell user which is bigger..
 * @author Conor Bury
 * @version 1.00 2016/9/27
 */

import java.util.Scanner;

public class TwoNumbers {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	
    	//Declare variables
    	int num1, num2;
    	
    	//Promt user
    	System.out.print("Enter the First Number:  ");
    	num1 = input.nextInt();
    	
    	System.out.print("Enter the Second Number: ");
    	num2 = input.nextInt();
    	
    	System.out.println();
    	
    	//Start if statement
    	if(num1>num2){
    		System.out.println("The first number ("+num1+") is bigger then the second ("+num2+").\n");
    	}
    	else if(num1<num2){
    		System.out.println("The second number ("+num2+") is bigger then the first ("+num1+").\n");
    	}
    	else{
    		System.out.println("The Numbers are equal.\n"); 
    	}
    
    
    }//End method
    
    
}//End class