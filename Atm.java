 package Bankapp;

public class Atm  implements Bank{
	
	
	

	int balance=10000;

	@Override
	public void deposit(int amount) {
		
		System.out.println("depositing amount is "+amount);
		balance=balance+amount;
		System.out.println("amount deposited succesfully");
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("withdrawing amount is "+amount);
		balance=balance-amount;
		System.out.println("amount deposited succesfully");
	}

	@Override
	public void checkbalance() {
		System.out.println("available balance is "+balance);
		
	}

	@Override
	public void checkAccount()
	{
		System.out.println("checking account");
		
	}
	

}
