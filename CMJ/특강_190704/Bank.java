package CMJ.Ư��_190704;

public class Bank {
	private String name;
	private int accountNo;
	private int money;
	
	public Bank(int accountNo, String name, int money) {
		this.accountNo = accountNo;
		this.name = name;
		this.money = money;
	} // Bank(int money) ������
	
	public void deposit(int money) { // �Ա�
		this.money += money;
		
		System.out.println("Deposit Success! Balance: " + this.money);
	}
	
	public void withdraw(int money) throws BankException { // ���
		if(this.money < money)
			throw new BankException();
		System.out.println("Withdraw Success! Balance: " + this.money);
	}
	
	public int getMoney() { // �ܾ���ȸ
		return this.money;
	}
}
