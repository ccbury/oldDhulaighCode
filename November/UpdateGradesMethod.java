/**
 * @(#)UpdateGradesMethod.java
 * Take an ID from the user from 1-5
 * Then take a grade from the user for that ID
 * Add the grade entered to the grade stored in the grade array
 * @author 
 * @version 1.00 2016/11/24
 */

import java.util.Scanner;
public class UpdateGradesMethod {
	static Scanner input = new Scanner(System.in);
	static int grades[] = {50,60,40,70,99};
	static int ID;
    public static void main (String args[]) {
     	int ugrade;
     	String strid, strugrade;
     	
     	System.out.print("Enter ID (1-5) >");
     	strid = input.next();
     	ID = ValidateID(strid);
     	
     	System.out.print("Enter a grade to add >");
     	strugrade = input.next();
    	ugrade = ValidateGrade(strugrade);
    	
    	updategrade(ugrade);
    }//End Main method
    
    public static int ValidateID(String idstr){
    	while(!idstr.matches("[1-5]")){
    		System.out.println("Error. Please enter a valid ID");
    		System.out.print("Enter ID (1-5) >");
    		idstr = input.next();
    	}
    	int id = Integer.parseInt(idstr);
    	id = id-1;
    	return id;
    }//End Validate Method
    
    static int ugradeV;
    public static int ValidateGrade(String strugrade){
    	while(!strugrade.matches("\\d+")){
    			System.out.println("ERROR IN INPUT || NO VALID GRADDDDDDE");
    			System.out.print("Enter a grade to add >");
    			strugrade = input.next();
    	}//End While
    	ugradeV = Integer.parseInt(strugrade);
    	
    	if(ugradeV>100 || ugradeV<0){
    		strugrade = "NOT WITHIN BOUNDS";
    		ValidateGrade(strugrade);
    	}//End If
    	return ugradeV;
    }//End ValidateGrade Method
    
    public static void updategrade(int ugrade){
    	grades[ID] = ugrade;
    	System.out.println("The new grade of ID = "+(ID+1)+" is "+grades[ID]+".");
    }
    
}//End Class