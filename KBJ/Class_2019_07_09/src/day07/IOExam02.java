package day07;

public class IOExam02 {
	public static void main(String[] args) {
		try {
			System.out.println("ÀÔ·ÂÇØºÁ¿ä!!");
			System.out.println(System.in.read());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		int bt;
		int count=0;
		try {
			while((bt = System.in.read() )!= -1) {
				System.out.print((char)bt);
				count++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(count);
	}
}
