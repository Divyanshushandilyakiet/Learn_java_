//Age is less than 18, we are throwing the ArithmeticException 
package Exceptionn;

public class Excephand16 {
	
	public static void validate(int n)
	{
		if(n<18) {
			throw new ArithmeticException("Person not eligible to vote");
		}
		else {
			System.out.println("Person eligble to vote");
		}
	}
	public static void main(String[] args) {
	  validate(15);
	  System.out.println("Again start...");
		
	}

}
