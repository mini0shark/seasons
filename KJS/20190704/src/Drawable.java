//자바에서는 다중상속이 불가 인터페이스틑 다중으로 사용할수있음
//인터페이스 사이에서는 다중 상속이 가능
//인터페이스는 interface 키워드로 선언하고 implements키워드로 사용
//인터페이스는 객체 생성가능.

interface Drawable{
	default int exec(int i, int j) {
		return i+j;//인터페이스가 변경이 되면 ,인터페이스를 구현하는 모든 클래스들이 해당 메소드를 구현해야 하 는 문제가 있다 . 
		          //이런 문제를 해결하기 위하여 인터페이스에 default 메소드를 구현해 놓을 수 있도록 하 였다 .
	}            // 구현하는 클래스는 default default메소드를 오버라이딩 할 수 있다 .
	public void draw();//interface는 abstract키워드로 지정하지 않더라도 자동으로 추상화
}




