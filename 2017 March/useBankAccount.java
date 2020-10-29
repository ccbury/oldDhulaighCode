/**
 * @(#)useBankAccount.java
 * @author 
 * @version 1.00 2017/3/21
 */
 
//Add the useBankAccount file to a package
//package Assignment;
//Import Scanner for taking user input
import java.util.Scanner;
//Begin the useBankAccount class
public class useBankAccount {
	//Declare the input variable as a new scanner to take user input
	static Scanner input = new Scanner(System.in);
	static int tries=0;
	//Begin main method
    public static void main (String args[]) {
    	String namesearch;
    	int position=0, pin=0, menuNum=0;
    	
    	bankAccount users[] = new bankAccount[5];
    	
    	users[0] = new bankAccount("Conor",190,404);
    	users[1] = new bankAccount("Jack",0,101);
    	users[2] = new bankAccount("Shay",400,555);
    	users[3] = new bankAccount("Karl",25000,123);
    	users[4] = new bankAccount("Ciaran",4000,911);
    	
    	System.out.print("Please enter the name of your account: ");
    	namesearch =input.nextLine();
    	
 		for(int i=0; i<=4; i++){
 			if(namesearch.matches(users[i].getName())){
 				position = i;
 				System.out.println("Welcome "+users[position].getName());
 				break;
 			}
 			if(i==4){
 				System.out.println("No such name found. Please try again...");
 				System.out.print("Please enter the name of your account: ");
    			namesearch =input.nextLine();
 				i=-1;
 			}
 		}//End for loop
 		while(users[position].getPin() != pin){
 			tries++;
 			if(tries == 4){
   				System.out.println("You have exceeded the tries limit...\nSystem exiting...\n");
   				System.exit(0);
   			}
   			if(tries>1){
   				System.out.println("That pin does not match the record for "+users[position].getName());
   			}
 			System.out.print("Enter your Pin: ");
 			pin = PinValidate(input.nextLine());	
 		}
 		System.out.println("\nWelcome "+users[position].getName());
 		menuNum = users[position].showMenu();
 		
 		while(menuNum != 4){
 			if(menuNum == 1){
 				System.out.println("\n" +users[position].details());
 				menuNum = users[position].showMenu();
 			}
 			else if(menuNum == 2){
 				users[position].deposit();
 				menuNum = users[position].showMenu();
 			}
 			else if(menuNum == 3){
 				users[position].Withdraw();
 				menuNum = users[position].showMenu();
 			}
 		}
 		
 		System.out.println("\nThank you for using the Banks services\n");
 		
	}//End main method
	
    public static int PinValidate(String strpin){
    	while(!strpin.matches("\\d+")){
    		System.out.println("Error: \nPins must contain numbers only\n");
    		tries ++;
    		if(tries == 4){
    			System.out.println("You have exceeded the tries limit...\nSystem exiting...\n");
    			System.exit(0);
    		}
    		System.out.print("Enter your PIN: ");
    		strpin = input.nextLine();
    	}
    	return Integer.parseInt(strpin);
    }
    
}//End class