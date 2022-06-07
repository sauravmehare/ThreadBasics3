
public class Customer implements Runnable {
	
	private String name;
	private Account account;
	private Integer ammount;
	
	public Customer(String name, Account account, Integer ammount) {
		super();
		this.name = name;
		this.account = account;
		this.ammount = ammount;
	}
	
	public void run() {
		//Here we are applying synchronized bcz at if conditions both of the may pass the condition this might create an issue
		//if we do not follow given approach data might be corrupt i.e. "amount will go to negative" or "both of the amount deduct from 1000 and gives the result"
		synchronized(account) {
			if (account.check(ammount)) {
				System.out.println(name + " reamaining amount "+account.deduct(ammount));
			}else {
				System.out.println("Not Sufficient Balance");
			}
		}
	}
	
	

}
