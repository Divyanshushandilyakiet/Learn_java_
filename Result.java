//Program to check fail or pass
package corejava;

import java.util.Scanner;

public class result {
	public static void main (String args[])
	{
		Scanner sr=new Scanner(System.in);
		 System.out.print("Enter the maths number:" );
		 int math=sr.nextInt();
		 
		 if(40>=math) {
			 System.out.print("Fail");
		 }else {
			 System.out.println("pass");
		 }
	}

}
