package kr.ac.skuniv.bank.dto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BankBook {
	private int accountNumber;
	private int valance;
	private String password;
	private String clientId;
	//	private ArrayList<String> record;

	public BankBook(int accountNumber, int valance, String password,String clientId) {
		this.accountNumber = accountNumber;
		this.valance = valance;
		this.password = password;
		this.clientId = clientId;
	}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public String getClientId() {return clientId;}
	public void setClientId(String clientId) {this.clientId = clientId;}
	
	public int getValance() {return valance;}
	public void setValance(int valance) {this.valance = valance;}
	public int getAccountNumber() {return accountNumber;}
	@Override
	public String toString() {
		return "BankBook [accountNumber=" + accountNumber + ", valance=" + valance + ", password=" + password
				+ ", clientId=" + clientId + "]";
	}
	
}
