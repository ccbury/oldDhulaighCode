/**
 * @(#)studentDetailsTest.java
 *
 *
 * @author 
 * @version 1.00 2017/3/16
 */

import java.util.Scanner;
public class studentDetailsTest {
	static Scanner input = new Scanner(System.in);
    public static void main (String args[]) {
    	int idsearch, i, menuoption =0;
    	studentDetails student[] = new studentDetails[3];
    	
    	student[0] = new studentDetails("Conor", 19, 404, 400);
    	student[1] = new studentDetails("Shay", 19, 169, 200);
    	student[2] = new studentDetails("Jack", 18, 1, 600);
    	
    	System.out.print("Please enter the ID of the student: ");
    	idsearch = input.nextInt();
    	
    	//Loop to search for the ID in the array of objects
    	i = 0;
    	while(idsearch != student[i].getId()){
    		i++;
    		if(i == 3){
    			System.out.println("Error, No such ID found.");
    			System.out.print("\nEnter the ID of the student changeing courses: ");
    			idsearch = input.nextInt();
    			i = 0;
    		}//end if
    	}//end while
    	
    	while(menuoption != 4){
    		System.out.println("Options Menu..."+"\n1. View Name\n2. Change Age\n3. Add to Grade\n4. Exit Menu");
    		System.out.print("\nEnter an option to select: ");
    		menuoption = input.nextInt();
    		
    		if(menuoption == 1){
    			System.out.println(student[i].getName());
    		}
    		else if(menuoption == 2){
    			System.out.print("Enter new age: ");
    			student[i].setAge(input.nextInt());
    		}
    		else if(menuoption == 3){
    			System.out.println("Enter amount to add to grade");
    			student[i].setGrade(student[i].getGrade()+input.nextInt());
    		}
    		else if(menuoption>4){
    			System.out.println("Error. Invalid option");
    		}
    	}
    	
    	System.out.println(student[i].toString());
    }//end main method
    
    
}//end class