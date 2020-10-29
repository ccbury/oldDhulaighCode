/** 26
 * @(#)DiagonalLine.java
 * Assk the user to enter a number,
 * print a diagonal line of that length
 * @author Conor Bury
 * @version 1.00 2016/9/30
 */

import java.util.Scanner;
public class DiagonalLine {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	int line;
    	String space = "";
    	
    	System.out.print("Enter a number: ");
    	line = input.nextInt();
    	
    	for(int i=1; i<=line; i++){
    		
    		System.out.println("*");
    		space = space + " ";	
    		System.out.print(space);
    	
    	}
    	System.out.println();
    		
    }//End main method
    
    
}//End class