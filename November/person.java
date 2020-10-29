/**
 * @(#)person.java
 *
 *
 * @author 
 * @version 1.00 2016/12/16
 */


public class person {

	private String name;
	private int age;
	
    public person(String name, int age) {
    		this.name = name;
    		this.age = ((age>0)? age:1);
    }
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
    public void getName(String name){
    	this.name=name;
    }
    public void getAge(int age){
    	this.age=((age>0)? age:1);
    }
    public String toString(){
    	return "Name: " +name+ "\nAge: " +age;
    }
    
    
}