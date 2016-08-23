package banking3;

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
	public boolean deposit(double amt){
		balance += amt;
		return true;
	}
	//取钱，amt要取得额度
	public boolean withdraw(double amt){
		if (balance >= amt){
		balance -= amt;
		return true;
		}else{
			System.out.println("余额不足");
			return false;
		}
	}
}
