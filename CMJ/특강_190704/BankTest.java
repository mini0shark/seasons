package CMJ.Ư��_190704;

public class BankTest {
	public static void main(String[] args) {
		Bank bankAccount = new Bank(1, "ȫ�浿", 10000);
		
		try {
			bankAccount.deposit(4000);
			bankAccount.withdraw(15000);
		} catch (BankException e) {
			System.out.println(e);
		}
	}
}
