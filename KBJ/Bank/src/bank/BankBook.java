package bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BankBook {
	private int accountNumber;
	private int valance;
	private String password;
	private int clientNumber;
	private String clientName;
	//	private ArrayList<String> record;

	public BankBook(int accountNumber, int valance, String password, int clientNumber, String clientName) {
		this.accountNumber = accountNumber;
		this.valance = valance;
		this.password = password;
		this.clientNumber = clientNumber;
		this.clientName = clientName;
	}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public String getOwner() {return clientName;}
	public int getClientNumber() {return clientNumber;}
	public void setClientNumber(int clientNumber) {this.clientNumber = clientNumber;}
	public String getClientName() {return clientName;}
	public void setClientName(String clientName) {this.clientName = clientName;}
	public void setOwner(String clientName) {this.clientName = clientName;}
	public int getValance() {return valance;}
	public void setValance(int valance) {this.valance = valance;}
	public int getAccountNumber() {return accountNumber;}
	public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}
	
	
	public void depositMoney(int money) {	
	}
	public void withDrawMoney(int money){	
	}
	public void sendMoney(String fromId, String toId, int money) {
	}
	public void printValance() {
	}
}
