/**
 * @(#)NameAgeOldYoungWhile.java
 * Take in 5 names and their ages. 
 * Print the lowest and highest name and their ages.
 * Use a while loop
 * @author Conor Bury
 * @version 1.00 2016/10/11
 */
 
//Import Scanner
import java.util.Scanner;
//Start class
public class NameAgeOldYoungWhile {
	//Start main method
    public static void main (String args[]) {
    	//Declare variables
    	Scanner input = new Scanner(System.in);
    	int i=1, age,lowest=150, highest=0;
    	String name, highestname="", lowestname="";
    	
    	//Begin while loop
    	while(i<=5){
    		//Prompt the user for name i
    		System.out.print("Enter name "+i+": ");
    		name = input.next();
    		//Prompt the user for age i
    		System.out.print("Enter age "+i+": ");
    		age = input.nextInt();
    		
    		//If to see if age is new lowest, if so set "lowest" and "lowestname"
    		if(age<lowest){
    			lowest=age;
    			lowestname=name;
    		}
    		//If to see if age is new highest, if so set "highest" and "highestname"
    		if(age>highest){
    			highest=age;
    			highestname=name;
    		}
    		//Increment i to next value
    		i++;
    	}
    	//print the results of the loop
    	System.out.println("Lowest age was "+lowestname+" who is "+lowest+"year(s) old");
    	System.out.println("Highest age was "+highestname+" who is "+highest+"year(s) old\n");
    	
    }//End main method
    
    
}//End class