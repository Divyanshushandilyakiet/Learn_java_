//An exception occurs but not handled by the catch block
package Exceptionn;

public class Excephand14 {
    public static void main(String args[]){   
    	  
        try {  
         int data=25/0;       
        } 
        catch(NullPointerException e){
        	System.out.println(e);
        }
        finally {  
            System.out.println("finally block is always executed");  
          }  
        System.out.println("rest of the code..."); 
}
}
