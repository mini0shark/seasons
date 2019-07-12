package bank;

public class BankBook {
	private String owner;
	private int valance;
	private String accountNumber;
	public BankBook(String owner, int valance, String accountNumber) {
		this.owner = owner;
		this.valance = valance;
		this.accountNumber = accountNumber;
	}
	public int getValance() {return valance;}
	public void setValance(int valance) {this.valance = valance;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public String getAccountNumber() {return accountNumber;}
	public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
}
