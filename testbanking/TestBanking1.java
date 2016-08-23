package testbanking;
import banking1.*;

public class TestBanking1 {
	public static void main(String[] args){
		Account  account;
		
		//create an account that can has a 500.00 balance.
		account = new Account(500.00);
		System.out.println("create an account that can has a 500.00 balance.");
		
		//code
		account.withdraw(150.00);
		System.out.println("withraw 150.00");
		account.deposit(22.50);
		System.out.println("deposit 22.50");
		account.withdraw(47.62);
		System.out.println("withraw 47.62");
		System.out.println("The account has a balance of" + account.getbalance());
		
		
	}

}
