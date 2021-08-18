// Overloading Changing data type
package corejava;

class Summ{
	
	static int sum (int a,int b) {
		return a+b;
	}
	static float sum (float a,float b,float c) {
		return a+b+c;
	}

}
public class TestOverloading2 {
	public static void main(String[] args) {
		System.out.println(Summ.sum(91, 81));
		System.out.println(Summ.sum(12.223f, 213.3f, 231.56f));
	}

}
