package banking2;

public class Account {
	private double balance;
	//constructor
	public Account(double init_balance){
		balance = init_balance;
	}
	//get 余额
	public double getbalance(){
		return balance;
	}
	//存钱
	public void deposit(double amt){
		balance += amt;
	}
	//取钱，amt要取得额度
	public void withdraw(double amt){
		if (balance >= amt){
		balance -= amt;
		}else{
			System.out.println("余额不足");
		}
	}
}
