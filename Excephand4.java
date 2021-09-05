 //Exception handling 
package javatpoint;

public class Excephand4 {
	public static void main(String[] args) {
		int a=100;
		int b=0;
		int div;
		try {
			div =a/b;
			
		}
		catch(Exception e)
		{
			System.out.println(a+(1+b));
		}
	}
}
