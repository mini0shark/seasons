package CMJ.특강_190704;

public class Bank {
	private String name;
	private int accountNo;
	private int money;
	
	public Bank(int accountNo, String name, int money) {
		this.accountNo = accountNo;
		this.name = name;
		this.money = money;
	} // Bank(int money) 생성자
	
	public void deposit(int money) { // 입금
		this.money += money;
		
		System.out.println("Deposit Success! Balance: " + this.money);
	}
	
	public void withdraw(int money) throws BankException { // 출금
		if(this.money < money)
			throw new BankException();
		System.out.println("Withdraw Success! Balance: " + this.money);
	}
	
	public int getMoney() { // 잔액조회
		return this.money;
	}
}