//Object and class initialization
package corejava;

class Student{
	int id;
	String name;	
}

public class TestStudent2{
	public static void main(String args[])
	{
//creating object
		Student s1=new Student();
		Student s2=new Student();
//initializing objects
		s1.id=101;
		s1.name="Divyanshu";
		s2.id=102;
		s2.name="Vishal";
//print data
		System.out.println("id:"+s1.id+" name:"+s1.name);
		System.out.println("id:"+s2.id+" name:"+s2.name);
		
	}

}
