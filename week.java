package corejava;

import java.util.Scanner;

public class week 
{
	public static void main(String args[])
	{
	System.out.println("Enter a number 1 to 7: ");
	Scanner s=new Scanner (System.in);
	int num= s.nextInt();
	switch(num)
	{
	case 1:
	  System.out.println("Monday");
	  break;
	case 2:
		  System.out.println("Tuesday");
		  break;
	case 3:
		  System.out.println("Wednesday");
		  break;
	case 4:
		  System.out.println("Thrusday");
			  break;
	case 5:
		  System.out.println("Friday");
			  break;
	case 6:
	      System.out.println("saturday");
			  break;
	case 7:
		  System.out.println("Sunday");
	default:
		  System.out.println("Invalid number");
	}
	}
}
