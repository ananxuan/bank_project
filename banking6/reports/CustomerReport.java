package banking6.reports;

import banking6.domain.*;
public class CustomerReport {
	public void generateReport(){
		Bank bank = Bank.getBanking();
		Customer customer;
		CustomerReport report = new CustomerReport();
		System.out.println("\t\t\tCUSTOMER REPORT");
		System.out.println("\t\t\t===============");
		
		for(int cust_idx = 0; cust_idx < bank.getNumofCustomer(); cust_idx++){
			customer = bank.getCustomer(cust_idx);
			
			System.out.println();
			System.out.println("Customer:"
					+ customer.getLastName() + ","
					+ customer.getFirstName());
		
			for( int acct_idx = 0; acct_idx< customer.getNumberOfAccount(); acct_idx++){
				Account account = customer.getAccount(acct_idx);
				String account_type = "";
				if(account instanceof SavingAccount){
					account_type = "SavingAccount";
				}
				if(account instanceof CheckingAccount){
					account_type = "CheckingAccount";
				}
				System.out.println(account_type + "current balance is" + account.getbalance());
			}
			
	}
}
}
