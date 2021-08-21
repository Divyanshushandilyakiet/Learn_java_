//FileInputStream and FileOutputStream
package javatpoint;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExample1 {
	public static void main(String[] args) throws IOException {
		String name = "Divyanshu sharma file";
		
		byte[]b=name.getBytes();
		
		FileOutputStream fo =new FileOutputStream("D:\\Div.txt");
		fo.write(b);
		System.out.println("Successful...");
		
		FileInputStream fi = new FileInputStream("D:\\Div.txt");
		
		int i =0;
		while((i=fi.read())!=-1) {
			System.out.println((char)i);
		}
		
	}

}
