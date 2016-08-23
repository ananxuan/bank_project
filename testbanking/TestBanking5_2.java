package testbanking;

import banking5_2.*;

public class TestBanking5_2 {
	public static void main(String[] args){
		Bank bank = new Bank();
		Customer customer;
		Account  account;
		
		bank.addCustomer("jane", "smith");
		customer = bank.getCustomer(0);
		customer.setSaving(new SavingAccount(500.00, 0.05));
		customer.setChecking(new CheckingAccount((200.00), customer.getSaving()));
		
		bank.addCustomer("owen", "bryant");
		customer = bank.getCustomer(1);
		customer.setChecking(new CheckingAccount(200.00));
		
		customer = bank.getCustomer(0);
		account = customer.getChecking();
		System.out.println("Customer:"+ customer.getLastName() + ","+ customer.getFirstName() +
					"has a savingccount of" + customer.getSaving().getbalance() +
					"has a checkingaccount of" + customer.getChecking().getbalance());
		System.out.println("Checking Acct [jane smith] : withraw 150.00 succeeds?"
				+ account.withdraw(150.00));
		System.out.println("Checking Acct [jane smith] : deposit 22.5 succeeds?"
				+ account.deposit(22.5));
		System.out.println("Checking Acct [jane smith] : withraw 147.62 succeeds?"
				+ account.withdraw(147.62));
				
		System.out.println("Customer:"+ customer.getLastName() + ","+ customer.getFirstName() +
				"has a savingccount of" + customer.getSaving().getbalance() +
				"has a checkingaccount of" + customer.getChecking().getbalance());
		
		System.out.println();
		
		customer = bank.getCustomer(1);
		account = customer.getChecking();
		System.out.println("Customer:"+ customer.getLastName() + ","+ customer.getFirstName() +
					"has a checkingaccount of" + customer.getChecking().getbalance());
		System.out.println("Checking Acct [jane smith] : withraw 100.00 succeeds?"
				+ account.withdraw(100.00));
		System.out.println("Checking Acct [jane smith] : deposit 25 succeeds?"
				+ account.deposit(25));
		System.out.println("Checking Acct [jane smith] : withraw 175 succeeds?"
				+ account.withdraw(175.62));
				
		System.out.println("Customer:"+ customer.getLastName() + ","+ customer.getFirstName() +
				"has a checkingaccount of" + customer.getChecking().getbalance());
	}

}
