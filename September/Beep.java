/** 27
 * @(#)Beep.java
 * Create 2 loops that will print numbers from 1 -10 with beeps 
 * @author Conor Bury
 * @version 1.00 2016/9/30
 */


public class Beep {

    public static void main(String args[]) {
    	
    /*	for(int i=1; i<=10000; i++){
    		System.out.println(i);
    		System.out.print("\007");
    	}
    	
    	System.out.println();
    	*/
    	for(int i=1; i<=10000; i++){
    		System.out.println(i);
    		java.awt.Toolkit.getDefaultToolkit().beep();
    	}
    	
    	System.out.println();
    	
    }//End main method
    
    
}//End class