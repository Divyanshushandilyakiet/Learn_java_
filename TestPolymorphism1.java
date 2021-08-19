//POLYMORPHISM
package javatpoint;

class Shape{
	void draw() {
		System.out.println("Drawing");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Circle");
	}
}

class Rectangle extends Shape{
	void draw () {
		System.out.println("Rectangle");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("Square");
	}
}


public class TestPolymorphism1 {
    public static void main(String[] args) {
		Shape sh;
		sh=new Circle();
		sh.draw();
		sh=new Rectangle();
		sh.draw();
		sh=new Square();
		sh.draw();
	}
}
