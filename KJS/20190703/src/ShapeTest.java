
public class ShapeTest {
	public static void main(String args[]) {
  Point p=new Point();
  
   p.Setx(2);
   p.Sety(5);
   p.show(true);
   
   p.Setx(10);
   p.Sety(23);
   p.show(true);
   
   p.Setx(2);
   p.Sety(5);
   p.show(false);
   
   p.Setx(10);
   p.Sety(23);
   p.show(false);
	
	}
}
