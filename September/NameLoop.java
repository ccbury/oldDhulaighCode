/** 16
 * @(#)NameLoop.java
 * Take the users name and print 10 times
 * @author Conor Bury
 * @version 1.00 2016/9/23
 */

import java.util.Scanner;

public class NameLoop {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	String name;
    	System.out.print("Enter your name: ");
    	name =input.nextLine();
    	
    	int i;
    	for (i=1; i<=10; i++){
    		System.out.println(i + ". " + name);
    	}
    	
    	
    }
    
    
}