
public class Bank {
 
	 String name;//통장주인 이름
	int account;//계좌번호
	int date;//통장 만든날짜
	 int balance=0;//잔액
	
	Bank(String name,int account,int date,int balance){
		this.name=name;
		this.account=account;
		this.date=date;
		this.balance=balance;
	}
	
	
	public void GetMoney(int balance) {//입금
		
		 this.balance+=balance;
		 
			System.out.println("입금후 잔액은: "+this.balance+"입니다.");
	 	
	}
	
	
	public void looseMoney(int balance) throws Exception{//출금
		if(balance<0)
		throw new Exception();
		
		else if(this.balance<balance)
			throw new Exception();
		
		
		else  this.balance-=balance;
		
		
		System.out.println("출금후 잔액은: "+this.balance+"입니다.");
	}


	
}
