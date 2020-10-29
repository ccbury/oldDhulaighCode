/**
 * @(#)FullNameMethod.java
 *
 *
 * @author 
 * @version 1.00 2016/11/11
 */

import java.util.Scanner;
public class FullNameMethod {
	static String Fname, Sname;
    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    
    	
    	System.out.print("Enter your first name: ");
    	Fname = input.next();
    	
    	System.out.print("Enter your surname name: ");
    	Sname=input.next();

    	print_name();

    
    }
    public static void print_name(){
    	System.out.println("Hello "+Fname+" "+Sname);
    }
    
    
}