/**
 * @(#)Assignment1.java
 *
 *
 * @author 
 * @version 1.00 2017/1/24
 */

import java.util.Scanner;
public class Assignment1 {
	static Scanner input = new Scanner(System.in);
		
    public static void main (String args[]) {
    	//Declare Required variables
    	String username, location, email;
    	int pin;
    	
    	System.out.println("-------------Beginning Registration-------------");
    	//Prompt the user for all variables to be used in object R1
    	System.out.print("Enter Username: ");
    	username = input.nextLine();
    	System.out.print("Enter 3 digit PIN: ");
    	pin = pinValidate(input.nextLine());
    	System.out.print("Enter Location: ");
    	location = input.nextLine();
    	System.out.print("Enter Email: ");
    	email = emailValidate(input.nextLine());
    	
    	//Declare the object, giving the users input
    	Register R1 = new Register(username, pin, location, email);
    	
    	//Print the users details.
    	System.out.println("\n--------- New Registration Information ---------\n"+ R1 +"\n------------------------------------------------");
    	
    	//Change the username of the user to all uppercase characters 
    	R1.setUsername(R1.getUsername().toUpperCase());
    	
    	System.out.println("\nUsername has been changed to > "+R1.getUsername()+"\n");
    	
    }//End main
    
    //Method to validate an appropriate Email was entered
    public static String emailValidate(String email){
    	int isAt, isDot;
    	isAt = email.indexOf("@");
    	isDot = email.indexOf(".");
    	while(isAt == -1 || isDot == -1 || isAt>isDot){
    		System.out.println("ERROR, Emails must contain an '@' followed by a '.'");
    		System.out.print("Please enter an email: ");
    		email = input.next();
    		isAt = email.indexOf("@");
    		isDot = email.indexOf(".");
    	}
    	return email;
    }//End emailValidate method
    
    //Method to validate an appropriate PIN was entered
    public static int pinValidate(String pinstr){
    	while(!pinstr.matches("\\d{3}")){
   			System.out.println("ERROR. PIN can only be 3 digits");
  			System.out.print("Enter 3 digit PIN: ");
  			pinstr = input.nextLine();
    	}
    	return Integer.parseInt(pinstr);
    }//End pinValidate method
    		
    //Start Innner Class
    public static class Register {
    		//Declare static variables for use in the object.
    		private String username, location, email;
    		private int pin;
    		
    		//Start constructor to build objects in a consistant state.
    		public Register(String username, int pin, String location, String email){
    			this.username = username;
				this.pin = ((pin>0)? pin : 111);
				this.location = location;
				this.email = email;
    		}//End constructor
    		
    		public void setUsername(String username){
    			this.username = username;
    		}//End setUsername
    		public String getUsername(){
    			return username;
    		}//End getUsername
    		
    		public void setPin(int pin){
    			this.pin = ((pin>0)? pin : 111);
    		}//End setPin
    		public int getPin(){
    			return pin;
    		}//End getPin
    		
    		public void setLocation(String location){
    			this.location = location;
    		}//End setLocation
    		public String getLocation(){
    			return location;
    		}//End getLocation
    		
    		public void setEmail(String email){
    			this.email = email;
    		}//End setEmail
    		public String getEmail(){
    			return email;
    		}//End getEmail
    		
    		//Start toString to return of the objects information
    		public String toString(){
    			return "Username: "+username+"\nPIN: "+pin+"\nLocation: "+location+"\nEmail: "+email;
    		}//End toString
    		
    				
    }//End Class Inner 
    
    
}//End Class Outer