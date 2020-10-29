/**
 * @(#)IfAgeVoteTest.java
 * Take in users age and print if they can vote or not
 * @author 
 * @version 1.00 2016/10/6
 */

import java.util.Scanner;
public class IfAgeVoteTest {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int age;
    	
    	System.out.print("Enter your age: ");
    	age = input.nextInt();
    	if(age<18){
    		System.out.println("I'm sorry. You are too young to vote at "+age+".");
    	}
    	else{
    		System.out.println("Good news! "+age+" is old enough to vote!");
    	}
    	
    	
    }//End method
    
    
}//End class