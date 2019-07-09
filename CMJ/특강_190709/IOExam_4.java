package CMJ.특강_190709;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOExam_4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader("src/CMJ/특강_190709/IOExam_1.txt"));) {
			String line = null;
			while((line = br.readLine()) != null) {
				list.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(String str : list) {
			System.out.println(str);
		}
	}
}