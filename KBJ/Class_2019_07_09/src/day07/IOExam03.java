package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOExam03 {
	public static void main(String[] args) {
		int bt;
		int count=0;
		FileInputStream fis =null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/day07/IOExam01.java");
			fos = new FileOutputStream("IOExam.txt");
			
			byte[] b = new byte[512];
			int n;
			while((n=fis.read(b))!= -1) {
				fos.write(b,0,n);
				count++;
			}
			System.out.println("ÃÑ ÀÐ¾î¿Â È½¼ö : "+count);
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
}
