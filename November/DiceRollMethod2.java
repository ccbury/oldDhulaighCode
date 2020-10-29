/**
 * @(#)DiceRollMethod2.java
 * Roll a dice wusing a method. 
 * When a 6 is rolled tell the user how many rolls it took.
 * @author Conor Bury
 * @version 1.00 2016/11/15
 */
import java.util.Date;
public class DiceRollMethod2 {

    public static void main (String args[]) {
    	Date d = new Date();
    	int result=0;
    	System.out.println(d);
    	
    	result = DiceRoll();
    	
    	System.out.println("It took "+result+" rolls to get the sixth face.\n");
    }//End Main
    
    public static int DiceRoll(){
    	int roll = 0, counter = 0;
    	while(roll!=6){
    		roll = 1+(int)(Math.random()*6);;
    		counter ++;
    	}//End While Loop
    	return counter;
    }//End DiceRoll
    
}//End class