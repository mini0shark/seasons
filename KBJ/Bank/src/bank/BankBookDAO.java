package bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BankBookDAO {
	static private int currentAccountNumber = -1;
	private BankBook bankbook;
	//	private ArrayList<String> record;

	//계좌 개설
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
		//file에서 BankBook들 불러와 account에 넣기;
		bankbook = new BankBook(null, 0, id);
		getSavedInfomation();
	}
	public BankBook getBankBook() {
		return bankbook;
	}

	public void depositMoney(int money) {
		bankbook.setValance(bankbook.getValance());
		System.out.println(money+"원이 입금 되었습니다.");
		printValance();
	}
	public void withDrawMoney(int money) throws MyException{
		if(bankbook.getValance()<money) {
			throw new MyException(money, bankbook.getValance());
		}else {
			bankbook.setValance(bankbook.getValance()-money);
			System.out.println(money+"원을 출금했습니다.");
			printValance();
		}
	}
	public void printValance() {
		System.out.println("현재 "+bankbook.getAccountNumber()+"번 계좌의 잔액은 "+bankbook.getValance()+"원 입니다.");
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
			System.out.println("정상적으로 저장하지 못했습니다.");
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
				System.out.println(fileName+" 파일에 문제가 있습니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("고객님 명의의 통장이 없습니다.");
		}		
	}
}

class MyException extends Exception{
	public MyException() {
		super("잔액이 부족합니다.");
	}
	public MyException(int money, int change) {
		super("통장에 "+money+"원이 없습니다. \n현재 잔액은 "+change+"원입니다. 다시 시도 하세요");
	}
}
