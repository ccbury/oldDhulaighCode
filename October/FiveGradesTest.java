/**
 * @(#)FiveGradesTest.java
 * Take in 5 grades. Print average highest and lowest grade.
 * @author Conor Bury 
 * @version 1.00 2016/10/6
 */

import java.util.Scanner;
public class FiveGradesTest {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int average, total=0, grade, highest=0, lowest=100;
    	
    	for(int i=1; i<=5; i++){
    		System.out.print("Enter grade "+i+": ");
    		grade = input.nextInt();
    		
    		total += grade;
    		
    		if(grade<lowest){
    			lowest = grade;
    		}
    		if(grade>highest){
    			highest = grade;
    		}
    		
    	}
    	
    	average = total/5;
    	
    	System.out.println("The average of the grades was "+average);
    	System.out.println("The lowest grade was "+lowest);
    	System.out.println("The highest grade was "+highest);
    	
    	
    }//End method
    
    
}//End class