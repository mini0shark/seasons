package IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExam01 {
	public static void main(String[] args) throws IOException {
		String name = null;
		//Ű����κ��� �� �� �� �Է� �ް��ʹ�.
		//Ű����� �Է¹��� �� System.in �� ��
		//���پ� �Է¹ް� ���� �� BufferedReader
		
		// Ű���带 �׳� �Է¹��� �� ��� InputStreamReader Ȱ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�̸��� �Է��ϼ���.");
		
		try {
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//���Ͽ� ����ϰ� �ʹ�.
		FileWriter fw = new FileWriter("name.txt");
		fw.write(name);
	}
}