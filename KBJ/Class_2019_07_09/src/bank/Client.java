package bank;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Client {
//	static private int AllClientNumbers=1;
	private String name;
//	private int clientNumber;
	private ArrayList<BankBook> bankBooks;
	//�ϳ��� ������ ������ ����ϴ� ����
	public Client(String name){
		//���Ͽ��� ����� �о�ͼ� bankBook�ε������� �ֱ�
		this();
//		clientNumber = AllClientNumbers++;
		this.name =name;
		if(!getSavedInfomation()) {
			BankBook bb = new BankBook(name, 0);
			System.out.println("���� ��ȣ�� "+bb.getAccountNumber()+" �Դϴ�.");
			bankBooks.add(bb);
		}
//		if(isNameInInfomation) �̸�, BankBook�� �ʱ�ȭ
	}
	public Client(){
		bankBooks = new ArrayList<BankBook>();
	}

	//���� �̸��� ��´�.
	public String getClientName() {
		return name;
	}

	//������ �����.
	public void makeBankBook(String name, int startMoney) {
		BankBook newBook = new BankBook(name, startMoney);
		bankBooks.add(newBook);
	}
	//��ݹ�ư
	public void pushWithDrawMoneyButton(int accountNumber, int money) throws MyException {
		int index = getBankBook(accountNumber);
		if(index!=-1) {
			bankBooks.get(index).withDrawMoney(money);
		}
	}
	//�Աݹ�ư
	public void pushDepositMoneyButton(int accountNumber, int money) {
		int index = getBankBook(accountNumber);
		if(index!=-1) {
			bankBooks.get(index).depositMoney(money);
		}
	}
	//��ȸ��ư
	public void pushCheckButton() {
		for(BankBook b : bankBooks) {
			b.printValance();
		}
	}
	//Ư������ ��ȸ
	public void pushCheckButton(int accountNumber) {
		int index = getBankBook(accountNumber);
		if(index !=-1) {
			bankBooks.get(index).printValance();
		}
	}
	//������ ���� ��ȸ
	public void printBankBookInfo() {
		System.out.println("���¹�ȣ\t�ܾ�");
		for(BankBook b : bankBooks) {
			System.out.println(b.getAccountNumber()+"\t"+b.getMoneyAmount());
		}
	}

	public int getBankBook(int accountNumber) {
		int index;
		for(int i =0;i< bankBooks.size(); i++) {
			index = bankBooks.get(i).getAccountNumber();
			if(index==accountNumber)
				return index;
		}
		System.out.println("���� ������ ���°� �������� �ʽ��ϴ�.");
		return -1;
	}
	
	
	public void saveClientInfomation() {
		try(PrintWriter fo = new PrintWriter("client_"+getClientName()+"_info.txt")) {
			fo.print(name+"\n");
			for(BankBook b : bankBooks)
				fo.print(b.getAccountNumber()+"\n");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���������� �������� ���߽��ϴ�.");
		} 
		for(BankBook b :bankBooks) {
			b.saveBookInfomation();
		}
	}
	public boolean getSavedInfomation() {
		String fileName = "client_"+getClientName()+"_info.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String  str=null;
			name = br.readLine();
			int accountNumber;
			while((str=br.readLine()) != null) {
				try {
					accountNumber = Integer.parseInt(str);
					BankBook b = new BankBook(accountNumber);
					bankBooks.add(b);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(fileName+" ���Ͽ� ������ �ֽ��ϴ�.");
				}
			}
			System.out.println("ȯ���մϴ�!\t\""+getClientName()+"\"����");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� ���ǰ� ��ϵ��� �ʾ� ������ �űԷ� ���� �߽��ϴ�.");
			return false;
		}
	}
}
