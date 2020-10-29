/**
 * @(#)RollDiceMethod.java
 * @author Conor Bury 
 * @version 1.00 2016/11/10
 */

import java.util.*;
public class RollDiceMethod {
	 
    public static void main (String args[]){
    	Scanner input = new Scanner(System.in);
    	String answer;
    	
    	//Call method
    	roll_dice();
    	
		System.out.print("Do you want to roll again(y/n): ");
		answer = input.next();
		
		if(answer.matches("y")){
			roll_dice();
		}
		
    }//End Main
    
    public static void roll_dice(){
    	int dice;
    	dice = 1+(int)(Math.random()*6);
    	System.out.println(dice);
    }//End roll_dice
    
}//End class