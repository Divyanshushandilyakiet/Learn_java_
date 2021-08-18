// Encapsulation (Connection between Accounts.java)
package javatpoint;

import corejava.Accounts;

public class Testencapu {
	public static void main(String[] args) {
		Accounts ac=new Accounts();
		ac.setAcc_no(1010);
		ac.setName("Divyanshu");
		ac.setEmail("Ds529834@gmail.com");
		ac.setAmount(10000);
		
		  System.out.println("Account:"+ac.getAcc_no()+ "\nName:"+ac.getName()+"\nEmail:"+ac.getEmail()+"\nAmount"+ac.getAmount());
	}

}
