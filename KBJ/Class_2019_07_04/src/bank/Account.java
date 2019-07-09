package bank;

public class Account {
	static int accountNumber =0;
	final int accountId;
	private int change;
	public Account(){
		accountId=accountNumber++;
		change = 0;
	}
	
	public Account(int change) {
		this();
		this.change=change;
	}
	
	public void depositMoney(int money) {
		change+=money;
	}
	public void withdrawMoney(int money) throws MyException{
		//exception
		if(change< money) {
			throw new MyException(money, change);
		}else {
			change-=money;
		}
	}
	public void checkAccount() {
		System.out.println(accountId+"�� ������ ���� �ܾ��� "+change+"�� �Դϴ�.");
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

