// collection ----- ArrayList List 
package Practice;

import java.util.ArrayList;
import java.util.List;

public class ArryList {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(23);
		l.add(89);
		l.add(33);
		l.add(90);
		l.add(23);
		l.add(89);
		l.add(33);
		l.add(90);
//		l.add(3, 90);
//		l.remove(3);
//		System.out.println(l);
		
//		System.out.println(l.get(0));
//		System.out.println(l.get(1));
//		System.out.println(l.get(2));
//		System.out.println(l.get(3));
//		System.out.println(l.get(4));
		System.out.println("Before remove= "+l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
			l.remove(i);
		}
		System.out.println("After remove= "+l.size());
	}

}
