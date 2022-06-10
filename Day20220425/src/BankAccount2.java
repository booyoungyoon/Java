
public class BankAccount2 {
	private int balance;

	int deposit(int amount) {
		balance += amount;
		
		return balance;
	}
	
	int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	int checkBalance() {
		System.out.println("잔액 : " + balance);
		return 0;
	}
}
	class MainClass2{
		public static void main(String[] args) {
			
			BankAccount2[] bank = new BankAccount2[3];
			
			bank[0] = new BankAccount2();	
			bank[1] = new BankAccount2();	
			bank[2] = new BankAccount2();	
			
			bank[0].deposit(10000);
			bank[0].withdraw(3000);
			System.out.println(bank[0].checkBalance());
	}
}