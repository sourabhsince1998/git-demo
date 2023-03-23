package Bankapp;

public class Accountholder {
public static void main(String[] args) 
{
	Bank obj=new Atm();// upcasting
	Account a1=new Account(10001,"Tom");
	System.out.println("account holder name is "+a1.name+" and account no is "+a1.accountno );
	obj.checkbalance();
	obj.withdraw(1000);
	obj.checkbalance();
	obj.deposit(4000);
	obj.checkbalance();
	obj.checkAccountNo();
	
	
	
}
}
