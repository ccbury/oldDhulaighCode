/** 20
 * @(#)TwoDiceRoll.java
 * Roll 2 dice and tell the user who won. Player1(dice1) or Player2(dice2)
 * @author Conor Bury
 * @version 1.00 2016/9/27
 */


public class TwoDiceRoll {

    public static void main(String args[]) {
    	
    	int dice1, dice2;
    	
    	dice1 =1+(int)(Math.random()*6);
    	dice2 =1+(int)(Math.random()*6);
    	
    	// Show the results
    	System.out.println("Player1 = " +dice1+ "\nPlayer2 = " +dice2);
    	
    	if(dice1 > dice2){
    		System.out.println("Player1 wins by scoring "+dice1+" versuses Player2's "+dice2);
    	}
    	else if(dice1 == dice2){
    		System.out.println("Player1 and Player2 have drawn");
    	}
    	else{
    		System.out.println("Player2 wins by scoring "+dice2+" versuses Player1's "+dice1);
    	}
    	
    	
    }//End of method
    
    
}//End of class