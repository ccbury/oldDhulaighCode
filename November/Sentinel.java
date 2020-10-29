/**
 * @(#)Sentinel.java
 * Write a program to take grades until the user enters -1
 * Get the average grade
 * @author 
 * @version 1.00 2016/12/9
 */

import java.util.Scanner;
public class Sentinel {

    public static void main(String args[]) {
    	int counter=0, grade, average, total=0;
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter grade "+(counter+1)+": ");
    	grade = input.nextInt();
    	
    	while(grade != -1){
    		total += grade;
    		counter++;
    		System.out.print("Enter grade "+(counter+1)+": ");
    		grade = input.nextInt();
    	}//End while
    	
    	if(counter==0){
    		System.out.println("No grades entered");
    	}//End if
    	else{
    		average = total/counter;
    		System.out.println("Average grade was "+average);
    	}//End else
    	
    }//End main
    
    
}//End class