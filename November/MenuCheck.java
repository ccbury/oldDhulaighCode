/**
 * @(#)MenuCheck.java
 * Create a menu
 * 1: Say hello
 * 2: exit
 * @author 
 * @version 1.00 2016/11/24
 */

import java.util.Scanner;
public class MenuCheck {

	static Scanner input = new Scanner(System.in);
    public static void main (String args[]) {
    	String strChoice;
    	int choice=0;
    	
    	while(choice!=2){
    		System.out.print("Choose option\n1: Say Hello\n2: Exit\n>");
    		strChoice = input.next();
    		choice = Validate(strChoice);
    		
    		if(choice==1){
    			System.out.println("Hello");
    		}
    		else{
    			System.out.println("Program ending...");
    			System.exit(0);
    		}
    	}
    	
    }//End main method
    
    public static int Validate(String strChoice){
    	while(!strChoice.matches("[1-2]")){
    		System.out.println("Error. Please select 1 or 2");
    		System.out.print("Choose option\n1: Say Hello\n2: Exit\n>");
    		strChoice = input.next();
    	}
    	return Integer.parse(strChoice);
    }
}//End class