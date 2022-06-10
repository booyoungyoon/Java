
public class BankAccount {
	private int balance;

	int deposit(int amount) {
		balance += amount;
		
		return balance;
	}
	
	int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	void checkBalance() {
		System.out.println("잔액 : " + balance);
	}
}
	class MainClass{
		public static void main(String[] args) {
		
			BankAccount kim = new BankAccount();
			kim.deposit(10000);
			kim.checkBalance();
			kim.withdraw(3000);
			kim.checkBalance();

			BankAccount lee = new BankAccount();
			lee.deposit(10000000);
			lee.checkBalance();
			lee.withdraw(3000000);
			lee.checkBalance();
			
			BankAccount park = new BankAccount();
			park.deposit(2000);
			park.checkBalance();
			park.withdraw(1000);
			park.checkBalance();
	}
}