package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IOExam06 {
	public static void main(String[] args) throws IOException {
		String morningEgg;
		String lunchEgg;
		String dinnerEgg;
		int totalEgg;
		
		BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��ħ�� ���� ��� ����: ");
		morningEgg = keybd.readLine();
		System.out.println("��ħ�� ���" + morningEgg + "��");
		System.out.println();
		
		System.out.print("���ɿ� ���� ��� ����: ");
		lunchEgg = keybd.readLine();
		System.out.println("���ɿ� ���" + lunchEgg + "��");
		System.out.println();
		
		System.out.print("���ῡ ���� ��� ����: ");
		dinnerEgg = keybd.readLine();
		System.out.println("���ῡ ���" + dinnerEgg + "��");
		System.out.println();
	
	}
}
