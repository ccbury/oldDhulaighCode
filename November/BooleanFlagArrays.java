/** 3
 * @(#)BooleanFlagArrays.java
 * @author Conor Bury
 * @version 1.00 2016/11/8
 */

import java.util.*;
public class BooleanFlagArrays {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int numbers[] = {2, 4, 6 , 8, 10};
    	int Num;
    	boolean flag = false;
    	
    	System.out.print("Enter a number from 1 - 10: ");
    	Num = input.nextInt();
    	
    	for(int i=0; i<numbers.length; i++){
    		if(Num == numbers[i]){
    			System.out.println("Found");
    			flag = true;
    			break;
    		}
    	}
    	
    	if(flag == false){
    		System.out.println("Not Found");
    	}
    	
    	
    }//End main
    
    
}//End class