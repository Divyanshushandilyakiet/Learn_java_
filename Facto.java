
//calculate the Factorial by loop 
public class Facto {
	public int facto(int n) {
		int f=1;
		if(n==1 || n==0) {
			return f;
		}
		else {
			for(int i=n;i>=1;) {
			   f=f*i;
			   i--;
			 }
			return f;
		}
	}
	public static void main(String[] args) {
		Facto facto=new Facto();
		int r=facto.facto(5);
		System.out.println(r);
	}

}
