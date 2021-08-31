//Java Console Example to read password
package javatpoint;

import java.io.Console;

public class ReadPasswordTest {
	public static void main(String[] args) {
		Console c =System.console();
		System.out.println("Enter your password:");
		char[] ch = c.readPassword();
		String pass=String.valueOf(ch);
		System.out.println("Password is: "+pass);
	}

}
