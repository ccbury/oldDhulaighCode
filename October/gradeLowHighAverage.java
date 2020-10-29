/**
 * @(#)gradeLowHighAverage.java
 * Take 5 grades and print average and lowest and highest
 * @author Conor Bury
 * @version 1.00 2016/10/11
 */

//Import Scanner
import java.util.Scanner;
import java.util.Date;
public class gradeLowHighAverage {

    public static void main (String args[]) {
    	//Decalre variables
    	Date datee = new Date();
    	Scanner input = new Scanner(System.in);
    	int average, total=0, highest=0, lowest=100, grade, i, testnuml=0, testnumh=0;
    	System.out.println(datee);
    	//Begin for loop
   		for(i=1; i<=5; i++){
   			//Prompt the user
    		System.out.print("Enter grade "+i+": ");
    		grade = input.nextInt();
    		
    		//Begin if and else if to make sure input is between 0 and 100
    		if(grade>100){
    			System.out.println("Error. Test score must be between 0 and 100");
    			i--;
    		}
    		else if(grade<0){
    			System.out.println("Error. Test score must be between 0 and 100");
    			i--;
    		}
    		//Else continue and find if lowest or highest
    		else{
    		
    			if(grade>highest){
    				highest=grade;
    				testnumh=i;
    			}
    			if(grade<lowest){
    				lowest=grade;
    				testnuml=i;
    			}
    		}
    		//Add grade to total
    		total += grade;
    	}
    	//Find average from all added totals
    	average = total/5;
    	
    	//Print results
    	System.out.println("\nThe average was "+average+".");
    	System.out.println("The lowest was "+lowest+". It was grade number "+testnuml+" on the list.");
    	System.out.println("The highest was "+highest+". It was grade number "+testnumh+" on the list.");
    
    }//End main method
    
    
}//End class