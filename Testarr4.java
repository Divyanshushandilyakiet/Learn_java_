//Return an array to the method
package javatpoint;

public class Testarr4 {
	
	static int[] get() {
		return new int[] {21,324,464,232};
	}
	
	public static void main(String[] args) {
		int arr[]=get();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
	}
}
