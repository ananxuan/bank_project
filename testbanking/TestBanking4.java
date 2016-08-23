package testbanking;
import banking4.*;
public class TestBanking4 {
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.addCustomer("Jane", "Simms");
		bank.addCustomer("Tim", "Soley");
		bank.addCustomer("Maria", "Soley");
		for(int i = 0; i<bank.getNumofCustomer(); i++){
			Customer customer = bank.getCustomer(i);
			
			System.out.println("Customer "+ (i+1) + "is" + customer.getLastName() + customer.getFirstName());
		}
	}
}
