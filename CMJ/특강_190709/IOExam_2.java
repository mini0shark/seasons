package CMJ.특강_190709;

import java.io.IOException;

public class IOExam_2 {
	public static void main(String[] args) {
		try {
			System.out.println("입력");
			System.out.println((char)System.in.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int bt;
		int count = 0;
		
		try {
			while((bt = System.in.read()) != -1) {
				System.out.print((char)bt);
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(count);
		
	}
}
