//Use Multiple catch block
package Exceptionn;

public class ExcepHand9 {
public static void main(String[] args) {
	try{
		int a[]=new int [5];
		a[5]=30/0;
	}
catch(ArithmeticException e)
{
	System.out.println("ArithmeticException occurs");
}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexOutOfBound occurs");	
	}
	catch(Exception e)
	{
		System.out.println("Parent exception occurs");
	}
System.out.println("again start");	
}
}
