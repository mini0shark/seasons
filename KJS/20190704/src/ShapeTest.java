
public class ShapeTest {
 public static void main(String args[]) {
	 Shape c=new Circle(5);
	 System.out.println(c.calculateArea());
	 
	 Shape r=new Rectangle(10,4);
	 System.out.println(r.calculateArea());
	 
	 Drawable d=(Circle)c;
	 
	 d.draw();
	 
 }
}


