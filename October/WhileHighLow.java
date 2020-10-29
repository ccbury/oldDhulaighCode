/** 4
 * @(#)WhileHighLow.java
 * Take in 5 grades and names using while loops.
 * print the name and grade of the highest and lowest.
 * @author Conor Bury
 * @version 1.00 2016/10/7
 */

import java.util.Scanner;
public class WhileHighLow {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int i=1, highest=0, lowest=100, grade;
    	String name, hname="", lname="";
    	
    	while(i<=5){
    		System.out.print("Enter name "+i+": ");
    		name = input.next();
    		
    		System.out.print("Enter grade "+i+": ");
    		grade = input.nextInt();
    		
    		if(grade>highest){
    			highest = grade;
    			hname = name;
    		}
    		if(grade<lowest){
    			lowest = grade;
    			lname = name;
    		}
    		
    		i++;
    	}
    	
    	System.out.println("Lowest grade was "+lowest+" by "+lname);
    	System.out.println("Highest grade was "+highest+" by "+hname);
    	System.out.println("");
    	
    	
    }//End method
    
    
}//End class