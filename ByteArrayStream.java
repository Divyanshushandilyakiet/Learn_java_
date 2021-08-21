//ByteArrayOutputStream
package javatpoint;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteArrayStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fs1 =new FileOutputStream("D:\\DIv.txt");
		FileOutputStream fs2 =new FileOutputStream("D:\\DIv.txt");
		
		ByteArrayOutputStream bos =new ByteArrayOutputStream();
		bos.write(65);
		bos.writeTo(fs1);	
		bos.writeTo(fs2);
		
		
		bos.flush();
		bos.close();
		System.out.println("Success...");
	}
}
