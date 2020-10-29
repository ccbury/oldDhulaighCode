/** HomeWork 1
 * @(#)NameAgeLowHigh.java
 * Take 5 names and ages and print the lowest and highest name.
 * @author Conor Buiry
 * @version 1.00 2016/10/4
 */

import java.util.Scanner;
public class NameAgeLowHigh {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	
    	String name, LowName="", HighName="";
    	int age, total=0, average, lowest=100, highest=0;
    	
    	for(int i=1; i<=5; i++){
    		System.out.print("Enter name "+i+": ");
    		name = input.next();
    		
    		System.out.print("Enter age "+i+": ");
    		age = input.nextInt();
    		
    		if(age>highest){
    			highest=age;
    			HighName=name;
    		}
    		if(age<lowest){
    			lowest=age;
    			LowName=name;
    		}
    		
    	}
    	System.out.println("\n"+LowName +" had the lowest age at "+lowest+" years old");
    	System.out.println(HighName +" had the highest age at "+highest+" years old");
    	
    }//End method
    
    
}//End class