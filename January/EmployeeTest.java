/**
 * @(#)EmployeeTest.java
 *
 *
 * @author 
 * @version 1.00 2017/1/17
 */

import java.util.Scanner;
public class EmployeeTest {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	String name, roll;
    	double salary;
    	
    	System.out.print("Enter your name: ");
    	name = input.nextLine();
    	System.out.print("Enter your roll: ");
    	roll = input.nextLine();
    	System.out.print("Enter your salary: ");
    	salary = input.nextDouble();
    	
    	Emplayee E1 = new Emplayee(name,roll,salary);
    	
    	System.out.println(E1.toString());
    }
    
    
}