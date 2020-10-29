/** 30
 * @(#)FiveAgesAverage.java
 * Take in ages from the user and print the averages.
 * @author Conor Bury
 * @version 1.00 2016/10/4
 */

import java.util.Scanner;

public class FiveAgesAverage {
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	int average, total=0, age;
    	
    	for(int i=1; i<=5; i++){
    		System.out.print("Enter age "+i+": ");
    		age = input.nextInt();
    		
    		total = total + age;
    	}
    	
    	average = total/5;
    	System.out.println("Average age was " + average);
    	
    }//End method
    
    
}//End class