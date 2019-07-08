package CMJ.특강_190704;

public class BankException extends Exception {
	public BankException() {
		System.out.println("Withdraw Failed! No Money! Poor Man...");
	}
}