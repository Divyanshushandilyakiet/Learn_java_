//Object and class initialization
package corejava;

class Student{
	int id;
	String name;
}
public class TestStudent {
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.id=1016;
		s1.name="Divyanshu";
		System.out.println("id:"+s1.id+ "\nname:"+s1.name);
	}

}
