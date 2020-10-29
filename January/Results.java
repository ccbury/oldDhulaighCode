/**
 * @(#)Results.java
 * Create a result class with subject and grade
 * Have a blank construcator and a constructor that takes two variables.
 *
 * Have set and get methods and display method (Return type void)
 * Have a calculatepoints method that will calculate the points for that grade
 *
 * Have a UseResults class that will have a loop to take in 6 results. 
 * Set the grade and subject
 * Call the calculate points method to calculate the total of the points achieved
 *
 * Display the total number of points
 *
 *		if(grade>80){ points = 100
 *		if(grade>60){ points = 80
 *		if(grade>40){ points = 50
 *		else{ points = 0
 * @author Conor Bury
 * @version 1.00 2017/2/9
 */


public class Results {
	private String subject;
	private int grade;
	
    public Results(String subject, int grade) {
    	this.subject=subject;
    	this.grade=((grade<100)||(grade>0)? grade:0);
    }//End main constructor
    public Results(){	
    }//End blank constructor
    
    public void setSubject(String subject){
    	this.subject = subject;
    }//End setSubject
    public String getSubject(){
    	return subject;
    }//End getSubject
    
    public void setGrade(int grade){
    	this.grade=((grade<100)||(grade>0)? grade:0);
    }//End setGrade
    public int getGrade(){
    	return grade;
    }//End getGrade
    
    public void display(){
    	System.out.println("Subject: "+subject+"\tGrade: "+grade);
    }//End display method
    public String toString(){
    	return "Subject: "+subject+"\tGrade: "+grade;
    }//End toString
    
    public int calculatePoints(){
    	int pointcalc;
    	if(grade>80){
    		pointcalc = 100;
    	}
    	else if(grade>60){
    		pointcalc = 80;
    	}
    	else if(grade>40){
    		pointcalc = 50;
    	}
    	else{
    		pointcalc = 0;
    	}
    	return pointcalc;
    }//End calculatepoints method
    
}//End class