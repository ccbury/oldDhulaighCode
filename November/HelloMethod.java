/**
 * @(#)HelloMethod.java
 *
 *
 * @author 
 * @version 1.00 2016/11/11
 */


public class HelloMethod {

    public static void main (String args[]) {
    	Hello_Method();
    	Hello_Method("Conor");
    	Hello_Method("Conor","Bury");
    	Hello_Method("Conor","Bury",19);
    }//End Main Method
    public static void Hello_Method(){
    	System.out.println("Hello");
    }//End Hello_Method
    public static void Hello_Method(String me){
    	System.out.println("Hello " + me);
    }//End Hello_Method
    public static void Hello_Method(String name, String sname){
    	System.out.println("Hello "+name+" "+sname);
    }//End Hello_Method
    public static void Hello_Method(String name, String sname, int age){
    	System.out.println("Hello "+name+" "+sname+". You are "+age+" years old.");
    }//End Hello_Method
}//End Class