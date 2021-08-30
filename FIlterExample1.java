//FilterInputStream
package javatpoint;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FIlterExample1 {
	public static void main(String[] args) throws IOException {
		File data = new File("D:\\Div.txt");
		FileInputStream file =new FileInputStream(data);
		FilterInputStream filter = new BufferedInputStream(file);
		int k =0;
		while((k=filter.read())!=-1)
		{
			System.out.print((char)k);
		}
		file.close();
		filter.close();
	}
}
