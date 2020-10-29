/**
 * @(#)PrintingArrays.java
 * Print the details of the arrays below in a grid format for the user
 * eg
 * ID Name Address balance
 * 1  Fred Dublin  100
 * @author 
 * @version 1.00 2016/11/8
 */


public class PrintingArrays {

    public static void main(String args[]) {
    	int id[] = {1, 2, 3, 4, 5};
    	String name[] = {"Fred", "Ted", "Jed", "Ned", "Brennan"};
    	String address[] = {"Meath", "Kerry", "Space", "Texas", "Cork"};
    	int balance[] = {110, 2345, 2000, 7890, 3000};
    	
    	System.out.println("ID\tName\t\tAddress\t\tBalance\t");
    	System.out.println("___________________________________________________\n");
    	
    	for(int i=0; i<id.length; i++){
    	
    		System.out.println(id[i] +"\t" + name[i] +"\t\t" + address[i] +"\t\t" + balance[i] +"\t");
    	}
    
    }
    
    
}