/**
 * @(#)FOOPAssignment2.java
 * @author Conor Bury
 * @version 1.00 2017/3/2
 */
//Import java utility scanner;
import java.util.Scanner;
public class FOOPAssignment2 {
	//Declare scanner to take input from the user as static so it can be used throughout the program.
	static Scanner input = new Scanner(System.in);
    public static void main (String args[]) {
    	//Declare the array of objects
    	pointsCalculator student[] = new pointsCalculator[6];
    	//Declare variables
    	int i, total=0;
    	//Begin for loop to take input from the user.
    	for(i=0; i<6; i++){
    		//initialise the object of value [i]
    		student[i] = new pointsCalculator();
    		//Take input from the user and send it to the method.
    		System.out.print("Enter subject "+(i+1)+": ");
    		student[i].setSubject(input.next());
    		System.out.print("Enter result "+(i+1)+": ");
     		student[i].setResult(validateResult(input.next()));
    		System.out.println();
    		//Add the points achieved the the total value
    		total += student[i].getPoints();
    	}//End for loop
    	//Print out the final value of the total points to the user
    	System.out.println("\n\nThe total points achieved was ["+total+"].");
    }//End main method

    //Begin method to validate the result and make sure it only contains digits
    public static int validateResult(String resultstr){
    	while(!resultstr.matches("\\d+")){
    		System.out.println("Error digits only");
    		System.out.print("reEnter result: ");
    		resultstr = input.next();
    	}
    	return Integer.parseInt(resultstr);
    }//End result validation

    //Begin new inner class for the pointscalculator object.
    public static class pointsCalculator{
    	//declare variables
    	private String subject;
    	private int result;

    	//Begin empty constructor
    	public pointsCalculator(){
    	}//End empty constructor
    	//Begin constructor
    	public pointsCalculator(String subject, int result){
    		this.subject = subject;
    		this.result = ((result>=0)&&(result<=100)? result:0);
    	}//End constructor

		//Set and get methods for subject
    	public void setSubject(String subject){
    		this.subject = subject;
    	}
    	public String getSubject(){
    		return subject;
    	}//End get Subject

		//Set method for setting Result
    	public void setResult(int result){
    		this.result = ((result>=0)&&(result<=100)? result:0);
    	}//End set Result
    	public int getResult(){
    		return result;
    	}//End get Result

    	public int getPoints(){
    		int points;
    		if(result>=90){
    			points = 100;
    		}
    		else if(result>=80){
    			points = 88;
    		}
    		else if(result>=70){
    			points = 77;
    		}
    		else if(result>=60){
    			points = 66;
    		}
    		else if(result>=50){
    			points = 56;
    		}
    		else if(result>=40){
    			points = 46;
    		}
    		else if(result>=30){
    			points = 36;
    		}
    		else{
    			points = 0;
    		}
    		return points;
    	}

    	public void Display(){
    		System.out.print("Subject: "+subject+"\nResult: "+result);
    	}
    }//End class inner

}//End class outer