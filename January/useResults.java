/**
 * @(#)useResults.java
 * @author 
 * @version 1.00 2017/2/9
 */

import java.util.Scanner;
public class useResults {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	Results points[] = new Results[6];
    	int total=0;
    	
    	for(int i=0; i<6; i++){
    		points[i] = new Results();
    		
    		System.out.print("Subject "+(i+1)+": ");
    		points[i].setSubject(input.next());
    		
    		System.out.print("Grade "+(i+1)+": ");
    		points[i].setGrade(input.nextInt());
    		
    		total += points[i].calculatePoints();
    	}//End for loop
    	
    	System.out.println("\nTotal points awarded were "+total);
    }//End main
    
    
}//End class