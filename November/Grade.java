/**
 * @(#)Grade.java
 * Write an Application to take in 6 subjects and the corresponding grades from a 
 * user and print out the results
 * Have 2 classes
 * 1) Grade class with String name, int Grade
 * Have 2 constructors
 *		one empty
 *		One with name and grade
 *		Have set and get methods
 *		Have a toString
 *2) In gradeTest class create a grade object
 *Create an array of Grade objects
 * Take inputs for the 6 names and grade 
 * Get the average grades
 * Print the details of all the Grade
 * @author 
 * @version 1.00 2017/2/7
 */


public class Grade {
	private String name;
	private int grade;
	
    public Grade (String name, int grade) {
    	this.name=name;
    	this.grade=((grade>100)||(grade<0)? grade:0);
    }//End Constructor
    public Grade() {
    	
    }//End blank Constructor
    public String getName(){
    	return name;
    }
    public void setName(String name){
    	this.name=name;
    }
    
    public int getGrade(){
    	return grade;
    }
    public void setGrade(int grade){
    	this.grade=((grade>100)||(grade<0)? grade:0);
    }
    
    public String toString(){
    	return "Subject: "name+"\nGrade: "+grade;
    }
    
    
}//End class Grade