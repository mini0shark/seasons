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
		System.out.println(accountId+"번 고객님의 현재 잔액은 "+change+"원 입니다.");
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

