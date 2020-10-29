/** 1
 * @(#)MultipleArrays.java
 * Ask a user for their id. Search the array for their id
 * Print the users details.
 * @author Conor Bury
 * @version 1.00 2016/11/8
 */

import java.util.*;
public class MultipleArrays {

    public static void main(String args[]) {
    	//Variables
    	Scanner input = new Scanner(System.in);
    	int id[] = {1, 2, 3, 4, 5};
    	String name[] = {"Fred", "Ted", "Jed", "Ned", "Brennan"};
    	String address[] = {"Meath", "Kerry", "Space", "Texas", "Cork"};
    	int balance[] = {110, 2345, 2000, 7890, 3000};
    	int IDuser, ArrayPos=0, i;
    	
    	//User input
    	System.out.print("Enter your ID: ");
    	IDuser = input.nextInt();
    	
    	while(IDuser>name.length||IDuser<0){
    		System.out.println("Error no valid ID");
    		System.out.print("Enter your ID: ");
    		IDuser = input.nextInt();
    	}
    	
    	for(i=0; i<name.length; i++){
    		if(IDuser==id[i]){
    			ArrayPos = i;
    			break;
    		}//End if
    	}//End for
    	
    	System.out.println("\nID\tName\t\tAddress\t\tBalance\t");
    	System.out.println("___________________________________________________\n");
    	System.out.println(id[ArrayPos] +"\t" + name[ArrayPos] +"\t\t" + address[ArrayPos] +"\t\t" + balance[ArrayPos] +"\t\n");
    	
    }//End main
    
    
}//End class