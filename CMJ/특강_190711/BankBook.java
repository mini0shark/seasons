package CMJ.특강_190711;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BankBook {
	static private int currentAccountNumber = -1; // 계좌 개수
	private int money; // 잔액
	private String owner; // 소유주
	private int accountNumber; // 계좌번호
	// private ArrayList<String> record;

	public BankBook(String owner, int money) {
		if (currentAccountNumber == -1) {
			try (BufferedReader numb = new BufferedReader(new FileReader("accountNumber.txt"))) {
				currentAccountNumber = Integer.parseInt(numb.readLine());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		this.money = money;
		this.owner = owner;
		this.accountNumber = ++currentAccountNumber;
	}

	public BankBook(int accountNumber) {
		// file에서 BankBook들 불러와 account에 넣기;
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
		this.money += money;
		System.out.println(money + "원이 입금 되었습니다.");
		printValance();
	} // 입금 후 출력

	public void withDrawMoney(int money) throws MyException {
		if (this.money < money) {
			throw new MyException(money, this.money);
		} else {
			this.money -= money;
			System.out.println(money + "원을 출금했습니다.");
			printValance();
		}
	}

	public void printValance() {
		System.out.println("현재 " + accountNumber + "번 계좌의 잔액은 " + money + "원 입니다.");
	}

	public void saveBookInfomation() {
		try (PrintWriter ff = new PrintWriter("accountNumber.txt")) {
			String tempNumber = accountNumber + "";
			ff.write(tempNumber);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try (PrintWriter fo = new PrintWriter("bankBook_" + getAccountNumber() + "_info.txt")) {
			fo.print(accountNumber + "\n");
			fo.print(money + "\n");
			fo.print(owner + "\n");
			// for(String st : record)
			// fo.print(st);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("정상적으로 저장하지 못했습니다.");
		}
	}

	public void getSavedInfomation() {
		System.out.println(getAccountNumber());
		String fileName = "bankBook_" + getAccountNumber() + "_info.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String str = null;
			try {
				accountNumber = Integer.parseInt(br.readLine());
				money = Integer.parseInt(br.readLine());
				owner = br.readLine();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(fileName + " 파일에 문제가 있습니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("고객님 명의의 통장이 없습니다.");
		}
	}
}

class MyException extends Exception {
	public MyException() {
		super("잔액이 부족합니다.");
	}

	public MyException(int money, int change) {
		super("통장에 " + money + "원이 없습니다. \n현재 잔액은 " + change + "원입니다. 다시 시도 하세요");
	}
}