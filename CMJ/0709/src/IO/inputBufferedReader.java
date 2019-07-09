package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class inputBufferedReader {
	public static void main(String[] args) {
		String name = null;
		String phoneNumber = null;
		String phoneList = null;
		
		try {
			PrintWriter outTxt = new PrintWriter(new FileOutputStream("C:/temp/phone.txt"));
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			
			for(int count = 1; count <= 3; count++) {
				System.out.print("�̸�: ");
				name = kb.readLine();
				System.out.println("��ȭ��ȣ: ");
				phoneNumber = kb.readLine();
				outTxt.println(name + " " + phoneNumber);	
			}
			outTxt.close();
			System.out.println("...��ȭ��ȣ�� c:/temp/phone.txt�� ����Ǿ����ϴ�.");
			
			BufferedReader br = new BufferedReader(new FileReader("C:/temp/phone.txt"));
			System.out.println();
			System.out.println("c:/temp/phone.txt �� ������ ������ �����ϴ�...");
			while((phoneList = br.readLine()) != null) {
				System.out.println(phoneList);
			}
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file. " + e.getMessage());
			System.exit(0);
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
