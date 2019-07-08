
public class Circle {
 int x;
 int y;
 int radius;
 
 Circle(int x, int y, int radius){
	 this.x=x;
	 this.y=y;
	 this.radius=radius;
 }
 
 @Override
 public boolean equals(Object obj) {
	 if(obj instanceof Circle) {
		 Circle c=(Circle)obj;
        if(radius==c.radius)
        	return true;
	 }
	 
	 return false;
 }
}
