//BufferedOutputStream
package javatpoint;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BuffferedExample {
public static void main(String[] args) throws IOException {
	FileOutputStream fo =new FileOutputStream("D:\\div.txt");
	BufferedOutputStream bs =new BufferedOutputStream(fo);
	String name ="Divyanshu sharma";
	byte b[]=name.getBytes();
	
	bs.write(b);
	bs.flush();
	bs.close();
	fo.close();
	System.out.println("Success...");
}
}
