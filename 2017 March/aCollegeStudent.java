/**
 * @(#)aCollegeStudent.java
 *
 *
 * @author 
 * @version 1.00 2017/3/14
 */
//Creating a new package
package CollegeS;
public class aCollegeStudent {
	//Three different "access modifiers" private, public and protected
	// Private can only be accessed by the class it is in
	// Protected can only be accessed by the classes in the package it is in.
	
	private String name, course;
	private int id;
	
    public aCollegeStudent(String name, String course, int id) {
    	this.name = name;
    	this.course = course;
    	this.id = id;
    }//end constructor
    
    public String toString(){
    	return "Name = "+name+"\nID = "+id+"\nCourse = "+course;
    }
    
    public String getName(){
    	return name;
    }
    
    public String getCourse(){
    	return course;
    }
    
    public int getId(){
    	return id;
    }
    
    public void setName(String name){
    	this.name=name;
    }
    
    public void setCourse(String course){
    	this.course = course;
    }
    
    public void setId (int id){
    	this.id=id;
    }
}//end class