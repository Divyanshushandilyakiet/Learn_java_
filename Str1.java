package practice;

public class Str1 {
public static void main(String[] args) {
	String s3= "india";
	String s4= "INDia";
	
	System.out.println(s3.toUpperCase());
	
	System.out.println(s4.toLowerCase());
	
	System.out.println(s3.substring(2).toUpperCase());
	
	System.out.println(s3.substring(0, 1)+s3.substring(3, 4));
	
//	change the string to character 
    char[] ch=s3.toCharArray();
    for(char p :ch) {
    	System.out.println(p);
    }
    
//   Change the char to string
     char ch1[]={'R','A','M'};
     String ss=new String(ch1);
     System.out.println(ss);
}
}
