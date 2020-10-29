/** 18
 * @(#)DiceRollLoop.java
 * Roll a dice. rell user how many rolls it took to get 6.
 * @author Conor Bury
 * @version 1.00 2016/9/23
 */


public class DiceRollLoop {

    public static void main(String args[]) {
    	
    	int dice;
    	
    	for(int i=1; i<=1000; i++){
    		dice =1+(int)(Math.random()*6);
    		System.out.println(dice);
    		
    		if(dice==6){
    			System.out.println("6 rolled in " + i +" goes");
    			break;
    		}
    	}
    	
    	
    }//End main method
    
    
}//End class