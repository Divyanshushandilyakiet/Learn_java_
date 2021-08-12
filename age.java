//Program to check the age for voting 
package corejava;

import java.util.Scanner;

public class age {
	public static void main(String args[])
	{
	  System.out.print("Enter your age: ");
	  Scanner sr =new Scanner(System.in);
	  int age=sr.nextInt();
	  if(age>=18) {
		  System.out.println("Your are valid for voting");
	  }
	  else {
		  System.out.println("You are not valid for voting");
	  }
	}
}
