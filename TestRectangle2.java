//Program to calculate the area and perimeter of the rectangle by user input
package corejava;

import java.util.Scanner;

class Rectangle{
	Scanner sc=new Scanner(System.in);
	int length=sc.nextInt();
	int width=sc.nextInt();

	
void insert(int l,int w) {
	length=l;
	width=w;
}
void area()
{
	System.out.println("Area= "+length*width);
	
}
void per() {
	System.out.println("perimeter= "+ 2*(length+width));
}
}
public class TestReactangle1{
	public static void main(String args[])
	{

		System.out.println("Enter two number:");
		Rectangle r1=new Rectangle();
		r1.area();
		r1.per();
	}
}
