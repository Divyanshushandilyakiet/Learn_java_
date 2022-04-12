package Practice;
//ArrayList collection
import java.util.ArrayList;
import java.util.List;

public class EmpList {
	
	public List<Emp> getData() {
	List<Emp> l=new ArrayList<Emp>();
	Emp emp=new Emp();
	emp.setId(11);
	emp.setName("Divyanshu");
	emp.setAdd("Ghaziabd");
	l.add(emp);
	
	Emp emp1=new Emp();
	emp1.setId(12);
	emp1.setName("Nishant");
	emp1.setAdd("Modinagar");
	l.add(emp1);
	
	Emp emp2=new Emp();
	emp2.setId(13);
	emp2.setName("Abhijeet");
	emp2.setAdd("Meerut");
	l.add(emp2);
	
	Emp emp3=new Emp();
	emp3.setId(14);
	emp3.setName("Akshay");
	emp3.setAdd("Ghazizbad");
	l.add(emp3);
	
	return l;
	
	}

}
