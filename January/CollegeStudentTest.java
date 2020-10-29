/**
 * @(#)CollegeStudentTest.java
 * @author 
 * @version 1.00 2017/2/10
 */

import java.util.Scanner;
import java.util.Date;
public class CollegeStudentTest {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	Date d = new Date();
    	int id;
    	String email, course, output = "";
    	CollegeStudent SU = new CollegeStudent();
    	
    	for(int i=1; i<=3; i++){
    		System.out.print("Enter ID "+i+": ");
    		id= input.nextInt();
    		System.out.print("Enter Email "+i+": ");
    		email = input.next();
    		System.out.print("Enter Course "+i+": ");
    		course = input.next();
    		
    		SU = new CollegeStudent(id, email, course);
    		
    		output += "\nStudent "+i+":\n"+SU.toString();
    	}
    	System.out.println(output+"\n"+d);
    }
    
    
}