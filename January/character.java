/**
 * @(#)character.java
 * Create a character object that will have a type, num_lifes and power
 * Have set and get methods
 * In the same file have a test class and create a character
 * Print the characters details and then change some details with set methods and
 * display the new details with get details.
 * @author Conor Bury
 * @version 1.00 2017/1/20
 */

import java.util.Scanner;
public class character {
	
	
    public character(String type, int num_lifes, int power) {
    	this.type = type;
    	this.num_lifes = ((num_lifes>=0)? num_lifes :0);
    	this.power = ((power>0)? power :1);
    }
    public void setType(String type){
    	this.type = type;
    }
    public String getType(){
    	return type;
    }
    public void setNum_lifes(int num_lifes){
    	this.num_lifes = ((num_lifes>=0)? num_lifes :0);
    }
    public int getNum_lifes(){
    	return num_lifes;
    }
    public void setPower(int power){
    	this.power = ((power>0)? power :1);
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
    //public int lifesValidate(String strlifes){
    	
    //}
    
    
}//End cllass