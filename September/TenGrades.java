/** 22
 * @(#)TenGrades.java
 * Take the ten grades and get the average grade
 * @author Conor Bury
 * @version 1.00 2016/9/27
 */

import java.util.Scanner;

public class TenGrades {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	
    	// Declare variables
    	double grade, average, total=0;
    	int numberof;
    		
    	System.out.print("Enter the number of tests: ");
    	numberof = input.nextInt();
    	System.out.println();
    	
    	
    	for(int i=1; i<=numberof; i++){
    		System.out.print("Enter Grade " +i+": ");
    		grade = input.nextDouble();
    		total = total + grade;
    	}
    	
    	average = total / numberof;
    	System.out.println("\nThe average was " + average +"\n");
    	
    }// End main method
    
    
}// End class