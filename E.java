//customized exception
package Practice;

public class E extends Exception{
	E(){}
	E(String s){
		super(s);
	}
	public static String mull(int a, int b) throws E,F
	{
	if(a==0 && b!=0) {
		throw new E("A is zero please enter a  non zero number");	
	}
	else if(a!=0 && b==0) {
		throw new E("B is zero please enter a  non zero number");	
	}
	else if(a==0 && b==0) {
		throw new F("A and B are zero please enter a  non zero number");	
	}
	else {
		 int c=a*b;
		 return "Multiply is "+c;	
	}
	}
}
