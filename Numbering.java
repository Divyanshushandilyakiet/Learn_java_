
public class Numbering {
	
	
//	print backward numbering without loop
	public void numm(int n) {
		if(n<=10) {
		System.out.println(n);
		numm(n+1);
		}
	}
		
//	print backward numbering with loop 
//	public void num(int n) {
//		for(int i=n;i>=1;i--)
//			System.out.println(i);
//		
//	}
	public static void main(String[] args) {
	   Numbering numbering=new Numbering();
//	   numbering.num(10);
	   numbering.numm(1);
	}

}
