// customized exception
package Practice;

public class CL {
public static void main(String[] args) {

		try {
			String r = E.mull(0, 0);
			System.out.println(r );
		} 
		catch (F e) {
			e.printStackTrace();
		}
	    catch (E e) {
		e.printStackTrace();
	    }
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
