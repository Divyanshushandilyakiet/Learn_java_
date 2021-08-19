//Interface
package javatpoint;

interface printable{
	void print();
}


public class A6 implements printable {

	@Override
	public void print() {
		System.out.println("Hello world");
	}
  public static void main(String[] args) {
	A6 a =new A6();
	a.print();
}
}
