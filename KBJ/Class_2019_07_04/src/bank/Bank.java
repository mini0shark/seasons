package bank;

public class Bank {
	public static void main(String[] args) {
		Account a = new Account(3000000);
		for(int i= 0; i<10; i++) {
			try {
				a.withdrawMoney(i*128000);
			}catch(MyException e){
				System.out.println(e);
			}finally {
				a.checkAccount();
			}
		}

		

		Account a2 = new Account(3000000);
		for(int i= 0; i<10; i++) {
			try {
				a2.withdrawMoney(i*554020);
			}catch(MyException e){
				System.out.println(e);
			}finally {
				a2.checkAccount();
			}
		}
		
		
		a.checkAccount();
		a2.checkAccount();
	}
}