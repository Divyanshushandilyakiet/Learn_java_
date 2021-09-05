//Exception handling by try catch
package javatpoint;

public class Excephand {
	public static void main(String[] args) {
		try {
			int data = 100/0;
		}
		catch(ArithmeticException e){
			
			System.out.println(e);
		}
		System.out.println("CODE AGAIN START");
	}

}
