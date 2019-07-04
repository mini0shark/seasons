
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new MyCalculator();
		System.out.println(c.plus(4, 3));
		System.out.println(c.multiple(2, 6));
	}
}
interface Calculator{
	public int plus(int i, int j);
	public int multiple(int i, int j);
	default int exec(int i, int j) {
		return i+j;
	}
}
class MyCalculator implements Calculator{

	@Override
	public int plus(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	@Override
	public int multiple(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}
	
}
