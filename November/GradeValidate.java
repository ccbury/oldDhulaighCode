/**
 * @(#)GradeValidate.java
 * Take a persons grade and tell them if they got a distinction pass merit and Unsuccessful
 * Check for non digits
 * @author 
 * @version 1.00 2016/11/10
 */

import java.util.*;
public class GradeValidate {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	String gradeStr = "";
    	int grade= 0;
    	
    	System.out.print("Enter the grade: ");
    	gradeStr = input.nextLine();
    	
    	while(!gradeStr.matches("\\d+")){
    		System.out.println("ERROR IN INPUT \007");
    		
    		System.out.print("Enter the grade: ");
    		gradeStr = input.nextLine();
    	}
    	
    	grade = Integer.parseInt(gradeStr);
    	
    	if(grade>=80){
    		System.out.println("Grade was a distinction!");
    	}
    	else if(grade>=65){
    		System.out.println("Grade was a merit!");
    	}
    	else if(grade>=50){
    		System.out.println("Grade was a pass!");
    	}
    	else{
    		System.out.println("Grade was unsuccessful...");
    	}
    	
    }
    
    
}