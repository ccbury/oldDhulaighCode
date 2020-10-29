/**
 * @(#)ArrayHighLow.java
 * Go through the array and get the highest. lowest and average grade.
 * Tell the user at the end if there is a distinction grade (Boolean)
 * @author Conor Bury
 * @version 1.00 2016/11/10
 */

public class ArrayHighLow {

    public static void main (String args[]) {
    	int grades[] = {26,67,54,34,66,46,77};
    	boolean distinction = false;
    	int lowest=100, lowestArray=0, highest=0, highestArray=0, average, total=0;
    	
    	for(int i=0; i<grades.length; i++){
    		if(grades[i]>highest){
    			highestArray = i;
    		}
    		if(grades[i]<lowest){
    			lowestArray = i;
    		}
    		if(grades[i]>79){
    			distinction = true;
    		}
    		total += grades[i];
    	}
    	
    	average = total/grades.length;
    	
    	System.out.println("Lowest grade was "+grades[lowestArray]+". It was number "+(lowestArray+1)+" on the list.");
    	System.out.println("Highest grade was "+grades[highestArray]+". It was number "+(highestArray+1)+" on the list.");
    	System.out.println("The average of the grades was "+average+".");
    	
    	if(distinction == true){
    		System.out.println("There was a distinction grade!");
    	}
    	else{
    		System.out.println("No grades were distinctions...");
    	}
    	
    	
    }//End main
    
    
}//End class