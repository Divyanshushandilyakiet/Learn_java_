//Full example of an anonymous function.
// Factorial of 6
package corejava;

public class Ano {
	void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			 fact=fact*i;
		}
		System.out.print("Factorial is:"+fact);
	}
public static void main(String[] args) {
	new ano().fact(6);
}
}
