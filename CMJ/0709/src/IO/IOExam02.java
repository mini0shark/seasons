package IO;

import java.io.IOException;

public class IOExam02 {
	public static void main(String[] args) {
		try {
			System.out.println("ют╥б");
			System.out.println((char)System.in.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int bt;
		int count = 0;
		
		try {
			while((bt = System.in.read()) != -1) {
				System.out.println((char)bt);
				count++;
				}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(count);
	}
}
