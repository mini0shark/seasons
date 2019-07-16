package CMJ.특강_190711;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ATM {
	private Queue<Client> clients;

	public ATM() {
		clients = new LinkedList<Client>();
	}

	public void exec() throws MyException {
		Scanner cs = new Scanner(System.in);
		int number = -1;
		do {
			printScreen();
			while (true) {
				try {
					number = cs.nextInt();
					if ((number >= 0 && number <= 8))
						break;
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					if (!(number >= 0 && number <= 8))
						System.out.println("잘못 눌렀습니다. 번호를 확인하고 눌러 주세요");
				}
			}
			Client c = clients.peek();
			int account;
			int money;
			if (number != 0 && number < 6 && clients.isEmpty())
				number = 7;
			switch (number) {
			case 1:
				System.out.println("어떤 계좌에 입금하시겠습니까? : ");
				c.printBankBookInfo();
				account = cs.nextInt();
				System.out.println("금액을 넣어주세요 : ");
				money = cs.nextInt();
				c.pushDepositMoneyButton(account, money);
				break;
			case 2:
				System.out.println("어떤 계좌에서 출금하시겠습니까? : ");
				c.printBankBookInfo();
				account = cs.nextInt();
				System.out.println("얼마나 출금하시겠습니까? : ");
				money = cs.nextInt();
				c.pushWithDrawMoneyButton(account, money);
				break;
			case 3:
				c.pushCheckButton();
				break;
			case 4:
				System.out.println("초기 자본금을 입금해주세요(0원을 입금해도 괜찮습니다.)");
				c.makeBankBook(c.getClientName(), cs.nextInt());
				break;
			case 5:
				// 내역조회
				break;
			case 6:
				getClient();
				break;
			case 7:
				finishTask();
				break;
			case 8:
				// 대기손님 프린트
				for (Client c1 : clients) {
					System.out.println(c1.getClientName());
				}
			}
		} while (number != 0);
		System.out.println("ATM 기계가 종료되었습니다.");

	}

	public void printScreen() {
		System.out.println("==============================================");
		System.out.println("===============     메            뉴     ================");
		System.out.println("==                  0. 종  료  하 기                              ==");
		System.out.println("==                  1. 압  금  하  기                              ==");
		System.out.println("==                  2. 출  금  하  기                              ==");
		System.out.println("==                  3. 조  회  하  기                              ==");
		System.out.println("==                  4. 통  장  추  가                              ==");
		System.out.println("==                  5. 내  역  조  회                              ==");
		System.out.println("==                  6. 손  님  추  가                              ==");
		System.out.println("==                  7. 업  무  종  료                              ==");
		System.out.println("==============================================");
		System.out.println("입력 : ");
	}

	public void getClient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력 하세요");
		String name = sc.nextLine();
		Client newClient;
		newClient = new Client(name);
		clients.add(newClient);
	}

	public void finishTask() {
		try {
			clients.peek().saveClientInfomation();
			System.out.println(clients.poll().getClientName() + " 고객님 업무 완료");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("고객이 없습니다.");
		}
	}
}