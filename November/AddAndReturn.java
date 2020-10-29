/**
 * @(#)AddAndReturn.java
 *
 *
 * @author 
 * @version 1.00 2016/11/15
 */


public class AddAndReturn {

    public static void main (String args[]) {
    	int result;
    	
    	result = addNumbers(12, 5);
    	
    	System.out.println("The numbers added equal to "+ result);
    }//End Main
    
    public static int addNumbers(int x, int y){
    	int sum = x + y;
    	return sum;
    }// End addNumbers
    
}//End class