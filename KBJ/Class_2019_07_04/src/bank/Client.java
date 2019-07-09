package bank;

public class Client {
	private String name;
	private int accountNumber;
	
	public Client(String name, int accountNumber){
		this.name= name;
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
}
