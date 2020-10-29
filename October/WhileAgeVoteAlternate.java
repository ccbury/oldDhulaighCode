/** 6B
 * @(#)WhileAgeVoteAlternate.java
 * Take in a users age and tell them if they can vote.
 * Make sure the user inputs digits.
 * @author Conor Bury
 * @version 2.00 2016/10/9
 */

import java.util.Scanner;
public class WhileAgeVoteAlternate {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int age;
    	String agest;
    	
    	System.out.print("Enter your age: ");
    	agest=input.next();
    	
    	while(!agest.matches("\\d+")){
    		System.out.println("ERROR positive digits only please");
    		
    		System.out.print("Enter age again: ");
    		agest=input.next();
    	}
    	
    	age = Integer.parseInt(agest);
    	if(age<=17){
    		System.out.println("You are too young to vote at age "+age+".");
    	}
    	else{
    		System.out.println("You are old enough to vote at age "+age+".");
    	}
    	
    }//End Method
    
    
}//End Class