/**
 * @(#)ChangeArrayy.java
 *
 *
 * @author 
 * @version 1.00 2016/11/25
 */

import java.util.Scanner;
public class ChangeArrayy {
	static Scanner input = new Scanner(System.in);
    
    public static void main (String args[]) {
    	
    	int IDIN, hold=0;
    	double newBalance;
    	boolean flag = false;
    	int id[5]={111,222,333};
    	String name[]={"Conor","Shay","WeebFilth"};
    	double balance[]={500,30,130};
    	
    	for(int i=0; i<id.length; i++){
    		System.out.println("ID\t"+id[i]+"\nName\t"+name[i]+"\nBalance\t"+balance[i]+"\n");
    	}	
    	System.out.print("Enter an ID to change the balance of: ");
    	IDIN = input.nextInt();
    	
    	
    	for(int i=0; i<id.length; i++){
    		if(id[i]==IDIN){
    			hold = i;
    			flag = true;
    			break;
    		}
    	}
    	if(flag==true){
    		System.out.print("Enter the new blanace: ");
    		newBalance = input.nextDouble();
    		balance[hold] = newBalance;
    		for(int i=0; i<id.length; i++){
    			System.out.println("ID\t"+id[i]+"\nName\t"+name[i]+"\nBalance\t"+balance[i]+"\n");
    		}
    	}
    	else if(flag == false){
    		System.out.println("ID not found!");
    	}
    	
            
       
    }//End Main Method
    
    
    
}//End class