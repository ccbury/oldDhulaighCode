/**
 * @(#)AgesMethod.java
 * Take three ages from the user in a method. Get the average of the ages.  
 * @author 
 * @version 1.00 2016/11/15
 */

import java.util.Scanner;
public class AgesMethod {

    public static void main (String args[]) {
    	//Declare variables
    	Scanner input = new Scanner(System.in);
    	int[] age = new int[3];
    	int average;
    	
    	//For loop to take ages.
    	for(int i=0; i<=2; i++){
    	System.out.print("Enter age "+(i+1)+": ");
    	age[i] = input.nextInt();
    	}//End for
    	
    	//Pass ages to method.
    	average = Ages(age[0], age[1], age[2]);
    	System.out.println("Average age was "+average);
    }//End main
    
    public static int Ages(int age1, int age2, int age3){
    	return (age1+age2+age3)/3;

    }//End Ages
    
}//End class