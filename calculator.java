// A simple calculator

package corejava;

import java.util.Scanner;

public class cal {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int que=a/b;
		int rem=a%b;
		
		System.out.println("The sum of two number is "+sum);
		System.out.println("The sub of two number is "+sub);
		System.out.println("The multiply of two number is "+mul);
		System.out.println("The que. of two number is "+que);
		System.out.println("The rem. of two number is "+rem);
	}

}
