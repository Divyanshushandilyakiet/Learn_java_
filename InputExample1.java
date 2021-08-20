//FileInputStream
package javatpoint;

 import java.io.FileInputStream;

public class InputExample1 {
	public static void main(String[] args) {
		try {
			FileInputStream fi =new FileInputStream("D:\\div.txt");
			int i =fi.read();
			System.out.println((int)i);
			
			
			fi.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
