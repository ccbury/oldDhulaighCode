/** 6
 * @(#)WhileAgeVote.java
 * Take in age from user and tell them if they can vote
 * @author
 */

import java.util.Scanner;
public class WhileAgeVote {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int i=1, age;
    	String st="";
    	
    	while(i<2){
    		System.out.print("Enter your age: ");
    		st = input.next();
    		
    		if(!st.matches("\\d+")){
    			System.out.println("ERROR, digits only.");
    		}
    		else{
    			i++;
    		}
    	}
    	age = Integer.parseInt(st);
    	if(age>17){
    		System.out.println(age+" is old enough to vote.");
    	}
    	else{
    		System.out.println(age+" is not old enough to vote.");
    	}
    }//End method
    
    
}//End class