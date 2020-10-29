/**
 * @(#)AgesArray.java
 *
 *
 * @author 
 * @version 1.00 2016/10/27
 */

import java.util.Scanner;
public class AgesArray {

    public static void main (String args[]) {
    	int[] grades = new int[5];
    	int passes =0, fails=0;
    	Scanner input = new Scanner(System.in);
    	
    	for(int i=0; i<grades.length; i++){
    		System.out.print("Enter grade "+(i+1)+":");
    		grades[i]=input.nextInt();
    		if(grades[i]>50){
    			passes ++;
    		}
    		else{
    			fails++;
    		}
    	}
    	
    	System.out.println();
    	
    	for(int i=0; i<5; i++){
    		System.out.println("Grade "+(i+1)+" was "+grades[i]);
    		System.out.println("passes "+passes);
    		System.out.println("fails "+fails);
    	}
    }
    
    
}