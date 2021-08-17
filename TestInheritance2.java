//Hierarchical Inheritance
package corejava;

class Animalss{
	void eat() {
		System.out.println("eating");
	}
}

class Dogss extends Animalss{
	void bark() {
		System.out.println("dogs");
	}
}

class Catss extends Animalss{
	void meow() {
		System.out.println("Cat");
	}
}

public class TestInheritance2 {

	public static void main(String[] args) {
		Catss c=new Catss();
		c.meow();
		c.eat();
		Dogss d =new Dogss();
		d.bark();
		d.eat();
	}
}
