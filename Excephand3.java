//Exception handling in ArrayIndexOutOfBounds
package javatpoint;

public class Excephand3 {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];  
			a[10]=50; 
		}
		catch(ArithmeticException e){
			
			System.out.println(e);
		}
		System.out.println("CODE AGAIN START");
	}
}
