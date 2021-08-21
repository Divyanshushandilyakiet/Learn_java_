//SequenceInputStream
package javatpoint;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SeqInputstream {
	public static void main(String[] args) throws IOException {
		FileInputStream fi1 =new FileInputStream("D:\\div.txt");
		FileInputStream fi2 =new FileInputStream("D:\\\\Div.txt");
		SequenceInputStream ins = new SequenceInputStream(fi1,fi2);
		int j;
		while((j=ins.read())!=-1)
		{
			System.out.println((char)j);
		}
		ins.close();
		fi1.close();
		fi2.close();
	}
}
