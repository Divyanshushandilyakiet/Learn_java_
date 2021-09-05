//Exception handling in NumberFormat
package javatpoint;

public class Excephand2 {
	public static void main(String[] args) {
		try {
			String s="abc";  
			int i=Integer.parseInt(s);;
		}
		catch(ArithmeticException e){
			
			System.out.println(e);
		}
		System.out.println("CODE AGAIN START");
	}
}
