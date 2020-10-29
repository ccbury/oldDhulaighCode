/** 17
 * @(#)SquaredNumbers.java
 * Print the square of the numbers 1 to 10
 * @author Conor Bury
 * @version 1.00 2016/9/23
 */


public class SquaredNumbers {

    public static void main (String args[]) {
    	
    	int i;
    	
    	
    	for(i=1; i<=10; i++){
    		System.out.println(i*i);
    	}
    	System.out.println("The value of i after the loop is " + i);
    	
    	
    	System.out.println("20-30");
    	// print numbers from 20-30
    	for(i=20; i<=30;i++){
    		System.out.println(i);
    	}
    	
    	
    	System.out.println("EVEN");
    	// print even numbers from from 1 to 20
    	for(i=2; i<=20; i+=2){
    		System.out.println(i);
    	}
    	
    	System.out.println("ODD");
    	// print odd numbers from 1 to 20
    	for(i=1; i<=19; i+=2){
    		System.out.println(i);
    	}
    	
    	System.out.println("BACK");
     	// Print numbers from 20 to 1
     	for(i=20; i>=1; i--){
     		System.out.println(i);
     	}
     	
    	
    }//end main method
    
    
}//end class