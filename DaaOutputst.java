//DataOutputStream
package javatpoint;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DaaOutputst {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("D:\\Div.txt");
	    DataOutputStream data = new DataOutputStream(file);
	    
	    data.writeChars("Divyanshu");
	    data.flush();
	    data.close();
	    System.out.println("Success...");
	}

}
