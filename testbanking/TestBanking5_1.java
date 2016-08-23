package testbanking;
import banking5_1.*;

public class TestBanking5_1 {
	public static void main(String[] args){
//		NumberFormat currency_format = NumberFormat.getCurrecyInstance();
		Bank bank = new Bank();
		Customer customer;
		
		bank.addCustomer("jane", "smith");
		customer = bank.getCustomer(0);
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer("owen", "bryant");
		customer = bank.getCustomer(1);
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer("tim", "soley");
		customer = bank.getCustomer(2);
		customer.addAccount(new SavingAccount(1500.00, 0.05));
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer("maria", "soley");
		customer = bank.getCustomer(3);
		customer.addAccount(bank.getCustomer(2).getAccount(1));
		customer.addAccount(new SavingAccount(150.00, 0.05));
		
		// generate cutomer report
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
