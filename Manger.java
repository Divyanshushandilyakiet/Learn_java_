package Practice;
//Collection ArrayList 
import java.util.List;

public class Manger {
	public static void main(String[] args) {
		Collect	collect=new Collect();
		List<String> List=collect.getList();
		System.out.println("After= "+List.size());
		for(int i=0;i<=3;i++) {
			System.out.println(List.get(i));
		}
		System.out.println("Before= "+List.size());
	}

}
