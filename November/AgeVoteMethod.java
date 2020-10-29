/**
 * @(#)AgeVoteMethod.java
 *
 *
 * @author 
 * @version 1.00 2016/11/15
 */

import java.util.*;
public class AgeVoteMethod {

    public static void main (String args[]) {
    	Date D = new Date();
		System.out.println(D);
    	
    	boolean vote = AgeMethod();
    	
    	if(vote == true){
    		System.out.println("You can vote!");
    	}
    	else{
    		System.out.println("You cannot vote :(");
    	}
    	
    }
    public static boolean AgeMethod(){
    	//Declare variables
    	Scanner input = new Scanner(System.in);
    	String ageStr;
    	int age;
    	
    	//Prompt user
    	System.out.print("Enter your age: ");
    	ageStr = input.nextLine();
    	
    	//Error check
    	while(!ageStr.matches("\\d+")){
    		System.out.print("Enter your age: ");
    		ageStr = input.nextLine();
    	}
    	//Convert age to int
    	age = Integer.parseInt(ageStr);
    	
    	//Check for vote
    	if(age>=18){
    		return true;
    	}
    	else{
    		return false;
    	}
    }//End AgeMethod
    
    
}//End class