//Abstraction
package javatpoint;

abstract class Bike{
	abstract void run();
}

public class TestBike extends Bike {
	void run() {
		System.out.println("Bike is runing");
	}
	public static void main(String[] args) {
		Bike bi =new TestBike();
		bi.run();
	}

}
