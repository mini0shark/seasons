package CMJ.특강_190711;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Client {
	// static private int AllClientNumbers=1;
	private String name;
	// private int clientNumber;
	private ArrayList<BankBook> bankBooks;

	// 하나의 통장을 가지고 등록하는 경유
	public Client(String name) {
		// 파일에서 고객목록 읽어와서 bankBook인덱스별로 넣기
		this();
		// clientNumber = AllClientNumbers++;
		this.name = name;
		if (!getSavedInfomation()) {
			BankBook bb = new BankBook(name, 0);
			System.out.println("계좌 번호는 " + bb.getAccountNumber() + " 입니다.");
			bankBooks.add(bb);
		}
		// if(isNameInInfomation) 이름, BankBook을 초기화
	}

	public Client() {
		bankBooks = new ArrayList<BankBook>();
	}

	// 고객의 이름을 얻는다.
	public String getClientName() {
		return name;
	}

	// 통장을 만든다.
	public void makeBankBook(String name, int startMoney) {
		BankBook newBook = new BankBook(name, startMoney);
		bankBooks.add(newBook);
	}

	// 출금버튼
	public void pushWithDrawMoneyButton(int accountNumber, int money) throws MyException {
		int index = getBankBook(accountNumber);
		if (index != -1) {
			bankBooks.get(index).withDrawMoney(money);
		}
	}

	// 입금버튼
	public void pushDepositMoneyButton(int accountNumber, int money) {
		int index = getBankBook(accountNumber);
		if (index != -1) {
			bankBooks.get(index).depositMoney(money);
		}
	}

	// 조회버튼
	public void pushCheckButton() {
		for (BankBook b : bankBooks) {
			b.printValance();
		}
	}

	// 특정계좌 조회
	public void pushCheckButton(int accountNumber) {
		int index = getBankBook(accountNumber);
		if (index != -1) {
			bankBooks.get(index).printValance();
		}
	}

	// 소지한 계좌 조회
	public void printBankBookInfo() {
		System.out.println("계좌번호\t잔액");
		for (BankBook b : bankBooks) {
			System.out.println(b.getAccountNumber() + "\t" + b.getMoneyAmount());
		}
	}

	public int getBankBook(int accountNumber) {
		int index;
		for (int i = 0; i < bankBooks.size(); i++) {
			index = bankBooks.get(i).getAccountNumber();
			if (index == accountNumber)
				return index;
		}
		System.out.println("고객님 명의의 계좌가 존재하지 않습니다.");
		return -1;
	}

	public void saveClientInfomation() throws Exception {
		DBUtil.getConnection();
		try (PrintWriter fo = new PrintWriter("client_" + getClientName() + "_info.txt")) {
			fo.print(name + "\n");
			for (BankBook b : bankBooks)
				fo.print(b.getAccountNumber() + "\n");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("정상적으로 저장하지 못했습니다.");
		}
		
		for (BankBook b : bankBooks) {
			b.saveBookInfomation();
		}
	}

	public boolean getSavedInfomation() {
		String fileName = "client_" + getClientName() + "_info.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String str = null;
			name = br.readLine();
			int accountNumber;
			while ((str = br.readLine()) != null) {
				try {
					accountNumber = Integer.parseInt(str);
					BankBook b = new BankBook(accountNumber);
					bankBooks.add(b);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(fileName + " 파일에 문제가 있습니다.");
				}
			}
			System.out.println("환영합니다!\t\"" + getClientName() + "\"고객님");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("고객님 명의가 등록되지 않아 통장을 신규로 개설 했습니다.");
			return false;
		}
	}
}