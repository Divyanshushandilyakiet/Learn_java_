//Program to identify the number is positive and negatve
package corejava;

import java.util.Scanner;

public class sign {
		public static void main(String args[])
		{
	System.out.print("Enter a number: ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num>0)
	{
		System.out.println("Positive number");
	}
	else if(num<0){
		System.out.println("Negative number");
	}
	else if(num==0) {
		System.out.println("zero");
	}
	}

}
