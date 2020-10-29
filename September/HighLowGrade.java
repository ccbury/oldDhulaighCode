/** 24
 * @(#)HighLowGrade.java
 * Take in 5 grades and tell the user the average.
 * Tell the user the highest and lowest grade
 * @author Conor Bury
 * @version 1.00 2016/9/29
 */

import java.util.Scanner;
public class HighLowGrade {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	
    	double grade, average, total=0, lowest=100, highest=0;
    	
    	for(int i=1; i<=5; i++){
    		System.out.print("Enter grade "+i+": ");
    		grade = input.nextDouble();
    		if(grade<lowest){
    			lowest = grade;
    		}
    		if(grade>highest){
    			highest = grade;
    		}
    		total = total + grade;
    	}
    	average = total/5;
    	System.out.println("average was "+average);
    	
    	System.out.println("lowest was "+lowest);
    	System.out.println("highest was "+highest);
    	
    }//End of main method 
    
    
}//End of class