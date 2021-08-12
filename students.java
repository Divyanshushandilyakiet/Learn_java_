//Print name and full name by using of if-else statement 

package corejava;

import java.util.Scanner;

public class students {
public static void main(String args[])
{
	System.out.print("Enter a number: ");
	Scanner sr =new Scanner(System.in);
	int a=sr.nextInt();
	int b=sr.nextInt();
	int c=a+b;
	 if(c>20)
	 {
		 System.out.println("Divyanshu");
	 }
	 else {
		 System.out.println("Divyanshu sharma"); 
	 }
}
}
