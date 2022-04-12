package Practice;
//ArrayList collection
import java.util.List;

public class Cli {
	public static void main(String[] args) {
      EmpList a=new EmpList();
     List<Emp> q = a.getData();
	
       for(Emp p:q)
       {
    	   System.out.println(p.getId()+" "+p.getName()+" "+p.getAdd());
       }
	}	
}
