package CMJ.특강_190709;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Stack;

public class IOExam_5 {
	public static void main(String[] args) throws IOException {
		Stack<String> stack = new Stack<>();
		
		try {
			URL url = new URL("https://www.skuniv.ac.kr");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			for(int i = 0;i < 5;i++) {
				stack.push(br.readLine());
			}
			
			for(int i = 0;i < 5;i++) {
				System.out.println(stack.pop());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}