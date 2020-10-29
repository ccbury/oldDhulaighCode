/**
 * @(#)aCollegeStudent.java
 *
 *
 * @author 
 * @version 1.00 2017/3/14
 */
package CollegeS;
import java.util.Scanner;
import java.util.Date;
public class aCollegeStudentTest {

    public static void main (String args[]) {
    	Scanner input = new Scanner(System.in);
    	aCollegeStudent acs[] = new aCollegeStudent[2];
    	String name, course;
    	int id, idsearch, i;
    	
    	//ask the user for the names, courses and IDs of the students
    	for(i=0; i<acs.length; i++){
    		if(i != 0){
    			input.nextLine();
    			System.out.println();
    		}
    		System.out.print("Enter name " +(i+1)+": ");
    		name = input.nextLine();
    		System.out.print("Enter course for "+ name+": ");
    		course = input.nextLine();
    		System.out.print("Enter id for "+ name+": ");
    		id = input.nextInt();
    		
    		acs[i] = new aCollegeStudent(name, course, id);
    	}//End For loop
    	System.out.println();
    	for(i=0; i<acs.length; i++){
    		System.out.println(acs[i].toString());
    	}//end For loop
    	
    	//Ask the user for the ID of the user of the student changing course
    	System.out.print("\nEnter the ID of the student changeing courses: ");
    	idsearch = input.nextInt();
    	
    	//Loop to search for the ID in the array of objects
    	i = 0;
    	while(idsearch != acs[i].getId()){
    		i++;
    		if(i == acs.length){
    			System.out.println("Error, No such ID found.");
    			System.out.print("\nEnter the ID of the student changeing courses: ");
    			idsearch = input.nextInt();
    			i = 0;
    		}//end if
    	}//end while
    	
    	//Prompt the user for the new course name
    	System.out.print("Enter new course name: ");
    	acs[i].setCourse(input.next());
    	
    	System.out.println("\n"+acs[i].toString());
    }//End main method
    
    
}//End main