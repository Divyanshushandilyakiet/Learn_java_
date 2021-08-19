//Interface
package javatpoint;
 
interface Bank{
   float intrest();
}

class SBI222 implements Bank{
	public  float intrest(){
		return 9.15f;
	}
}

class AXIS222 implements Bank{
	public float intrest() {
		return 9.18f;
		
	}
}

public class TestInterface2 {
	public static void main(String[] args) {
		Bank b = new SBI222();
		System.out.println("Rate of intrest in SBI: "+b.intrest());
		Bank b1 = new AXIS222();
		System.out.println("Rate of intrest in AXIS: "+b1.intrest());
	}}
