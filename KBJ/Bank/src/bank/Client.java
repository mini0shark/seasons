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
	//�ϳ��� ������ ������ ����ϴ� ����
	public Client(int id, String name){
		//���Ͽ��� ����� �о�ͼ� bankBook�ε������� �ֱ�
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



	//������ �����.
	public void makeBankBook(String name, int startMoney) {
		BankBookDAO newBook = new BankBookDAO(name, startMoney, c.getId());
		c.addBankBookToArray(newBook);
	}
	//��ݹ�ư
	public void pushWithDrawMoneyButton(int accountNumber, int money) throws MyException {
		BankBook bbDAO = new BankBook(accountNumber);
		if(isBankBook(accountNumber)) {
			bbDAO.withDrawMoney(money);
		}
	}
	//�Աݹ�ư
	public void pushDepositMoneyButton(int accountNumber, int money) {
		BankBook bbDAO = new BankBook(accountNumber);
		if(isBankBook(accountNumber)) {
			bbDAO.depositMoney(money);
		}
	}
	//��ȸ��ư
	public void pushCheckButton() {
		BankBook bbDAO = null;
		for(BankBookDAO b : c.getBankBooks()) {
			bbDAO = new BankBook(b.getAccountNumber());
			bbDAO.printValance();
		}
	}
	//Ư������ ��ȸ
	public void pushCheckButton(int accountNumber) {
		BankBook bbDAO = null;
		if(isBankBook(accountNumber)) {
			bbDAO = new BankBook(accountNumber);
			bbDAO.printValance();
		}
	}
	//������ ���� ��ȸ
	public void printBankBookInfo() {
		System.out.println("���¹�ȣ\t�ܾ�");
		for(BankBookDAO b : c.getBankBooks()) {
			System.out.println(b.getAccountNumber()+"\t"+b.getValance());
		}
	}

	public boolean isBankBook(int accountNumber) {
		//���� ���� ���
		if(!c.getBankBooks().isEmpty())
			return true;
		System.out.println("���� ������ ���°� �������� �ʽ��ϴ�.");
		return false;
	}


	public void saveClientInfomation() {
		try(PrintWriter fo = new PrintWriter("client_"+getClientName()+"_info.txt")) {
			fo.print(c.getName()+"\n");
			for(BankBookDAO b : c.getBankBooks())
				fo.print(b.getAccountNumber()+"\n");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���������� �������� ���߽��ϴ�.");
		} 

		for(BankBookDAO b: c.getBankBooks()) {
			BankBook bbDAO = new BankBook(b.getAccountNumber());
			bbDAO.saveBookInfomation();
		}
	}
	public boolean getSavedInfomation(String id) {
	}
}
