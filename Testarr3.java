//passing an anonymous array to method.  
package javatpoint;

public class Testarr3 {

	static void print(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		print(new int[] {12,123,435,23});
	}
}
