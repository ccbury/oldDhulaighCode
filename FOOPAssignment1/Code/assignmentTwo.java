/**
 * @(#)assignmentTwo.java
 * 
 * @authors Conor, Jack, Shay.
 * @version 1.00 2016/12/1
 */

//Import Scanner and Date utilities.
import java.util.Scanner;
import java.util.Date;
//Begin the class
public class assignmentTwo {
	
	//Declare static variables to be user in several methods. Scanner to take input from user. index stores the position of the users data across the strings.
	static Scanner input = new Scanner(System.in);
	static int index; 
	static boolean lodraw, PassChangeSure = false;
	//Declare the static arrays to store the user's data.
	static String name[]= {"Ciaran", "Conor", "Jack", "Shay", "Karl"};
	static int pin [] = {111, 222, 333, 444, 555};
	static int balance[]= {404, 0, 4250, -1000, 90};
	static boolean overdraft[] = {false, true, false, true, false};
	
	
	
	//The main method where the first method will be called.	
	public static void main (String args[]) {
		//Create the date variable and print the current date to the screen.
		Date d = new Date();
		System.out.println(d);
	
		//Call the Login() method.
		login();
	}//End main method
	
	
	//[Jack] Method to allow the user to log in to their account using their PIN.
    public static void login(){
    	//Declare variables to store the pin and a boolean flag.
		int pinUser;
    	String strpin;
    	boolean flag = false;
		
		//Prompt the user for the Pin and store as String
    	System.out.print("Enter your Pin: ");
    	strpin = input.next();
    	
   		//Send the Pin as a s=String to be validated. A pin int is returned.
    	pinUser = validatePin(strpin);
    	
		//Loop to check for the pin in the array.
    	for(int i = 0;i<pin.length;i++){
			if(pinUser==pin[i]){
    			index = i;
    			flag = true;
    			break;
    		}//end if
    	}//end for loop

    	//outputs if flag is true or false
    	if (flag == true){
    		//Print a message to welcome the user.
            System.out.print("\nWelcome " + name[index] + "\n\n");
            //Brint the use to the menu to select an option
            displayMenu();
    	}//end if
    	else{
    		System.out.println("PIN "+pinUser + " not found ");
    		System.out.println("Please try again...\n");
    		login();
    	}//end else	
	}//End login() Method
	

	//[Jack] Method to show the menu of available actions the user can call.
	public static void displayMenu(){
		//Declare variables for the "choice" and a String to validate it
    	String  strchoice;
		int choice;
		
		//Prompt the user
    	System.out.print("Choose an option :  \n1: Bank Statement\n2: Lodge Money\n3: Withdraw Money\n4: Change PIN\n5: LogOut\n6: Exit\n>");
    	strchoice = input.next();
    	
    	//Send the choice string to be validated. A choice int is returned
    	choice = validateMenu(strchoice);
    	
    	//If statements to preform selected options.
    	if(choice==1){ //Option gives the user a bank statement
    		userStatement();
    	}//end if
    	else if(choice==2){
    		lodge(); //Option allows the user to lodge money to their account
    	}//end if
    	else if(choice==3){
    		withdraw(); //Option allows the user to withdraw money from their account
    	}//end if
    	else if(choice==4){
    		changePassword(); //Option alllows the user to change their login PIN.
    	}//end if
    	else if(choice==5){
    		login(); //Option allows the user to login to a different user.
    	}
    	else if(choice==6){
    		exit(); //Option allows the user to exit from the ATM system.
    	}//end if
	}//End displayMenu() Method


	//[Shay] Method to show the user a personal statement for their account
    public static void userStatement(){
    	//Print all of the users information. As well as a message to show is overdrafting is available.
    	System.out.println("\nPIN: "+pin[index]+"\n"+"Name: "+name[index]+"\n"+"Balance: "+balance[index]);
    	if(overdraft[index]==true){
    		System.out.println("Overdraft facility available \n");
    	}//end if
    	else{
    		System.out.println("Overdraft facility not available \n");
    	}//end else
    	//Bring the user back to the menu to select another option
      	displayMenu();
    }//end userStatement() method

	//[Conor] Method to lodge money into the users account
	public static void lodge(){
		//Declare variables to store the lodgement value as well as a string to validate it.
		String lodgestr;
		int lodgeAmount;
		//lodraw is used in validateion to differentiate between lodge and withdraw. [true = lodge]
		lodraw = true;
		
		//Prompt the user for the amount to lodge. Store as string.
		System.out.print("\nEnter amount to lodge > ");
		lodgestr = input.next();
		
		//Send String to be validated. An int is returned.
		lodgeAmount = validatePosiDigits(lodgestr);
		//Lodgement is added to the balance.
		balance[index] += lodgeAmount;
		
		//Print the users new balance to show a change has been made.
		System.out.println("Your new balance is "+balance[index]+"\n");
		//Bring the user back to the menu to select another option
		displayMenu();
	}//End lodge() Method


