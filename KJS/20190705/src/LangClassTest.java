
public class LangClassTest {

	public static void main(String[] args) {
		Point p=new Point(2,3);
		Point p1=new Point(2,3);

		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());// ��ü�� �����ϰ� ������ �� �ִ� ���� id
		System.out.println(p.toString());// �Է¹޴� ��ü ���. �ַ� �ڽ��� ���¿� �°� override�ؼ� ���� ����Ѵ�.
		System.out.println(p);
		
		
		if(p==p1)//==�� �ּҰ����� ����.
			System.out.println("����");
		else
			System.out.println("�ٸ���.");
		
		
		if(p.equals(p1))//equals()�޼ҵ带 ����ؾ��Ѵ�. 
		System.out.println("����");
		else
			System.out.println("�ٸ���.");
		
		/*��ü�� if�� ���� equals�� ���� �ٸ��ٰ� ���´�.(Point class�� equals�޼ҵ带 override�ؾ��Ѵ�. ������ String�� if�� �ٸ���. equals�� ���ٰ� ���´�. �� String�� equals
		 *�� override�ϴ� ���̴�.
		 */
	}
}