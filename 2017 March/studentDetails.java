/**
 * @(#)studentDetails.java
 * Have a steudent with instance variables name, age, ID and grade
 * Have set and get methods and a toString
 * 
 * In the studentSetailsTest create a studentDetails array and hardcode 3 studentDetails objects
 * Have a menu with:
 *		1. View name
 *		2. Change age
 *		3. Add to grade
 * 		4. exit
 * Before menu ask the user to enter ID and search for the user
 * @author 
 * @version 1.00 2017/3/16
 */


public class studentDetails {
	private String name;
	private int age, id, grade;
	
    public studentDetails() {
    }//Empty constructor
    
    public studentDetails(String name, int age, int id, int Grade){
    	this.name = name;
    	this.age = ((age>0)? age:0);
    	this.id = id;
    	this.grade = ((grade>=0)? grade:0);
    }//End constructor
    
    public void setName(String name){
    	this.name = name;
    }//End setName
    public String getName(){
    	return name;
    }//End getName
    
    public void setAge(int age){
    	this.age = ((age>0)? age:0);
    }//End setAge
    public int getAge(){
    	return age;
    }//End getAge
    
    public void setId(int id){
    	this.id = id;
    }//End setId
    public int getId(){
    	return id;
    }//End setId
    
    public int getGrade(){
    	return grade;
    }//End setAge
    public void setGrade(int grade){
    	this.grade = ((grade>0)? grade:0);
    }//End setAge
    
    public String toString(){
    	return "ID: "+id+"\nName: "+name+"\nAge: "+age+"\nGrade: "+grade;
    }//End toString
    
}//End class