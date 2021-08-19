//Interface
package javatpoint;

interface Drawable{
	void draw();
}

class Recangle4 implements Drawable{
	public void draw() {
		System.out.println("Recangle has four sides");	
	}
}
class Circle4 implements Drawable{
	public void draw() {
		System.out.println("circle has no sides");
	}
}

public class TestInterface {
	public static void main(String[] args) {
		Drawable d =new Circle4();
		d.draw();
	}

}