	//[Conor] Method to withdraw money from the users account
	public static void withdraw(){
		//Declare variables to store the withdrawel value as well as a string to validate it.
		String withdrawstr;
		int withdrawAmount;
		//lodraw is used in validateion to differentiate between lodge and withdraw. [false = withdraw]
		lodraw = false;
		
		//Prompt the user for the amount to lodge. Store as string.
		System.out.print("\nEnter amount to withdraw > ");
		withdrawstr = input.next();
		
		//Send the withdrawel string to be validated. An int is returned.
		withdrawAmount = validatePosiDigits(withdrawstr);
		
		//If the account cannot be overdrafted and will go to a minus with the amount. The user will have to input again.
		if(overdraft[index]==false && withdrawAmount>balance[index]){
			System.out.println("Error. Overdraft not available.\nMaximum amount to withdraw is "+balance[index]);
			withdraw();
		}
		//Withdrawel is taken from the balance.
		balance[index] -= withdrawAmount;
		
		//Print the users new balance to show a change has been made.
		System.out.println("Your new balance is "+balance[index]+"\n");
		//Bring the user back to the menu to select another option
		displayMenu();
	}//End withdraw() Method


	//[Conor] Method to change the users password. (Password cannot be in use)
	public static void changePassword(){
		//Declare variables for Pin and Pin validation. userSure is used to insure the user intends to change PIN.
		String userSure="", newPinstr;
		int newPin;
		
		//PassChangeSure is a boolean flag used to skip initial verification in case of a password being discovered in use later in the method.
		//PassChangeSure begins false and so will ask for confirmation.
		//PassChangeSure is changed to true if a password is confirmed in use so that the user wont have to confirm again.
		if(PassChangeSure == false){
			System.out.print("\nAre you sure you want to change PIN? \n(y/n) > ");
			userSure = input.next();
		}
		else if(PassChangeSure == true){
			userSure = "y";
		}
		//Reset PassChangeSure so it can be used if method is selected again.
		PassChangeSure = false;
		
		//If the user confirms they wand to change the PIN by entering y or Y.
		if(userSure.matches("y")||userSure.matches("Y")){
			//Promt the user for the new PIN. Stored as a string.
			System.out.print("Enter New PIN: ");
			newPinstr = input.next();
			
			//The PIN is sent to be validated as a string. It is returned as an int.
			newPin = validatePin(newPinstr);
			
			//For loop to check id the PIN is in use.
			for(int i=0; i<pin.length; i++){
				//if to compair the two PIN values.
				if(newPin==pin[i]){
					//Error is displayed to the user.
					System.out.println("ERROR PIN is already in use!");
					//PassChangeSure is changed to true to remove confirmation at start of method.
					PassChangeSure =true;
					//The method is recalled to get a different PIN
					changePassword();
				}//End if
			}//End for loop
			//The new PIN replaces the one in the array.
			pin[index] = newPin;
			System.out.println("");
			//Bring the user back to the menu to select another option
			displayMenu(); 
		}//End if
		//Else if the user indicates n or N.
		else if(userSure.matches("n")||userSure.matches("N")){
			//Message indicating leaving the current method
			System.out.println("\nReturning to main menu...\n");
			//Bring the user back to the menu to select another option
			displayMenu();
		}//End else if
		//Otherwise or else there was an error in the input.
		else{
			//Display error message to the user
			System.out.println("Error please indicate answer using 'n' for 'No' or 'y' for 'Yes' only.");
			//Bring the user back to the menu to select another option
			changePassword();
		}//End else
	}//End chanwgePassword() Method



	//Shay Method to validate the password 	“\\d{3}”
	public static int validatePin(String strpinz){
		//While loop to check that pin is 3 digits only.
   		while(!strpinz.matches("\\d{3}")){
   			//Diplay an error to the user
    		System.out.println("Error, 3 digits only!");
    		//Prompt the user to re-enter their PIN
    		System.out.print("Please re-enter pin : ");
    		strpinz=input.next();
    	   }//end while
    	//Convert the checked PIN from a string type to an int and return it
    	return Integer.parseInt(strpinz);
    }//end pin method


	// Shay Method to validate lodgements and withdrawals 	“\\d+”
    public static int validatePosiDigits(String userInput){
    	//While loop to check that the input is a positive digit. Used for lodgements and withdrawels.
    	while(!userInput.matches("\\d+")){
    		//Print an error to the user
    		System.out.println("Error, positive digits only");
    		//if lodraw is true a lodgement message is printed
			if(lodraw == true){ //The user is prompted for input
    			System.out.print("Enter lodgement amount > ");
    			userInput=input.next();
    		}//End if
    		//if lodraw is false a withdrawel message is printed
			else if(lodraw == false){ //The user is prompted for input
				System.out.print("Enter withdrawel amount > ");
    			userInput=input.next();
			}//End else if
    	}//end while
    	//convert the userInput string to an int and return it.
    	return Integer.parseInt(userInput);
    }//end lodge validation method
    
	//Shay Method to validate MenuInput 	“[1-6]”
	public static int validateMenu(String menuz){
		//While loop to check that the user input for the mennu is within bounds
    	while(!menuz.matches("[1-6]")){
    		//Print an error to the user
    		System.out.println("\nError, 1-6 only!");
    		//Print the menu from which the input is being validated. Also prompt the user
    		System.out.print("Choose option :  \n1: Bank Statement\n2: Lodge Money\n3: Withdraw Money\n4: Change PIN\n5: LogOut\n6: Exit\n> ");
    		menuz=input.next();
           }//end while
        ////Convert the input string to an int and return it.
    	return Integer.parseInt(menuz);
    }//end menu validation method
	
	//Conor Method to exit from the system
	public static void exit(){
		//Print a goodbye message to the user.
		System.out.println("Goodbye "+name[index]+".");
		//Exit from the command line. all code is terminated
		System.exit(0);
	}//End exit() method

}//End class