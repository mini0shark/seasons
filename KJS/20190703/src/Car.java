
public class Car {
   String name;//field:�������: �ν��Ͻ� ������ ������.
   int speed;
   static String ������;//Ŭ�������� static�� ������(�� ���): Ŭ������ �޸𸮿� �ö� �� ������.
   
//�����ڰ� �ϳ��� ������ �����Ϸ��� �⺻ �����ڸ� �߰����� �ʴ´�.(�ʿ��ϸ� �����ϱ�)
//this�� ���ϸ��� �����ؾ��Ѵ�.   
   
  /*public Car(){
   * 
   * this("�̸�����",0);
   
   }
  */
  public Car(String name){
	   this.name=name;//this(name,0);
	   System.out.println("�� ���̸���"+this.name+"�Դϴ�.");
   }
   
  public Car(String name,int speed){
	   this.name=name;//this(name);�� ����. 
	   this.speed=speed;
	   System.out.println("�� ���̸���"+this.name+"�Դϴ�.");
	   System.out.println("�� ���ӵ���"+this.name+"�Դϴ�.");
   }
   
   //�޼ҵ� ����
   //����������,����Ÿ��,�޼ҵ���(�Ű����� ��..)
   
   //name(���� �̸�)�� �ο��ϴ� �޼ҵ�
 public void setName(String name) {
	 this.name=name;//���� field:this.name, �Ű�����(String name):name 
 }
 
 public String getName() {
	 return name;
 }
}
