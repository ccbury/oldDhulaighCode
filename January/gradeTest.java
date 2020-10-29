/**
 * @(#)gradeTest.java
 *
 *
 * @author 
 * @version 1.00 2017/2/7
 */

import java.util.Scanner;
public class gradeTest {
	
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	Grade result[] = new Grade[6];
    	int total=0, average;
    	
    	for(int i=0; i<6; i++){
    		result[i] = new Grade();
    		
    		System.out.print("Enter Subject "+(i+1)+": ");
    		result[i].setName(input.next());
    		
    		System.out.print("Enter grade "+(i+1)+": ");
    		result[i].setGrade(input.nextInt());
    		
    		System.out.println();
    	}
    	
    	System.out.print("--------------------------------");
    	
    	for(int i=0; i<6; i++){
    		System.out.println("\nSubject "+i);
    		System.out.println(result[i].getName());
    		System.out.println(result[i].getGrade());
    		total += result[i].getGrade();
    	}
    	
    	System.out.print("--------------------------------");
    	
    	average = total/6;
    	System.out.println("Average grade was "+average);
    	
    }//End main
    
    
}//End class