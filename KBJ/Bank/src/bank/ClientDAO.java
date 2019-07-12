package bank;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;

public class ClientDAO {
	//�ϳ��� ������ ������ ����ϴ� ����
	Client c = null; 
	public ClientDAO(String id, String name){
		//���Ͽ��� ����� �о�ͼ� bankBook�ε������� �ֱ�
//		clientNumber = AllClientNumbers++;
		c = new Client(id, name);
		if(!getSavedInfomation()) {
			//
			BankBook bb = new BankBook(name, 0, c.getId());
			System.out.println("���� ��ȣ�� "+bb.getAccountNumber()+" �Դϴ�.");
			c.addBankBookToArray(bb);
		}
//		if(isNameInInfomation) �̸�, BankBook�� �ʱ�ȭ
		//����Ⱦ��̵� ������ �ٲٱ�
	}
	public ClientDAO(String isNew) {
		//�ű� �Է�
		String name=null;
		String id = null;
		c = new Client(id,name);
	}
	

	//���� �̸��� ��´�.
	public String getClientName() {
		return c.getName();
	}

	//������ �����.
	public void makeBankBook(String name, int startMoney) {
		BankBook newBook = new BankBook(name, startMoney, c.getId());
		c.addBankBookToArray(newBook);
	}
	//��ݹ�ư
	public void pushWithDrawMoneyButton(int accountNumber, int money) throws MyException {
		BankBookDAO bbDAO = new BankBookDAO(accountNumber);
		if(isBankBook(accountNumber)) {
			bbDAO.withDrawMoney(money);
		}
	}
	//�Աݹ�ư
	public void pushDepositMoneyButton(int accountNumber, int money) {
		BankBookDAO bbDAO = new BankBookDAO(accountNumber);
		if(isBankBook(accountNumber)) {
			bbDAO.depositMoney(money);
		}
	}
	//��ȸ��ư
	public void pushCheckButton() {
		BankBookDAO bbDAO = null;
		for(BankBook b : c.getBankBooks()) {
			bbDAO = new BankBookDAO(b.getAccountNumber());
			bbDAO.printValance();
		}
	}
	//Ư������ ��ȸ
	public void pushCheckButton(int accountNumber) {
		BankBookDAO bbDAO = null;
		if(isBankBook(accountNumber)) {
			bbDAO = new BankBookDAO(accountNumber);
			bbDAO.printValance();
		}
	}
	//������ ���� ��ȸ
	public void printBankBookInfo() {
		System.out.println("���¹�ȣ\t�ܾ�");
		for(BankBook b : c.getBankBooks()) {
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
			for(BankBook b : c.getBankBooks())
				fo.print(b.getAccountNumber()+"\n");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���������� �������� ���߽��ϴ�.");
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
			System.out.println("���� ���ǰ� ��ϵ��� �ʾ� ������ �űԷ� ���� �߽��ϴ�.");
			return false;
		}
	}
}
