
public class LangClassTest1 {
 public static void main(String args[]) {
	 Rect a=new Rect(2,3);
	 Rect b=new Rect(3,2);
	 Rect c=new Rect(3,4);
	 
	 if(a.equals(b))
		 System.out.println("�簢�� a�� �簢�� b�� �����ϴ�.");
	 if(a.equals(c))
		 System.out.println("�簢�� a�� ����� c�� �����ϴ�.");
	 if(b.equals(c))
		 System.out.println("�簢�� b�� ����� c�� �����ϴ�.");
 }
}
