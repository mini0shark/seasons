package bank;

import java.util.ArrayList;

public class Client {
	private String id;//auto inc
	private String name;
	private ArrayList<BankBook> bankBooks;
	public Client(String id, String name) {
		this.id = id;
		this.name = name;
		this.bankBooks = new ArrayList<BankBook>();
	}
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public ArrayList<BankBook> getBankBooks() {return bankBooks;}
	public void setBankBooks(ArrayList<BankBook> bankBooks) {this.bankBooks = bankBooks;}
	
	public void addBankBookToArray(BankBook bankBook) {bankBooks.add(bankBook);}
	
	public BankBook getBankBook(int accountNumber) {
		BankBook result = null;
		for(BankBook b: bankBooks)
			if(b.getAccountNumber() == accountNumber)
				result = b;
		return result;
	}
}
