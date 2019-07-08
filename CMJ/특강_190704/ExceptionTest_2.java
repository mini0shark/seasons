package CMJ.특강_190704;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest_2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		System.out.println(arr[5]);
		
		int a = 0;
		System.out.println(1 / a);
		// Exception이 일어날 것을 알지만 지금 대놓고 표시가 되지 않는다.
		
		try {
			FileInputStream fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}