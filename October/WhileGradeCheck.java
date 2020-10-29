/** 5
 * @(#)WhileGradeCheck.java
 * Take in 5 grades between 0 and 100.
 * If grade is not 0-100 print an error
 * @author Conor bury
 * @version 1.00 2016/10/7
 */

import java.util.Scanner;
public class WhileGradeCheck {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	
    	int i=1, average, total=0, grade;
    	
    	while(i<=5){
    		System.out.print("Enter grade "+i+": ");
    		grade = input.nextInt();
    		
    		if(grade>100){
    			System.out.println("\007ERROR grade must be between 0 and 100!");
    		}
    		else if(grade<0){
    			System.out.println("\007ERROR grade must be between 0 and 100!");
    		}
    		else{
    			total += grade;
    			i++;
    		}
    		
    	}
    	average = total/5;
    	
    	System.out.println("Average grade was "+average+".");
    	
    	
    }//End method
    
    
}//End class