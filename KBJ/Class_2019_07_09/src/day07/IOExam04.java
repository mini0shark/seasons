package day07;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;

public class IOExam04 {
	public static void main(String[] args) {
		FileInputStream fis;
		FileOutputStream fos;
		ArrayList<String> arrList = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader("src/day07/IOExam01.java"))){
			String  str=null;
			while((str=br.readLine()) != null) {
				arrList.add(str);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		for(String i : arrList) {
			System.out.println(i);
		}
	}
}
