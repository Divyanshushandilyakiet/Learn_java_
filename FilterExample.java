//FilterOutputStream
package javatpoint;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterExample {
	public static void main(String[] args) throws IOException {
		File Data = new File("D:\\Div.txt");
		FileOutputStream file = new FileOutputStream(Data);
		FilterOutputStream filter = new FilterOutputStream(file);
		String s= "Welcome to my world";
		byte b[]=s.getBytes();
		filter.write(b);
		filter.flush();
		filter.close();
		file.close();
		System.out.println("Sucess..");	
	}
}
