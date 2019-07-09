package day07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Stack;

public class IOExam05 {
	public static void main(String[] args) throws Exception{
		URL url = new URL("https://www.skuniv.ac.kr/");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		Stack<String> array = new Stack<String>();
		System.out.println(url);
		try {
			String str;
			int count =0;
			while((str=br.readLine())!=null) {
				array.push(str);
				count++;
				//				System.out.println(str);
//								if(count>=10)
//									break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("=======================");

		try (PrintWriter pw = new PrintWriter("a.txt")){
			
			while(!array.isEmpty()) {
				String str = array.pop();
				System.out.println(str);
				pw.println(str);
				pw.print(str);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
