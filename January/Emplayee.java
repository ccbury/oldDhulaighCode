/**
 * @(#)Emplayee.java
 *
 *
 * @author 
 * @version 1.00 2017/1/17
 */


public class Emplayee {
	private String name, role;
	private double salary;
	
    public Emplayee(String name, String role, double salary) {
    	this.name = name;
    	this.role = role;
    	this.salary  = ((salary>0.0)?salary:0.0);
    }//End constructer
    public void setName(String name){
    	this.name = name;
    }//End setName Method
    public void setRole(String role){
    	this.role = role;
    }//End setRole Method
    public void setSalary(double salary){
    	this.salary  = ((salary>0.0)?salary:0.0);
    }//End setSalary Method
    public String getName(){
    	return name;
    }//End getName Method
    public String getRole(){
    	return role;
    }//End getRole Method
    public double getSalary(){
    	return salary;
    }//End getSalary Method
    public String toString(){
    	return "Name: "+name+"\nRole: "+role+"\nSalary: "+salary;
    }//End toString Method
    
    
}//End Main