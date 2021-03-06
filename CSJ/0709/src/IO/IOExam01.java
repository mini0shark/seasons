package IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExam01 {
	public static void main(String[] args) throws IOException {
		String name = null;
		//키보드로부터 한 줄 씩 입력 받고싶다.
		//키보드로 입력받을 때 System.in 을 씀
		//한줄씩 입력받고 싶을 때 BufferedReader
		
		// 키보드를 그냥 입력받을 수 없어서 InputStreamReader 활용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름을 입력하세요.");
		
		try {
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//파일에 출력하고 싶다.
		FileWriter fw = new FileWriter("name.txt");
		fw.write(name);
	}
}
