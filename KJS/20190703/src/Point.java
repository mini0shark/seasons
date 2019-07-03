
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
	System.out.printf("좌표 [x=%d,y=%d]에 점을 그렸습니다.\n",x,y);//x,y값이 바뀌므로 printf사용!
	
}

public void show(boolean visible) {
	if(visible==true) {
		show();
	}
	
	if(visible==false) {
		System.out.printf("좌표 [x=%d,y=%d]에 점을 지웠습니다.\n",x,y);
	}
	
	
	

}

}