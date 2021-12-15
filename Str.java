package practice;

public class Str {
	public static void main(String[] args) {
		String s1= new String("India");
		String s2= new String("india");
		String s3= "india";
		String s4= "india";
	System.out.println(s1==s2);//Check the address
	System.out.println(s1.equals(s2));//check the content
	
	if(s3==s2.intern())   //to take the object of constantpool
	{
		System.out.println("Same memory");
	}
	else {
		System.out.println("Different memory");
	}
	
	}

}
