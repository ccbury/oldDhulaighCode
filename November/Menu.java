/**
 * @(#)Menu.java
 * a menu for the user.
 * @author 
 * @version 1.00 2016/11/11
 */

import java.util.Scanner;
public class Menu {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	int option = 0, UserNum, num=0;
    	System.out.println("-----  1.Add -- 2.Sutract --  3.Print -- 4.Exit  -----");
    	System.out.print("Input the initial number: ");
    	num = input.nextInt();
    	
    	while(option !=4){
    		System.out.print("Input a number from the menu: ");
    		option = input.nextInt();
    		
    		if(option == 1){
    			System.out.print("Enter number to add: ");
    			UserNum = input.nextInt();
    			num += UserNum;
    		}
    		else if(option == 2){
    			System.out.print("Enter number to subtract by: ");
    			UserNum = input.nextInt();
    			num -= UserNum;
    		}
    		else if(option == 3){
    			System.out.println("The number is currently " + num);
    		}
    		else if(option!=4 ){
    			System.out.println("Not a valid option..");
    		}
    	} 
    	System.out.println("Goodbye");
    	
    }//End main
    
    
}//End class