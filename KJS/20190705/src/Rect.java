
public class Rect {
	int width;
	int height;
	
	
	
	Rect(int width,int height){
		this.width=width;
		this.height=height;
	}
	
	
	public int area(int width,int height) {
		return width*height;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rect) {
			Rect r=(Rect)obj;
			if(area(width, height)==r.area(width, height))
				return true;
		}
	
		return false;
		
	}

}
