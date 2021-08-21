// BufferedInputStream
package javatpoint;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BuffferedExample1 {
	public static void main(String[] args) {
		try {
			FileInputStream fi =new FileInputStream("D:\\Div.txt");
			BufferedInputStream bs = new BufferedInputStream (fi);
			int i=0;
			
			while((i=bs.read())!=-1) {
				System.out.println((char)i);
			}
			bs.read();
			bs.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
