package day07;

import java.io.FileInputStream;

public class Test {
	public static void main(String[] args) {
//		String str = "asdf";
//		FileInputStream fi;
//		try {
//			fi = new FileInputStream("name.txt");
//			System.out.println("있음");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("숫자가 아니므니다");
//		}
		TT t = new TT(1);
	}
}

class TT {
	public TT(){
		System.out.println("TT()실행");
	}
	public TT(int t) {
		System.out.println("TT(int t) 실행");
	}
}