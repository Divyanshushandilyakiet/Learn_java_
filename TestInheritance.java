//Single Inheritance
package corejava;

class Animal{
	void eat() {
		System.out.println(" Animals are Eating");
	}
}

class Dog extends Animal {
	void bark(){
		System.out.println("Dogs are barking");
		
	}
}


public class TestInheritance {
	public static void main(String[] args) {
		Dog a=new Dog();
		a.eat();
		a.bark();
	}

}
