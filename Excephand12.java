package Exceptionn;

//Nested try and catch
public class Excephand12 {
	public static void main(String args[]){   
		 //outer try block       
			  try {   
		  //inner try block 1  
		    try{    
		     System.out.println("Going to divide by 0");    
		     int b =39/0;    
		   }  
		    //catch block of inner try block 1  
		    catch(ArithmeticException e)  
		    {  
		      System.out.println(e);  
		    }    
		       
		    
		    //inner try block 2  
		    try{    
		    int a[]=new int[5];    
		  
		    //assigning the value out of array bounds  
		     a[10]=4;    
		     }  
		  
		    //catch block of inner try block 2  
		    catch(ArrayIndexOutOfBoundsException e)  
		    {  
		       System.out.println(e);  
		    }    
		  
		      
		    System.out.println("other statement");    
		  }  
		  //catch block of outer try block  
		  catch(Exception e)  
		  {  
		    System.out.println("Handled");  
		  }    
		    
		  System.out.println("normal flow..");    
		 }    
		} 
