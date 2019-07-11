package bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BankBook {
	static private int currentAccountNumber = -1;
	private int money;
	private String owner;
	private int accountNumber;
	//	private ArrayList<String> record;

	public BankBook(String owner, int money) {
		if(currentAccountNumber == -1) {
		try(BufferedReader numb = new BufferedReader(new FileReader("accountNumber.txt"))) {
			currentAccountNumber = Integer.parseInt(numb.readLine());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		this.money = money;
		this.owner = owner;
		this.accountNumber= ++currentAccountNumber;
	}
	public BankBook(int accountNumber) {
		//file���� BankBook�� �ҷ��� account�� �ֱ�;
		this.accountNumber = accountNumber;
		getSavedInfomation();
	}
	public String getOwnerName() {
		return this.owner;
	}
	public int getMoneyAmount() {
		return money;
	}
	public int getAccountNumber() {
		return accountNumber;
	}


	public void depositMoney(int money) {
		this.money+=money;
		System.out.println(money+"���� �Ա� �Ǿ����ϴ�.");
		printValance();
	}
	public void withDrawMoney(int money) throws MyException{
		if(this.money<money) {
			throw new MyException(money, this.money);
		}else {
			this.money -=money;
			System.out.println(money+"���� ����߽��ϴ�.");
			printValance();
		}
	}
	public void printValance() {
		System.out.println("���� "+accountNumber+"�� ������ �ܾ��� "+money+"�� �Դϴ�.");
	}
	public void saveBookInfomation() {
		try(PrintWriter ff = new PrintWriter("accountNumber.txt")){
			String tempNumber = accountNumber+"";
			ff.write(tempNumber);
		}catch (Exception e) {
			// TODO: handle exception
		}
		try(PrintWriter fo = new PrintWriter("bankBook_"+getAccountNumber()+"_info.txt")) {
			fo.print(accountNumber+"\n");
			fo.print(money+"\n");
			fo.print(owner+"\n");
			//			for(String st : record)
			//				fo.print(st);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���������� �������� ���߽��ϴ�.");
		} 
	}
	public void getSavedInfomation() {
		System.out.println(getAccountNumber());
		String fileName = "bankBook_"+getAccountNumber()+"_info.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String  str=null;
			try {
				accountNumber = Integer.parseInt(br.readLine());
				money = Integer.parseInt(br.readLine());
				owner = br.readLine();
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

class MyException extends Exception{
	public MyException() {
		super("�ܾ��� �����մϴ�.");
	}
	public MyException(int money, int change) {
		super("���忡 "+money+"���� �����ϴ�. \n���� �ܾ��� "+change+"���Դϴ�. �ٽ� �õ� �ϼ���");
	}
}
