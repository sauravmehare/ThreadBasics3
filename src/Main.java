
public class Main {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1000);
		
		Customer ram = new Customer("Ram", acc1, 900);
		Customer shyam = new Customer("Shyam", acc1, 700);
		
		Thread ramThread = new Thread(ram);
		Thread shyamThread = new Thread(shyam);
		
		ramThread.start();
		shyamThread.start();
		
		

	}

}
