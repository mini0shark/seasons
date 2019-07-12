package bank;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Client {
	private int id;//auto inc
	private String name;
	private ArrayList<BankBookDAO> bankBooks;
	//하나의 통장을 가지고 등록하는 경유
	public Client(int id, String name){
		//파일에서 고객목록 읽어와서 bankBook인덱스별로 넣기
		//		clientNumber = AllClientNumbers++;
		this.id = id;
		this.name = name;
		BankBook bb = new BankBook();
	}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public ArrayList<BankBookDAO> getBankBooks() {return bankBooks;}
	public void setBankBooks(ArrayList<BankBookDAO> bankBooks) {this.bankBooks = bankBooks;}



	//통장을 만든다.
	public void makeBankBook(String name, int startMoney) {
		BankBookDAO newBook = new BankBookDAO(name, startMoney, c.getId());
		c.addBankBookToArray(newBook);
	}
	//출금버튼
	public void pushWithDrawMoneyButton(int accountNumber, int money) throws MyException {
		BankBook bbDAO = new BankBook(accountNumber);
		if(isBankBook(accountNumber)) {
			bbDAO.withDrawMoney(money);
		}
	}
	//입금버튼
	public void pushDepositMoneyButton(int accountNumber, int money) {
		BankBook bbDAO = new BankBook(accountNumber);
		if(isBankBook(accountNumber)) {
			bbDAO.depositMoney(money);
		}
	}
	//조회버튼
	public void pushCheckButton() {
		BankBook bbDAO = null;
		for(BankBookDAO b : c.getBankBooks()) {
			bbDAO = new BankBook(b.getAccountNumber());
			bbDAO.printValance();
		}
	}
	//특정계좌 조회
	public void pushCheckButton(int accountNumber) {
		BankBook bbDAO = null;
		if(isBankBook(accountNumber)) {
			bbDAO = new BankBook(accountNumber);
			bbDAO.printValance();
		}
	}
	//소지한 계좌 조회
	public void printBankBookInfo() {
		System.out.println("계좌번호\t잔액");
		for(BankBookDAO b : c.getBankBooks()) {
			System.out.println(b.getAccountNumber()+"\t"+b.getValance());
		}
	}

	public boolean isBankBook(int accountNumber) {
		//계좌 갯수 출력
		if(!c.getBankBooks().isEmpty())
			return true;
		System.out.println("고객님 명의의 계좌가 존재하지 않습니다.");
		return false;
	}


	public void saveClientInfomation() {
		try(PrintWriter fo = new PrintWriter("client_"+getClientName()+"_info.txt")) {
			fo.print(c.getName()+"\n");
			for(BankBookDAO b : c.getBankBooks())
				fo.print(b.getAccountNumber()+"\n");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("정상적으로 저장하지 못했습니다.");
		} 

		for(BankBookDAO b: c.getBankBooks()) {
			BankBook bbDAO = new BankBook(b.getAccountNumber());
			bbDAO.saveBookInfomation();
		}
	}
	public boolean getSavedInfomation(String id) {
	}
}
