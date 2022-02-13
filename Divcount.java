//Remainder zero numbers between 1 to 100
public class Divcount {
	int count=0;
	public void divco(int n, int p) {
		if(n<=100) {
		if(n%p==0) {
		System.out.println(n);
		 ++count;
		}
		divco(n+1,p);
		}
	}
	public static void main(String[] args) {
		Divcount div=new Divcount();
		div.divco(1, 50);
		System.out.println("\nTotal numbers are: "+div.count);
	}

}
