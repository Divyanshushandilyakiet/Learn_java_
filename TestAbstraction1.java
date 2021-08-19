//Abstraction
package javatpoint;

abstract class Shape1{
	abstract void draw();
}

class Rectangle1 extends Shape1{
	void draw() {
		System.out.println("Draw Rectangle");
	}	
}

class Circle1 extends Shape1{
	void draw() {
		System.out.println("Draw circle");
	}	
}

public class TestAbstraction1 {
   public static void main(String[] args) {
	   Circle1 sh =new Circle1();
	  sh.draw();	   
}
}
