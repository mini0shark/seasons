
public class Bank {
 
	 String name;//�������� �̸�
	int account;//���¹�ȣ
	int date;//���� ���糯¥
	 int balance=0;//�ܾ�
	
	Bank(String name,int account,int date,int balance){
		this.name=name;
		this.account=account;
		this.date=date;
		this.balance=balance;
	}
	
	
	public void GetMoney(int balance) {//�Ա�
		
		 this.balance+=balance;
		 
			System.out.println("�Ա��� �ܾ���: "+this.balance+"�Դϴ�.");
	 	
	}
	
	
	public void looseMoney(int balance) throws Exception{//���
		if(balance<0)
		throw new Exception();
		
		else if(this.balance<balance)
			throw new Exception();
		
		
		else  this.balance-=balance;
		
		
		System.out.println("����� �ܾ���: "+this.balance+"�Դϴ�.");
	}


	
}
