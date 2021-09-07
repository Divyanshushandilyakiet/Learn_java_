//Exception handling
package javatpoint;

public class Excephand5 {
public static void main(String[] args) {
	try {
		int a=100/0;
	}
	catch(Exception e) {
		int b=1000/0;
//		generating the exception in catch block
	}
	System.out.println("Ready");
}
}
