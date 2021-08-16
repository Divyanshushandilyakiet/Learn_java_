package corejava;


class Child{
	int roll;
	String name;
	float fees;
	
	Child(int roll,String name,float fees){
		this.roll=roll;
		this.name=name;
		this.fees=fees;
	}
		
		void display() {
			System.out.println("Roll no: "+roll+"\nName:"+name+"\nFees:"+fees);
		}
	}
public class Test {
	public static void main(String[] args) {
		Child s1=new Child(111,"Divyanshu",1400.00f);
		s1.display();
		
		
		Child s2=new Child(112,"Vishal",1400.00f);
		s2.display();
	}

}
