/**
 * @(#)loopy.java
 *
 *
 * @author 
 * @version 1.00 2016/11/11
 */


public class loopy {

    public static void main (String args[]) {
    	loop();
    }
    public static void loop(){
    	System.out.println("loop");
    	loopy();
    }
    public static void loopy(){
    	System.out.println("bloop");
    	loop();
    }
    
    
}