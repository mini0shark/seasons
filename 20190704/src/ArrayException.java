
public class ArrayException {
 public static void main(String args[]) {
	 int[] intArray=new int[5];
	 intArray[0]=0;
	 try {
	 for(int i=0;i<5;i++) {
		 intArray[i+1]=i+1+intArray[i];
		 System.out.println("intArray["+i+"]"+"="+intArray[i]);
	 }}catch(Exception e) {
		 System.out.println("예외처리완료");
	 }
	 }
 
}

