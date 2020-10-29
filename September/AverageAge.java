/** 28
 * @(#)AverageAge.java
 * Take in ages from user and give average
 * @author 
 * @version 1.00 2016/9/30
 */

import java.util.Scanner;
public class AverageAge {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	
    	double noages, age, average, total=0;
    	
    	System.out.print("How many ages are there? ");
    	noages = input.nextInt();
    	
    	for(int i=1; i<=noages; i++){
    		System.out.print("Give age "+i+":");
    		age = input.nextInt();
    		total = total+age;
    	}
    	System.out.println();
    	average = total/noages;
    	
    	System.out.println("The average was "+average);
    	System.out.println("");
    	
    }//End method
    
    
}//End class