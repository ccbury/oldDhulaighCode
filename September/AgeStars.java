/** 25
 * @(#)AgeStars.java
 * Take in age from user and print age amout of stars
 * @author Conor Bury
 * @version 1.00 2016/9/29
 */

import java.util.Scanner;

public class AgeStars {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	
    	int age,newline;
    	
    	System.out.print("Enter your age: ");
    	age=input.nextInt();
    	
    	newline = age /10;
    	System.out.println("You are "+age+". So here are "+age+" stars for you!\n");
    	
    	for(int i=1;i<=age;i++){
    		System.out.print(" *");
    		
    		if ((i%10)==0){
    			
    			//Start of 'Murica 1/2
    			if(age==50){
    				if((i%20)==0){    	
    					System.out.println(" ------------------------------------");			
    				}
    				else{
    					System.out.println(" ||||||||||||||||||||||||||||||||||||");
    				}
    			}//End of 'Murica 1/2
    			
    			else{
    				System.out.println();
    			}
    			
    		}//End if
    		
    		
    	}//End for
    	
    	//Start of 'Murica 2/2
    	if(age==50){
    		for(int i=1; i<=6;i++){
    			if((i%2)==0){
    				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    			}
    			else{
    				System.out.println("---------------------------------------------------------");
    			}
    		}
    	}//End of 'Murica 2/2
    	
    	System.out.println();
    	
    }//End main method
    
    
}//End class