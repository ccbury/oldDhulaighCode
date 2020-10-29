/**
 * @(#)characterTest.java
 * @author 
 * @version 1.00 2017/1/20
 */

import java.util.Scanner;
public class characterTest {
	static Scanner input = new Scanner(System.in);

	public static void main(String args[]){
		character C1
	}//End main
	
	//Start class inner
	public static class character {
		private String type;
		private int num_lifes, power;

	    public character(String type, int num_lifes, int power) {
	    	this.type = type;
	    	this.num_lifes = ((num_lifes<6)&&(num_lifes>-1)? num_lifes :0);
	    	this.power = ((power>0)&&(power<=100)? power :1);
	    }
	    public void setType(String type){
	    	this.type = type;
	    }
	    public String getType(){
	    	return type;
	    }
	    public void setNum_lifes(int num_lifes){
	    	this.num_lifes = ((num_lifes<6)&&(num_lifes>-1)? num_lifes :0);
	    }
	    public int getNum_lifes(){
	    	return num_lifes;
	    }
	    public void setPower(int power){
	    	this.power = ((power>0)&&(power<=100)? power :1);
	    }
	    public int getPower(){
	    	return power;
	    }
	    public String toString(){
	    	return "Type: "+type+"\nNumber of lives: "+num_lifes+"\nPower: "+power;
	    }
	    public int powerValidate(String strpower){
	    	while(!strpower.matches("\\d+")){
	    		System.out.print("Error not a valid power level");
	    		strpower = input.next();
	    	}
	    	return Integer.parseInt(strpower);
	    }
	    public int lifesValidate(String strlifes){
	    	while(!strlifes.matches("[1-5]")){
	    		System.out.println("Error 1-5 only");
	    		System.out.print("Enter number of lifes: ");
	    		strlifes = input.next();
	    	}
	    	return Integer.parseInt(strlifes);
	    }
	    
	}//End class inner
    
    
}//End class outer