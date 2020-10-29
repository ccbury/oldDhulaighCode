/** 31
 * @(#)AverageGrade.java
 * Take 5 grades print lowest highest and average
 * @author Conor Bury
 * @version 1.00 2016/10/4
 */
import java.util.Scanner;

public class AverageGrade {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int highest =0, lowest=100, average, total=0, grade;
    	
    	for(int i=1; i<=5; i++){
    		System.out.print("Enter grade "+i+": ");
    		grade = input.nextInt();
    		total += grade;
    		
    		if(grade>highest){
    			highest = grade;
    		}
    		if(grade<lowest){
    			lowest = grade;
    		}
    		
    	}
    	
    	average = total/5;
    	System.out.println("\nLowest grade was " + lowest);
    	System.out.println("Average grade was " + average);
    	System.out.println("Highest grade was " + highest);
    	
    	
    }//End method
    
    
}//End class