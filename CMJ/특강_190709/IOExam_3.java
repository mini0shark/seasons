package CMJ.특강_190709;

import java.io.*;

public class IOExam_3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/CMJ/특강_190709/IOExam_1.txt");
			fos = new FileOutputStream("src/CMJ/특강_190709/IOExam.txt");
			
			byte[] byteArray = new byte[512];
			int n;
			int count = 0;
			
			while((n = fis.read(byteArray)) != -1) {
				fos.write(byteArray);
				count++;
			}
			System.out.println("총 읽어온 횟수: " + count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fos != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
