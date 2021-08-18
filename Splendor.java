// Polymorphism
package corejava;

class Bikess{
	void run() {
		System.out.println("Running");
	}
}

public class Splendor extends Bikess {
	void run() {
		System.out.println("RUnning saftly");
	}
	
public static void main(String[] args) {
	Bikess b =new Splendor();
	b.run();
	Bikess bi =new Bikess();
	bi.run();
}
	
}
