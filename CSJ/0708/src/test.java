import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		
		//1.�迭(�������� �ڷᱸ��)
	    String[] names=new String[3];
	    names[0]="Kang";
	    names[1]="kim";
	    names[2]="hong";
	    
		
		for(String name : names) {
			System.out.println(name + "\t");
		}
		
		System.out.println();
		
		
		
		//ArrayList (�������� �ڷᱸ��)
		ArrayList<String> nameList = new ArrayList<>(3);
		System.out.println();
		
		nameList.add("kang");
		nameList.add("kim");
		nameList.add("hong");
		
		nameList.add("choi"); //ArrayList �������� => ũ�Ⱑ 3���� 4�� ����
		
		for(String name : nameList) {
			System.out.println(name + "\t");
		}
		
		System.out.println();
		
		
		
		System.out.println(nameList.get(0));
		System.out.println();
		
		
		for(String name : nameList) {
			System.out.println(name + "\t");
		}		
		System.out.println();
		
		
		
		System.out.println(nameList.remove(0));
		
		for(String name : nameList) {
			System.out.println(name + "\t");
		}		
		System.out.println();

		
		for(int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
	}
}
