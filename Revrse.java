// Reverse the string and also remove the extra space from the string 
package InterviewPrograms;

public class Revrse {
	public static void main(String[] args) {
		String s1="  Divyanshu   is a   good boy  ";
	    String st=s1.replaceAll("\\s+", " ");
		 String s2="";
		for(int i=st.length()-1;i>=0;i--) {
			s2=s2+st.charAt(i);		
		}
		System.out.println(s2.trim());
	}
}
