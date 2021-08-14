//Programmer to check the salary and bonus of a employee by inherit the property of parent's class
package corejava;

class Employee{
	float salary=40000;
}
public class Programmer extends Employee {
	int bonus=1000;
	public static void main(String args[])
	{
		Programmer p =new Programmer();
		System.out.println("Programmer salary="+p.salary);
		System.out.println("Programmer bonus="+p.bonus);	
	}	
}
