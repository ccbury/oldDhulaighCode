/** 10
 * @(#)Numbers.java
 * Add, subtract, multiply and divide + modulus
 * @author Conor Bury
 * @version 1.00 2016/9/20
 */


public class Numbers {

    public static void main (String args[]) {
    	

    	// declare numbers
		int num1 = 6;
    	int num2 = 3;
    	int result = 0;
    	
    	//add numbers
    	result = num1 + num2;
    	System.out.println(num1 + "+" + num2 + "=" + result);
    	
    	//subtract numbers
    	result = num1 - num2;
    	System.out.println(num1 + "-" + num2 + "=" + result);
    	
    	// Multiply numbers
    	result = num1 * num2;
    	System.out.println(num1 + "X" + num2 + "=" + result);
    	
    	// Divide numbers
    	result = num1 / num2;
    	System.out.println(num1 + "/" + num2 + "=" + result);
    	
    	//modulus numbers
    	result = num1 % num2;
    	System.out.println(num1 + "%" + num2 + "=" + result);
    	
    }// End of main method
    
    
}// End of class