// Overriding
package corejava;

class Vehicless{
	void run() {
		System.out.println("The Vehicles are running");
	}
}
class Bike extends Vehicless{
	void run() {
		System.out.println("The bike is running");
	}
 public static void main(String[] args) {
	Bike b = new Bike();
	b.run();
}
}
