/**
 * @(#)HWTuesday22nd.java
 * Take in a grade from the user from 1-10
 * If the grade is 1-3 print "You rate the canteen poorly"
 * If the grade is 4-7 print "You rate the canteen as average"
 * If the grade is 8-10 print "You rate the canteen as excellent"
 * 
 * Check that the input is only digits. Use a method.
 * (The method will return the int to the main)
 *
 * @author Conor Bury
 * @version 1.00 2016/11/22
 */
import java.util.Scanner;

public class HWTuesday22nd {
	//Import scanner for all Methods
	static Scanner input = new Scanner(System.in);
	
    public static void main (String args[]) {
    	int Rating;
    	String RateStr;
    	
    	System.out.print("Enter your rating for the canteen (1-10): ");
    	RateStr = input.next();
    	
    	Rating = ErrorCheck(RateStr);
    	RatingCategory(Rating);
    }//End Main Method
    
    public static int ErrorCheck(String RateStr){
    	int Rating;
    	while(!RateStr.matches("\\d+")){
    			System.out.println("\nERROR IN INPUT || NO VALID RATING\n");
    			System.out.print("Enter your rating for the canteen (1-10): ");
    			RateStr = input.next();
    	}//End While
    	Rating = Integer.parseInt(RateStr);
    	
    	if(Rating>10 || Rating<1){
    		RateStr = "NOT WITHIN BOUNDS";
    		ErrorCheck(RateStr);
    	}//End If
    	return Rating;
    }//End NoDigits Method
    
    public static void RatingCategory(int Rating){
    	if(Rating>7){
    		System.out.println("\nYou rate the canteen as excellent!\n");
    	}//EndIf
    	else if(Rating>3){
    		System.out.println("\nYou rate the canteen as average.\n");
    	}//End ElseIf
    	else{
    		System.out.println("\nYou rate the canteen as poor.\n");
    	}//End Else
    }//End RatingCategory Method
    
}//End class