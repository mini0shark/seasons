package bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BankBook {
	private String owner;
	private int clientId;
	private int valance;
	private int accountNumber;
	//	private ArrayList<String> record;

	//�ű� ���� ����
	public BankBook() {
				
	}
	public BankBook(int accountNumber) {
		//file���� BankBook�� �ҷ��� account�� �ֱ�;
		this.accountNumber = accountNumber;
		getSavedInfomation();
	}


	public int getClientId() {return clientId;}
	public void setClientId(int clientId) {this.clientId = clientId;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getValance() {return valance;}
	public void setValance(int valance) {this.valance = valance;}
	public int getAccountNumber() {return accountNumber;}
	public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}
	
	
	public void depositMoney(int money) {
		bankbook.setValance(bankbook.getValance());
		System.out.println(money+"���� �Ա� �Ǿ����ϴ�.");
		printValance();
	}
	public void withDrawMoney(int money) throws MyException{
		if(bankbook.getValance()<money) {
			throw new MyException(money, bankbook.getValance());
		}else {
			bankbook.setValance(bankbook.getValance()-money);
			System.out.println(money+"���� ����߽��ϴ�.");
			printValance();
		}
	}
	public void printValance() {
		System.out.println("���� "+bankbook.getAccountNumber()+"�� ������ �ܾ��� "+bankbook.getValance()+"�� �Դϴ�.");
	}
	public void saveBookInfomation() {
		try(PrintWriter ff = new PrintWriter("accountNumber.txt")){
			String tempNumber = bankbook.getValance()+"";
			ff.write(tempNumber);
		}catch (Exception e) {
			// TODO: handle exception
		}
		try(PrintWriter fo = new PrintWriter("bankBook_"+bankbook.getAccountNumber()+"_info.txt")) {
			fo.print(bankbook.getAccountNumber()+"\n");
			fo.print(bankbook.getValance()+"\n");
			fo.print(bankbook.getOwner()+"\n");
			//			for(String st : record)
			//				fo.print(st);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���������� �������� ���߽��ϴ�.");
		} 
	}
	public void getSavedInfomation() {
		System.out.println(bankbook.getAccountNumber());
		String fileName = "bankBook_"+bankbook.getAccountNumber()+"_info.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String  str=null;
			try {
				bankbook.setValance(Integer.parseInt(br.readLine()));
				bankbook.setOwner(br.readLine());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(fileName+" ���Ͽ� ������ �ֽ��ϴ�.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� ������ ������ �����ϴ�.");
		}		
	}
}
