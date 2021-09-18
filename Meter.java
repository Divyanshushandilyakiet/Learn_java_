package basicProgram;

import java.util.Scanner;

public class Meter {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter a number: ");
	float inch = sc.nextFloat();
	System.out.println("Inch to meter="+0.0254*inch);
 
}
}
