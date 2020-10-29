/** 3
 * @(#)WhileAges.java
 * Take in 5 ages and get the average wsing a while loop.
 * @author Conor Bury
 * @version 1.00 2016/10/6
 */

import java.util.Scanner;
public class WhileAges {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int age, average, total=0, i=1;
    	
    	while(i<=5){
    		System.out.print("Enter age "+i+": ");
    		age = input.nextInt();
    		
    		total+= age;
    		i++;
    	}
    	average=total/5;
    	System.out.println(average+" was the average age.");
    		
    }
    
    
}