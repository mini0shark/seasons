package CMJ.Ư��_190704;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest_2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		System.out.println(arr[5]);
		
		int a = 0;
		System.out.println(1 / a);
		// Exception�� �Ͼ ���� ������ ���� ����� ǥ�ð� ���� �ʴ´�.
		
		try {
			FileInputStream fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
