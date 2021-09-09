// An exception occurs and is handled by the catch block
package Exceptionn;

public class Excephand14 {
public static void main(String[] args) {
    try {  
     int data=25/0;    
     System.out.println(data);    
    }  
    catch(ArithmeticException e) {
        System.out.println("Exception handled"); 
    	System.out.println("ArithmeticException");
    }
    finally {
    	System.out.println("Finally block is always executed");
    }
    System.out.println("Rest of the code..."); 
    }
}
