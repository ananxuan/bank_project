package testbanking;

import banking5.*;

public class TestBanking5{
	public static void main(String[] args){
		Bank bank = new Bank();
		Customer customer;
		Account account;
		System.out.println("Creating the customer Jane Smith.");
		customer = new Customer("Jane", "Smith");
		System.out.println("create an account that can has a 500.00 balance and rate is 3%.");
		account = new SavingAccount(500,0.03);
		customer = bank.getCustomer(0);
		customer.setAccount(account);
		
		bank.addCustomer("owen", "bryant");
		customer = bank.getCustomer(1);
		account = new CheckingAccount(500.00);
		customer.setAccount(account);
		
		bank.addCustomer("tim", "soley");
		customer = bank.getCustomer(2);
		account = new CheckingAccount(500.00,500.00);
		customer.setAccount(account);
		
		bank.addCustomer("maria", "soley");
		customer = bank.getCustomer(3);
//		customer.setAccount(bank.getCustomer(2).getAccount());
		customer.setAccount(account);
	}

}
