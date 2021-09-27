
import java.util.Scanner;

public class Fehrn {
	
	public void frn(float F ) {
	    int c=(int) ((F-32)*5/9);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float F=sc.nextFloat();
		Fehrn fe =new Fehrn();
		fe.frn(F);
		
	}

}
