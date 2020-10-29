/** 19
 * @(#)DiceRoll.java
 * Roll a dice and tell the user what value they got using if statements
 * @author Conor Bury
 * @version 1.00 2016/9/27
 */


public class DiceRoll {

    public static void main(String args[]) {
    	
    	int dice;
    	
    	dice =1+(int)(Math.random()*6);
    	
    	System.out.println(dice);
    	
    	if(dice==6){
    		System.out.println("You got a 6! WINNER!");
    	}
    	else if(dice==1){
    		System.out.println("You lost bad... real bad");
    	}
    	else if(dice==2){
    		System.out.println("You lost.. least its not 1");
    	}
    	else if(dice==3){
    		System.out.println("You lost. half way tho");
    	}
    	else if(dice==4){
    		System.out.println("You lost. just 2 away....");
    	}
    	else{
    		System.out.println("You lost.. but SO CLOSE");
    	}
    	
    	
    }//End of main method
    
    
}//End of class