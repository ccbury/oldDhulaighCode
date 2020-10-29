/**
 * @author 
 * @version 1.00 2016/11/18
 */

import java.util.Scanner;
public class GradeValidate2 {
	
	static Scanner input = new Scanner(System.in);
	
    public static void main (String args[]) {
    	String gradeStr;
    	int grade;
    	
    	System.out.print("Enter you grade: ");
    	gradeStr = input.nextLine();
    	
    	grade = Validate(gradeStr);
    	
    	GradeResult(grade);
    }//End Main Method
    
    public static int Validate(String gradeStr){
    	int grade;
    	while(!gradeStr.matches("\\d+")){
    			System.out.println("ERROR IN INPUT");
    		
    			System.out.print("Enter the grade: ");
    			gradeStr = input.nextLine();
    	}
    	grade = Integer.parseInt(gradeStr);
    	return grade;
    }//End Validate Method
    
    public static void GradeResult(int grade){
    	if(grade>79){
    		System.out.println("You got a Distinction");
    	}
    	else if(grade>59){
    		System.out.println("You got a Merit");
    	}
    	else if(grade>49){
    		System.out.println("You got a Pass");
    	}
    	else{
    		System.out.println("You got a Fail");
    	}
    }//End GradeOut Method
    
}//End class