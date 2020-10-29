/**
 * @(#)CollegeStudent.java
 * a college student has an id, email and course
 * Have an empty constructor and a constructor to take in all parametees
 * Create set and get methods and toString method
 * In the collegeStudentTest take in 3 college students after all students have been
 * entered print all the details of the students
 * use the empty constructor when creating the collegeStudent
 *
 * @author 
 * @version 1.00 2017/2/10
 */


public class CollegeStudent {
	
	private int id;
	private String email, course;
	
    public CollegeStudent(int id, String email, String course){
    	this.id = id;
    	this.email = email;
    	this.course = course;
    }//End constructor
    public CollegeStudent() {
    }//End blank constructor
    
    public int getId(){
    	return id;
    }//End getId
    public void setId(int id){
    	this.id = id;
    }//End setId
    
    public String getEmail(){
    	return email;
    }//End getEmail
    public void setEmail(String email){
    	this.email = email;
    }//End setEmail
    
    public String getCourse(){
    	return course;
    }//End getCourse
    public void setCourse(){
    	this.course = course;
    }//End setCourse
    
    public String toString(){
    	return "ID: "+id+"\tEmail: "+email+"\tCourse: "+course;
    }
    
    
    
}