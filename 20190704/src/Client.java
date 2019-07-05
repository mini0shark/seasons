
public class Client {
    public static void main(String args[]) throws Exception {
	  Bank b=new Bank("김지수",3521148,20190704,10000);
	  
	  
	  b.GetMoney(10000);
	  
	  
	  try {
	  b.looseMoney(30000);		  
      
    
	 }catch(Exception e) {
		 System.out.println("출금액은 잔액을 못넘어요.");}
	  
	  
	  
	  
	
	 }
	  
		 
	  
  
     


}
