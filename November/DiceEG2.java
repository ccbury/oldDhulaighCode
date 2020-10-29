/**
 * @(#)DiceEG2.java
 * Take a number from the user.
 * Call a method that will generate a number from 1-6 and return the number
 * Check if the user guessed  the number correctly.
 * @author Conor Bury
 * @version 1.00 2016/11/18
 */

import java.util.Scanner;
public class DiceEG2 {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter your guess (1-6): ");
    	int guess = input.nextInt();
    	int roll = Dice();
    	System.out.println();
    	
    	//Compair results
    	if(guess==roll){
    		System.out.println("YOU GUESSED CORRECTLY!");
    	}
    	else if(guess>roll){
    		System.out.println("inconrrect. You guessed too high.");
    	}
    	else{
    		System.out.println("inconrrect. You guessed too low.");
    	}
    	System.out.println("\nYou guessed "+guess+".\t The die rolled "+roll+"\n");
    }//End main
    
    public static int Dice(){
    	return (1+(int)(Math.random()*6));
    }//End Dice Method
    
}//End Class