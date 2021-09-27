
public class Armstrong {	
	public void arm() {
		int number=370;
		int temp = number;
	     double sum=0;
	     
		while(temp!=0) {
			int rem =temp%10;
			 sum=sum+Math.pow(rem,3);
			 temp=temp/10;
		}
		if(sum==number) {
			 System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}

	public static void main(String[] args) {
    Armstrong armstrong = new Armstrong();
    armstrong.arm();    
	}
}
