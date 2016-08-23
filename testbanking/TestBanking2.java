package testbanking;


import banking2.*;

public class TestBanking2 {
	public static void main(String[] args){
		Customer customer;
		Account account;
		
		// 创建帐户
		System.out.println("Creating the customer Jane Smith.");
		customer = new Customer("Jane", "Smith");
		System.out.println("create an account that can has a 500.00 balance.");
		account = new Account(500.00);
		customer.setAccount(account);
		//code
		customer.getAccount().withdraw(150.00);
		System.out.println("withraw 150.00");
		customer.getAccount().deposit(22.50);
		System.out.println("deposit 22.50");
		customer.getAccount().withdraw(47.62);
		System.out.println("withraw 47.62"); 
		System.out.println("Customer" +customer.getLastName() +" " +customer.getFirstName() +" has a balance of " +  customer.getAccount().getbalance());
	}
}
