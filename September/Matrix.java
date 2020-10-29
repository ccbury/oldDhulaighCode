/** 14
 * @(#)Matrix.java
 * Create a matrix like output
 * @author Conor Bury 
 * @version 1.00 2016/9/22
 */


public class Matrix {

    public static void main(String args[]) {
    	// Declare variables
    	int i = 1;
    
    	// used to hold the random number
    	int num;
     
    	// Start for loop
    	for (i=1;1<=1000000;i++){
    	
    		//System.out.print(i);
    	
    		if(i>1000){
    			//use a thread to slow output down(Do not need to know)
    			try{
    			Thread.currentThread().sleep(1);
    			}
    			catch (Exception e){
    			System.out.print("thread did not work");
    			}
    	}
    		
    		// Generate random number
    		num = 1+(int)(Math.random()*10);
    		System.out.print(num);
    	
    		// Create a character
    		if (num == 1){
    			System.out.print("X ");
    		}
    		else if (num == 7){
    			System.out.print("Z ");
    		}
    		else if (num == 4){
    			System.out.print("			");
    		}
    		else if (num == 9){
    			System.out.print("HARAMBE ");
    		}
    		else if (num == 2){
    			System.out.print("V ");
    		}
    	
    	}// End for
    
    }// End main method
    
    
}// End of class