//Exception handling in NullPointer
package javatpoint;

public class Excephand1 {
	public static void main(String[] args) {
		try {
			String s=null;  
			System.out.println(s.length());
		}
		catch(ArithmeticException e){
			
			System.out.println(e);
		}
		System.out.println("CODE AGAIN START");
	}

}
