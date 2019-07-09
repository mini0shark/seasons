package IO;

import java.net.URL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Stack;

public class IOExam05 {
	public static void main(String args[]) throws Exception{
		URL url=new URL("https://www.skuniv.ac.kr/");
		Stack<String> stack=new Stack<>();

		try(BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()))){
			String line;
			for(int i=0;i<5;i++) {
				stack.push(br.readLine());
			}

		}catch(Exception e) {
			e.printStackTrace();
		}

		try(PrintWriter pw=new PrintWriter("sku.txt")){
			while(!stack.isEmpty()) {
				pw.println(stack.pop());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}}
