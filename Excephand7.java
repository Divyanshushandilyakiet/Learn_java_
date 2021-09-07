//Exception handling( handle another unchecked exception.)
package javatpoint;

public class Excephand7 {
  public static void main(String[] args) {
	try {
		int arr[]= {1,2,3,4};
System.out.println(arr[10]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	System.out.println("Again start");
}
}
