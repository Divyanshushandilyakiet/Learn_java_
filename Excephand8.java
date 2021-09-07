//Exception handling( handle another unchecked exception.)
package javatpoint;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Excephand8 {
public static void main(String[] args) {
	PrintWriter pw;
	try {
        pw =new PrintWriter("div.txt");
		pw.println("Saved");
	}
	catch(FileNotFoundException e) {
		System.out.println(e);		
	}
	System.out.println("File saved Sucessfully");
}
}
