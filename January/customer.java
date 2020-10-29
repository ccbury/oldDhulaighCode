/**
 * @(#)customer.java
 * Create a customer object with instance variables name, address and balance
 * Have set and get methods for all instance variables
 * Create a customerTest class and create a cutomer object
 * Take the input from the user
 * Print all details of the customer then ask the user to enter a new balance
 * Print the new balance for the user
 * @author 
 * @version 1.00 2017/1/19
 */


public class customer {

	private String name, address;
	private double balance;
	
    public customer(String name, String address, double balance) {
    	this.name = name;
    	this.address = address;
    	this.balance = balance;
    }//End constructor
    
    public void setName(String name){
    	this.name = name;
    }
    public String getName(){
    	return name;
    }
    
    public void setAddress(String address){
    	this.address = address;
    }
    public String getAddress(){
    	return address;
    }
    
    public void setBalance(double balance){
    	this.balance = balance;
    }
    public double getBalance(){
    	return balance;
    }
    public String toString(){
    	return "Name: "+name+"\nAddress"+address+"\nBalance: "+balance;
    }
    
}//End main