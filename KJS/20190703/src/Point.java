
public class Point {
 
	int x;
	int y;
	
 public int Getx() {
	 return x;
 }
 
 public void Setx(int x) {
	 this.x=x;
 }
 
 public int Gety() {
	 return y;
 }
 
 public void Sety(int y) {
	 this.y=y;
 }


public void show() {
	System.out.printf("��ǥ [x=%d,y=%d]�� ���� �׷Ƚ��ϴ�.\n",x,y);//x,y���� �ٲ�Ƿ� printf���!
	
}

public void show(boolean visible) {
	if(visible==true) {
		show();
	}
	
	if(visible==false) {
		System.out.printf("��ǥ [x=%d,y=%d]�� ���� �������ϴ�.\n",x,y);
	}
	
	
	

}

}