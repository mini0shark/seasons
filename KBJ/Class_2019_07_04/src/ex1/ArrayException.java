package ex1;

public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		for(int i = 0; i<5; i++) {
			try {
				intArray[i+1] = i+1 +intArray[i];
			}catch(IndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("IndexOutOfBoundsException");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Exception");
			}finally {
				System.out.println("intArray["+i+"]="+intArray[i]);
			}
			
			
		}
	
	}

}
