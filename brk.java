//break in inner loop
package corejava;

public class brk {
	public static void main(String srgs[]) {
	
	for(int i=1;i<=3;i++)
	{
//innner loop 
		
		// Outer loop
		for(int j=1;j<=3;j++)
		{
			if(i==2&&j==2)
			{
			break;
			}
		
		System.out.println(i+" "+j);
		}
	}
	}
}
