;/**
 * @(#)bankAccount.java
 *
 *
 * @author 
 * @version 1.00 2017/3/21
 */
//Add bankAccount to package
//package Assignment;
//Begin new class
import java.util.Scanner;
public class bankAccount {
	
	//Declare variables for storing user information
	private String name;
	private int balance, pin;
	static Scanner input = new Scanner(System.in);
	//Begin empty constructor
    public bankAccount() {
    }//End empty constructor
    
    //Begin constructor
    public bankAccount(String name, int balance, int pin){
    	this.name = name;
    	this.balance = ((balance>0)&&(balance<250000000)? balance : 0);
    	this.pin = pin;
    }//End constructor
    
    //Begin set and get methods for Name
    public void setName(String name){
    	this.name = name;
    }
    public String getName(){
    	return name;
    }
    //End set and get methods for Name
    
    //Begin set and get methods for PIN
    public void setPin(int Pin){
    	this.pin = pin;
    }
    public int getPin(){
    	return pin;
    }
    //End set and get methods for PIN
    
    //Begin set and get methods for balance
    public void setBalance(int balance){
    	this.balance = ((balance>-100)&&(balance<250000)? balance : 0);
    }
    public int getBalance(){
    	return balance;
    }
    //End set and get methods for balance
    
    //Begin new method to display the users information
    public String details(){
    	return "Name: "+name+"\nBalance: "+balance;
    }
    public int showMenu(){
    	System.out.println("\n\n-Menu-\n1. Statement\n2. deposit\n3. Withdraw\n4. Exit");
 		System.out.print("Menu input: ");
 		return menuValidate(input.next());
 		
    }
    public void deposit(){
    	int dep;
    	System.out.print("\nEnter Amount: ");
    	dep = validateNumber(input.next());
    	balance += dep;
    	System.out.println("New balance = "+balance);
    }
    public void Withdraw(){
    	int with;
    	System.out.print("\nEnter Amount: ");
    	with = validateNumber(input.next());
    	if(with<=balance){
    		balance = balance - with;
    		System.out.println("New balance = "+balance);
    	}
    	else{
    		System.out.println("Error.. Balance too low for withdrawl");
    	}
    }
    public int menuValidate(String strMenu){
    	while(!strMenu.matches("[1-4]")){
    		System.out.println("Error. Please select digit from 1 to 4");
    		System.out.print("Menu input: ");
    		strMenu = input.next();
    	}
    	return Integer.parseInt(strMenu);
    }
    public int validateNumber(String numstr){
    	while (!numstr.matches("\\d+")){
    		System.out.println("Error. Please enter digits only...");
    		System.out.print("Enter Amount: ");
    		numstr = input.next();
    	}
    	return Integer.parseInt(numstr);
    }
    //end display method
}//End class