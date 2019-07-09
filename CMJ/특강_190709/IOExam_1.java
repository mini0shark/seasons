package CMJ.특강_190709;

import java.io.*;

public class IOExam_1 {
	public static void main(String[] args) throws IOException {
		// 키보드로부터 한줄씩 입력받고 싶다.
		// 키보드는 System.in
		// 한줄씩 BufferedReader
		int i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름을 입력하세요: ");
		String name = null;
		
		// 파일에 출력하고 싶다.
		FileWriter fw = new FileWriter("src/CMJ/특강_190709/IOExam_1.txt");
		
		for(i = 0;i < 5;i++) {
			try {
				name = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			fw.write(name);
			fw.write("\n");
		}
		
		fw.close();
		
//		BufferedReader brFile = new BufferedReader(new FileReader("src/CMJ/특강_170709/IOExam_1.txt"));
//		
//		String line = brFile.readLine();
//		
//		for(i = 0;i < 5;i++) {
//			System.out.println(line);
//		}
//		
//		brFile.close();
	}
}
