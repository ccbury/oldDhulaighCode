/** PCode 1
 * @(#)NameTenTime.java
 * Take a name from the user and print 10 times.
 * @author Conor Bury
 * @version 1.00 2016/9/30
 */

import java.util.Scanner;

public class NameTenTime {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	String name;
    	
    	System.out.print("Enter your name: ");
    	name = input.nextLine();
    	
    	System.out.println();
    	
    	for(int i=1; i<=10; i++){
    		System.out.println(i + ": " + name);
    	}
    	
    	System.out.println();
    }//End main method
    
    
}//End class