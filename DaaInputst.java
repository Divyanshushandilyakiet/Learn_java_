// DataInputStream
//Reading the data from the file Div.txt file
package javatpoint;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DaaInputst {
	public static void main(String[] args) throws IOException {
		InputStream input =new FileInputStream("D:\\Div.txt");
		  DataInputStream inst = new DataInputStream(input);
		  int i =input.available();
		  byte[] ary = new byte[i];
		  inst.read(ary); 
		  for(byte bt:ary) {
			  char k=(char)bt;
			  System.out.print(k+"-");
		 }  
	}
}
