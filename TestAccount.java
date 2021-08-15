//Program to check the information the bank account
package corejava;
class Account{
	int acc_no;
	String name;
	float amount;
	
//Method to  initialize the object 	
	void insert(int a,String s,float amt){
		acc_no=a;
		name=s;
		amount=amt;
	}
//deposit method
	void deposit(float amt) {
		amount = amount+amt;
		System.out.println("Deposite="+amt);		
	}
//Withdrawn method
	void withdrawn(float amt) {
		if(amount<amt) {
			System.out.println("INSUFFICENT AMOUNT");
			}
			else {
				amount=amount-amt;
				System.out.println("Withdrawn:"+amt);
			}
		}
//method to check the balance of the account  
	void checkBalance(){
		System.out.println("Balance is: "+amount);
		}  
//method to display the values of an object  
	void display(){
		System.out.println(acc_no+" "+name+" "+amount);
		}  	
}

public class TestAccount {
	public static void main(String[] args) {
		Account a=new Account();
		a.insert(101, "Divyanshu",10000);
		a.display();
		a.checkBalance();
		a.deposit(3000);
		a.checkBalance();
		a.withdrawn(5000);
		a.checkBalance();
	}
}
