//Calculating the factorial by without loop
public class Factoo {
	public int numm(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		else {
			return n*numm(n-1);
		}	
	}
	public static void main(String[] args) {
		Factoo factoo=new Factoo();
		int a=factoo.numm(5);
		System.out.println(a);
	}

}
