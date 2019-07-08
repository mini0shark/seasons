package CMJ.특강_190704;

public class BankTest {
	public static void main(String[] args) {
		Bank bankAccount = new Bank(1, "홍길동", 10000);
		
		try {
			bankAccount.deposit(4000);
			bankAccount.withdraw(15000);
		} catch (BankException e) {
			System.out.println(e);
		}
	}
}