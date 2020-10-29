/**
 * @(#)FiveNamesAges.java
 *
 *
 * @author 
 * @version 1.00 2016/10/28
 */

import java.util.Scanner;
public class FiveNamesAges {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int NoOfPeeps=0, lowest=1000, lownum=0, lowgrade=100, lownumg=0, highest=0, highnum=0, highgrade=0, highnumg=0;
    	
    	System.out.print("Enter the number of people: ");
    	NoOfPeeps = input.nextInt();
    	System.out.println();
    	
    	int ages[] = new int[NoOfPeeps];
    	int grades[] = new int[NoOfPeeps];
    	String names[] = new String[NoOfPeeps];
    	
    	for(int i=0; i<NoOfPeeps; i++){
    		System.out.print("Enter name "+(i+1)+": ");
    		names[i] = input.nextLine();
    		names[i] = input.nextLine();
    		System.out.print("Enter age "+(i+1)+": ");
    		ages[i] = input.nextInt();
    		System.out.print("Enter gradde "+(i+1)+": ");
    		grades[i] = input.nextInt();
    		System.out.println();
    		
    		if(ages[i]>highest){
    			highest=ages[i];
    			highnum=i;
    		}
    		if(ages[i]<lowest){
    			lowest=ages[i];
    			lownum=i;
    		}
    		if(grades[i]<lowgrade){
    			lowgrade=grades[i];
    			lownumg=i;
    		}
    		if(grades[i]>highgrade){
    			highgrade=grades[i];
    			highnumg=i;
    		}
    		
    		
    	}
    	System.out.println(names[highnum]+" is oldest at age "+highest);
    	System.out.println(names[lownum]+" is youngest at age "+lowest);
    	
    	System.out.println();
    	
    	System.out.println(names[highnumg]+" had a high grade of "+highgrade);
    	System.out.println(names[lownumg]+" had a low grade of "+lowgrade);
    	
    	System.out.println("First grade was "+grades[0]);
    	System.out.println("Second grade was "+grades[1]);
    	System.out.println("Last grade was "+grades[grades.length-1]);
    }//End method
    
    
}//End class