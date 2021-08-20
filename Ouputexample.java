//Fileoutputstream
package javatpoint;

import java.io.FileOutputStream;

public class Ouputexample {
	public static void main(String[] args){
		 
		String name ="Divyanshu sharma";
	
		try {
			FileOutputStream fo = new FileOutputStream("D:\\Div.txt");
			byte[] array = name.getBytes();
			fo.write(array);
			fo.close();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
		
		}
}
