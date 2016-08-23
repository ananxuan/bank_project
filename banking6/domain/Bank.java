package banking6.domain;
//单例模式
public class Bank {
	//用于存放客户
	private Customer[] customers;
	//记录银行客户得个数
	private int numberofCustomer;
	
	private  Bank(){
		customers = new Customer[5];
	}
	private static Bank bank = new Bank();
	public static Bank getBanking(){
		return bank;
	}
	//add customer to 数组中
	public void addCustomer(String f, String l){
		Customer cust = new Customer(f,l);
		customers[numberofCustomer] = cust;
		numberofCustomer++;
		
	}
	public int getNumofCustomer(){
		return numberofCustomer;
	}
	//返回指定索引位置得customer
	public Customer getCustomer(int index){
		return customers[index];
	}
}
