/**
 * @(#)WhatsTheName.java
 *
 *
 * @author 
 * @version 1.00 2016/11/22
 */

import java.util.Scanner;
public class GuessNumber {

	static Scanner input = new Scanner(System.in);
    public static void main (String main[]) {
    	int numbers[] = {1, 7, 3, 9, 15, 17};
    	boolean val = false;
    	int noofguess = 0;
    	String guessstr = "";
    	int guess =0;
    	
    	while(val == false){
    		System.out.print("Enter your guess (1-20): ");
    		guessstr = input.next();
    		
    		guess = Validate(guessstr);
    		
    		for(int i=0; i<numbers.length; i++){
    			if(numbers[i] == guess){
    				val = true;
    				break;
    			}//End if
    			
    		}//End for
    		if(val == false){
    			System.out.println("\tINCORRECT");
    		}
    		noofguess++;
    		if(noofguess==5){
    			System.out.println("Im sorry. You guessed too many times :(");
    			System.exit(0);    		}
    	}//End while
    	System.out.println(guess+" was a correct answer! It took "+noofguess+" guess(es) to get it right!");
    	
    }//End Main
    public static int Validate(String guessstr){
    	int guess;
    	while(!guessstr.matches("\\d+")){
    			System.out.println("ERROR IN INPUT || NOT A VALID GUESS");
    		
    			System.out.print("Enter your guess (1-20): ");
    			guessstr = input.next();
    	}
    	guess = Integer.parseInt(guessstr);
    	return guess;
    }//End Validate Method
    
}//End class