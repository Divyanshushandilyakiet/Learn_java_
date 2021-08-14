//Program to solve the problem of deposit and withdrawal
package corejava;

import java.util.Scanner;

class Bank1{
	Scanner sc=new Scanner(System.in);
	int amount;
	int amount1;
		void deposit() {	
			System.out.print("Enter  amount for deposite: ");
			amount=sc.nextInt();
			System.out.println("Amount deposited sucessfull: "+amount);
		}
		void with() {
			System.out.print("Enter  amount for withdrawl: ");
			amount1=sc.nextInt();
			System.out.println("Amount withdrawled sucessfull: "+amount1);
			System.out.println("Total amount= "+(amount-amount1));
	}
}

public class Bank extends Bank1{
	public static void main(String[] args) {
	        Bank1 b = new Bank1();
	        b.deposit();
	        b.with();
	}

}
