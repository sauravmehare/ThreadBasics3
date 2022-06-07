
public class Account {
	
	private static Integer balance;
	
	public Account (Integer balance){
		this.balance = balance;
	}
	
	public boolean check (Integer amount) {
		if (amount<= this.balance) {
			return true;
		}else {
			return false;
		}
	}
	
	public Integer deduct (Integer amount) {
		balance=balance-amount;
		return balance;
	}

}
