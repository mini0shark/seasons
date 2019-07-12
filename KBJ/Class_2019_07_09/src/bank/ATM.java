package bank;

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
		int number =-1;
		do{
			printScreen();
			while(true) {
				try {
					number = cs.nextInt();	
					if((number>=0 && number<=8))
						break;				
				} catch (Exception e) {
					// TODO: handle exception
				}
				finally {
					if(!(number>=0 && number<=8))
					System.out.println("�߸� �������ϴ�. ��ȣ�� Ȯ���ϰ� ���� �ּ���");
				}
			}
			Client c = clients.peek();
			int account;
			int money;
			if(number!=0 && number<6 && clients.isEmpty()) 
				number = 7;
			switch(number) {
			case 1:
				System.out.println("� ���¿� �Ա��Ͻðڽ��ϱ�? : ");
				c.printBankBookInfo();
				account = cs.nextInt();
				System.out.println("�ݾ��� �־��ּ��� : ");
				money = cs. nextInt();
				c.pushDepositMoneyButton(account, money);
				break;
			case 2:
				System.out.println("� ���¿��� ����Ͻðڽ��ϱ�? : ");
				c.printBankBookInfo();
				account = cs.nextInt();
				System.out.println("�󸶳� ����Ͻðڽ��ϱ�? : ");
				money = cs. nextInt();
				c.pushWithDrawMoneyButton(account, money);
				break;
			case 3:
				c.pushCheckButton();
				break;
			case 4:
				System.out.println("�ʱ� �ں����� �Ա����ּ���(0���� �Ա��ص� �������ϴ�.)");
				c.makeBankBook(c.getClientName(), cs.nextInt());
				break;
			case 5:
				//������ȸ
				break;
			case 6:
				getClient();
				break;
			case 7:
				finishTask();
				break;
			case 8:
				//���մ� ����Ʈ
				for(Client c1 : clients) {
					System.out.println(c1.getClientName());
				}
			}
		}while(number!=0);
		System.out.println("ATM ��谡 ����Ǿ����ϴ�.");

	}
	public void printScreen() {
		System.out.println("==============================================");
		System.out.println("===============     ��            ��     ================");
		System.out.println("==                  0. ��  ��  �� ��                              ==");
		System.out.println("==                  1. ��  ��  ��  ��                              ==");
		System.out.println("==                  2. ��  ��  ��  ��                              ==");
		System.out.println("==                  3. ��  ȸ  ��  ��                              ==");
		System.out.println("==                  4. ��  ��  ��  ��                              ==");
		System.out.println("==                  5. ��  ��  ��  ȸ                              ==");
		System.out.println("==                  6. ��  ��  ��  ��                              ==");
		System.out.println("==                  7. ��  ��  ��  ��                              ==");
		System.out.println("==                  8. ��  ��  ��  ��                              ==");
		System.out.println("==============================================");
		System.out.println("�Է� : ");
	}
	public void getClient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է� �ϼ���");
		String name =sc.nextLine();
		Client newClient;
		newClient = new Client(name);
		clients.add(newClient);
	}
	public void finishTask() {
		try {
			clients.peek().saveClientInfomation();	
			System.out.println(clients.poll().getClientName()+" ���� ���� �Ϸ�");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� �����ϴ�.");
		}
	}
}