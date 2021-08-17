//Multilevel Inheritance
package corejava;

class Animals{
	void eat() {
		System.out.println("Animals are eating");
	}
}

class Dogs extends Animals{
	void bark() {
		System.out.println("Dogs are barking");
		
	}
}

class BabyDog extends Dogs{
	void weep() {
		System.out.println("Baby dog are weeping");
	}
}

public class TestInheritance1 {
	public static void main(String[] args) {
		BabyDog b=new BabyDog();
		b.weep();
		b.eat();
		b.bark();
	}

}
