package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class IOExam04 {
	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("src/IO/IOExam04.java"))){
			String line = null;
		while((line=br.readLine()) != null) {
			list.add(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		for(String str : list) {
			System.out.println(str);
		}
	}
}
