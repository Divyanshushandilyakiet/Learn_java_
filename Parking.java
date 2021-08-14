//Program to taking the parking charge
package corejava;

import java.util.Scanner;

class Vehicle{
	int charge1;
	int charge2;
	Scanner sc =new Scanner(System.in);
	void car()
	{   
		System.out.println("charge of car is 5 rupee");
		 charge1=sc.nextInt();
		System.out.println("charge: "+charge1);	
		System.out.println("UPDATE PAID");
	}
	void bus()
	{
		System.out.println("Charge of bus is 10 rupee");
		charge2=sc.nextInt();
		System.out.println("charge: "+charge2);
		System.out.println("UPDATE PAID");
	}	
}
public class Parking extends Vehicle {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.car();
		v.bus();	
	}

}
