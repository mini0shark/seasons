package bank;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;

public class ClientDAO {
	//하나의 통장을 가지고 등록하는 경유
	Client c = null; 
	public ClientDAO(String id, String name){
		//파일에서 고객목록 읽어와서 bankBook인덱스별로 넣기
//		clientNumber = AllClientNumbers++;
		c = new Client(id, name);
		if(!getSavedInfomation()) {
			//
			BankBook bb = new BankBook(name, 0, c.getId());
			System.out.println("계좌 번호는 "+bb.getAccountNumber()+" 입니다.");
			c.addBankBookToArray(bb);
		}
//		if(isNameInInfomation) 이름, BankBook을 초기화
		//저장된아이디 값으로 바꾸기
	}
	public ClientDAO(String isNew) {
		//신규 입력
		String name=null;
		String id = null;
		c = new Client(id,name);
	}
	

	//고객의 이름을 얻는다.
	public String getClientName() {
		return c.getName();
	}

	//통장을 만든다.
	public void makeBankBook(String name, int startMoney) {
		BankBook newBook = new BankBook(name, startMoney, c.getId());
		c.addBankBookToArray(newBook);
	}
	//출금버튼
	public void pushWithDrawMoneyButton(int accountNumber, int money) throws MyException {
		BankBookDAO bbDAO = new BankBookDAO(accountNumber);
		if(isBankBook(accountNumber)) {
			bbDAO.withDrawMoney(money);
		}
	}
	//입금버튼
	public void pushDepositMoneyButton(int accountNumber, int money) {
		BankBookDAO bbDAO = new BankBookDAO(accountNumber);
		if(isBankBook(accountNumber)) {
			bbDAO.depositMoney(money);
		}
	}
	//조회버튼
	public void pushCheckButton() {
		BankBookDAO bbDAO = null;
		for(BankBook b : c.getBankBooks()) {
			bbDAO = new BankBookDAO(b.getAccountNumber());
			bbDAO.printValance();
		}
	}
	//특정계좌 조회
	public void pushCheckButton(int accountNumber) {
		BankBookDAO bbDAO = null;
		if(isBankBook(accountNumber)) {
			bbDAO = new BankBookDAO(accountNumber);
			bbDAO.printValance();
		}
	}
	//소지한 계좌 조회
	public void printBankBookInfo() {
		System.out.println("계좌번호\t잔액");
		for(BankBook b : c.getBankBooks()) {
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
			for(BankBook b : c.getBankBooks())
				fo.print(b.getAccountNumber()+"\n");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("정상적으로 저장하지 못했습니다.");
		} 
		
		for(BankBook b: c.getBankBooks()) {
			BankBookDAO bbDAO = new BankBookDAO(b.getAccountNumber());
			bbDAO.saveBookInfomation();
		}
	}
	public boolean getSavedInfomation() {
		Connection conn = null;
		try{
			conn = new Con
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("고객님 명의가 등록되지 않아 통장을 신규로 개설 했습니다.");
			return false;
		}
	}
}
