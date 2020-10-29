/**
 * @(#)personTest.java
 *
 *
 * @author 
 * @version 1.00 2016/12/16
 */


public class personTest {

    public static void main (String args[]) {
    	person p1 = new person("Conor", 19);
    	String name = "Fred";
    	int age = 26;
    	person p2 = new person(name,age);
    	
    	System.out.println(p1.toString());
    	System.out.println(p2.toString());
    }//End main
    
    
}//End class