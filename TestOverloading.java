package corejava;

public class Addtwo {
	 static int add(int a,int b) {
		return a+b;	
	}
 static int add(int a,int b, int c) {
	 return a+b+c;
 }
}
public class TestOverloading {
	public static void main(String[] args) {
		System.out.println(Addtwo.add(11,11));
		System.out.println(Addtwo.add(11,11,11));
	}

}
