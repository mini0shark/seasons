package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExam03 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/IO/IOExam01.java");
			fos = new FileOutputStream("IOExam.txt");
			
			byte [] b = new byte[10];
			int n;
			int count = 0;
			
			while((n=fis.read(b)) != -1) {
				fos.write(b);
				count++;
			}
			System.out.println("ÃÑ ÀÐ¾î¿Â È½¼ö : " + count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			
		}
	}
}
