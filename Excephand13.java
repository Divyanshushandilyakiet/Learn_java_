//Finally block is always executed
package Exceptionn;

public class Excephand13 {
	public static void main(String[] args) {
		try {
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
			
		}	
		finally {
			System.out.println("Finally block is always excuted");
		}
		System.out.println("Again Start");
	}
}
