//Abstraction
package javatpoint;

abstract class Bike3{
	Bike3(){System.out.println("Bike is safe");}
	abstract void run();
	void changeGear() {System.out.println("Gear change");}
	}
	
	 class Honda extends Bike3{
		void run() {System.out.println("Running Safly");}
		
		
	}
class TestAbstraction2{
	public static void main(String[] args) {
		Bike3 bi =new Honda();
		bi.changeGear();
		bi.run();
		
	}
}
