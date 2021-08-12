//Program to check the number is odd even 
package corejava;

import java.util.Scanner;

public class oddeven {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.print("Enter a number: ");
	 int a=sc.nextInt();
	 if(a%2==0) {
		 System.out.print("Even number");
	 }else
	 {
		 System.out.print("Odd number");
	 }
	 
 }
}
