/** 1
 * @(#)Counter.java
 * Take in 5 grades and tell the user how many poeple passed or failed
 * @author Conor Bury
 * @version 1.00 2016/10/6
 */

import java.util.Scanner;
public class Counter {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int grade, passes=0, fails=0;
    	
    	for(int i=1; i<=5; i++){
    		System.out.print("Enter grade "+i+": ");
    		grade = input.nextInt();
    		
    		if(grade>=50){
    			passes++;
    		}
    		else{
    			fails++;
    		}
    		
    	}
    	
    	System.out.println(passes+" of the tests passed. "+fails+" of the tests failed.");
    	if(passes<fails){
    		int x= fails-passes;
    		System.out.println("There were "+ x +" more fails then passes..");
    	}
    	else{
    		int x= passes-fails;
    		System.out.println("There were "+ x +" more passes then fails..");
    	}
    	
    }//End method
    
    
}//End class