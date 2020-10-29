/**
 * @(#)AgeIncreaseMethod.java
 * Take in a number and pass this number to a mehtod 
 * where it wil be added to your age and printed out.

 * @author 
 * @version 1.00 2016/11/22
 */

import java.util.Scanner;
public class AgeIncreaseMethod {
	static Scanner input = new Scanner(System.in);
	
    public static void main (String args[]) {
    	int num=0, NumAndAge;
    	
    	System.out.print("Enter the number you wish to be added: ");
    	num = input.nextInt();
    	
    	AddToAge(num);
    }//End Main
    
    public static void AddToAge(int num0[){
        int NumAndAge = num + 19;
    	System.out.println("The age and number added equal to "+NumAndAge);
    }//End AddToAge
    
}//End class