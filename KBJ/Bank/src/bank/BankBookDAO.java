package bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BankBookDAO {
	static private int currentAccountNumber = -1;
	private BankBook bankbook;
	//	private ArrayList<String> record;

	//���� ����
	public BankBookDAO(String owner, int valance) {
		
		if(currentAccountNumber == -1) {
		try(BufferedReader numb = new BufferedReader(new FileReader("accountNumber.txt"))) {
			currentAccountNumber = Integer.parseInt(numb.readLine());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		bankbook = new BankBook(owner, valance, ++currentAccountNumber);
	}
	public BankBookDAO(int id) {
		//file���� BankBook�� �ҷ��� account�� �ֱ�;
		bankbook = new BankBook(null, 0, id);
		getSavedInfomation();
	}
	public BankBook getBankBook() {
		return bankbook;
	}

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

class MyException extends Exception{
	public MyException() {
		super("�ܾ��� �����մϴ�.");
	}
	public MyException(int money, int change) {
		super("���忡 "+money+"���� �����ϴ�. \n���� �ܾ��� "+change+"���Դϴ�. �ٽ� �õ� �ϼ���");
	}
}
