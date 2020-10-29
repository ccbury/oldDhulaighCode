/**
 * @(#)RollDiceComputer.java
 *
 * @author 
 * @version 1.00 2016/11/18
 */


public class RollDiceComputer {

    public static void main (String args[]) {
    	int diceUser, diceComp;
    	diceUser = DiceRoll();
    	diceComp = DiceRoll();
    	
    	PrintResult(diceUser,diceComp);	
    }//End Main Method
    
    public static int DiceRoll(){
    	return (1+(int)(Math.random()*6));
    }//End DiceRoll Method
    
    public static void PrintResult(int Duser, int Dcomp){
    	if(Duser == Dcomp){
    		System.out.println("The user and computer drawed! Both got "+Duser);
    	}
    	else if(Duser>Dcomp){
    		System.out.println("The user got a higher score of "+Duser+". Computer scored "+Dcomp);
    	}
    	else{
    		System.out.println("The computer got a higher score of "+Dcomp+". User scored "+Duser);
    	}
    }//End PrintResult Method
    
    
}//End class