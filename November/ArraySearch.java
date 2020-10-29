/**
 * @(#)ArraySearch.java
 *
 *
 * @author 
 * @version 1.00 2016/11/25
 */

import java.util.Scanner;
public class ArraySearch {
	static Scanner input = new Scanner(System.in);
	
	static int id[] = {101,202,303};
    static String names[] = {"Fred","Ted","John"};
    static String address[] = {"Dublin","Kerry","Meath"};
    static int IDSearch;
    static String IDSearchstr;
	
    public static void main (String args[]) {
    	
    	
    	System.out.print("Please enter your ID: ");
    	IDSearchstr = input.next();
    	IDSearch = ValidateID(IDSearchstr);
    	
    	SearchID(IDSearch);
    }//End main method
    
    public static int ValidateID(String IDSearchstr){
    	while(!IDSearchstr.matches("\\d+")){
    		System.out.println("ERROR DIGITS ONLY");
    		
    		System.out.print("Please enter your ID: ");
    		IDSearchstr = input.next();
    	}//End while
    	return Integer.parseInt(IDSearchstr);
    }//End ValidateID method
    
    public static void SearchID(int IDSearch){
    	boolean flag = false;
    	int hold=0;
    	int option=0;
    	String optionstr;
    	
    	for(int i=0; i<id.length; i++){
    		if(IDSearch==id[i]){
    			hold = i;
    			flag = true;
    			break;
    		}
    	}//End for
    	if(flag == false){
    		System.out.println("Files not found");
    		
    		System.out.print("Please enter your ID: ");
    		IDSearchstr = input.next();
    		IDSearch = ValidateID(IDSearchstr);
    		SearchID(IDSearch);
    	}
    	else if(flag == true){
    		System.out.println("\nFile found>");
    		System.out.println("ID:\t\t\t"+id[hold]+"\nName:\t\t\t"+names[hold]+"\nAddress:\t\t"+address[hold]);
    		System.out.println("\nEdit record = 1 \t Exit System = 2");
    		System.out.print("Select an option:");
    		optionstr = input.next();
    		while(!optionstr.matches("[1-2]")){
    			System.out.println("Error select 1 or 2");
    			System.out.print("Select an option:");
    			optionstr = input.next();
    		}
    		option = Integer.parseInt(optionstr);
    	}
    	
    	if(option == 2){
    		System.exit(0);
    	}
    	else if(option == 1){
    		EditRecord();
    	}
    }//End SearchID method
    
    public static void EditRecord(){
    	System.out.println("ID = 1 \t Name = 2 \t Adddress = 3");
    	System.out.println("Please ")
    }
    
}//End class