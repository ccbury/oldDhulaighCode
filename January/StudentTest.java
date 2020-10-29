/**
 * @(#)StudentTest.java
 * Homework 
 * take in a name address and grade from a user and create a new object
 * Display all users details
 * @author 
 * @version 1.00 2017/1/10
 */

import java.util.Scanner;
public class StudentTest {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	String name, address;
    	int grade;
    	//Create a student object
    	student s1 = new student("Conor", "Greenwood", 90);
    	
    	//Print the details of the user s1
    	System.out.println( s1.toString() );
    	
    	//Change the value of grade
    	//s1.setGrade(99);
    	//Print the changed results
    	//System.out.println( s1.getGrade() );
    	
    	
    	//Change the value of name
    	//s1.setName("DickMc Gee");
    	//Print the changed result
    	//System.out.println(s1.getName());
    	
    	//Chasnge the value of address
    	//s1.setAddress("Galway");
    	//Print the changed result
    	//System.out.println(s1.getAddress());
    	
    	System.out.print("\nEnter name: ");
    	name = input.nextLine();
    	System.out.print("Enter address: ");
    	address= input.nextLine();
    	System.out.print("Enter grade: ");
    	grade = input.nextInt();
    	
    	
    	student s2 = new student(name, address, grade);
    	System.out.println(s2.toString());
    
    	
    }//End main
    
    
}//End class