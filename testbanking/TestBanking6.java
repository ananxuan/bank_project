package testbanking;

import banking6.domain.*;
import banking6.reports.*;


public class TestBanking6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = Bank.getBanking();
		Customer customer;
		CustomerReport report = new CustomerReport();
		bank.addCustomer("jane", "smith");
		customer = bank.getCustomer(0);
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer("owen", "bryant");
		customer=bank.getCustomer(1);
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer("tim", "soley");
		customer = bank.getCustomer(2);
		customer.addAccount(new SavingAccount(1500.00, 0.05));
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer("maria", "soley");
		customer = bank.getCustomer(3);
		customer.addAccount(bank.getCustomer(2).getAccount(1));
		customer.addAccount(new SavingAccount(150.00, 0.05));
		report.generateReport();
	}

}
