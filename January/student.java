/**
 * @(#)student.java
 * Create a student object with attributes name, address and grade
 * Then create a student test class and create 2 student objects.
 * @author Conor Bury
 * @version 1.00 2017/1/10
 */


public class student {
	
	//Attributes OR instance variables
	private String name, address;
	private int grade;

	//Constructor - same name as class  name, no return type not even void.
	//Purpose is to create an object in a consistant state.
    public student(String name, String address, int grade) {
    	this.name = name;
    	this.address = address;
    	this.grade = ((grade>-1)? grade :0); //Conditional statement
    }//End constructor
    
    
    //Set grade
    public void setGrade(int grade){
    	this.grade = ((grade>-1)? grade :0);
    }//End setGrade Method
    
    //Get grade
    public int getGrade(){
    	return grade;
    }//End getGrade Method
    
    
    //Set name
    public void setName(String name){
    	this.name = name;
    }//End setName Method
    
    //Get name
    public String getName(){
    	return name;
    }
    
    
    //Set address
    public void setAddress(String address){
    	this.address = address;
    }
    
    //Get address
    public String getAddress(){
    	return address;
    }
    
    //Print the details
	public String toString(){
   		return "\nName: "+name+"\nAddress: "+address+"\nGrade: "+grade;
	}
	
    
    
}//End class