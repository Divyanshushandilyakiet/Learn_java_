//Program to check a number is prime or not 
package basicProgram;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number to check:");
	int n=sc.nextInt();
	int temp=0;
	for(int i=2;i<n-1;i++)
	{
		if(n%i==0)
		{
		temp=temp+1;
		}
	}
	if(temp<0)
	{
		System.out.println("Not a prime number");
	}
	else {
		System.out.println("Prime number");
	}
}
}
