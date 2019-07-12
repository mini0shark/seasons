package calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import claculator.Calculator;
import junit.framework.TestCase;
import junit.framework.*;

public class CalculatorTest extends TestCase{
	Calculator cal = new Calculator();

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("setUp 실행");
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		cal=null;
		System.out.println("tearDown 실행");
	}
	public void testAdd() throws Exception{
		System.out.println("testAdd 실행");
		int result = cal.add(3,4);
		assertEquals(7, result);
		assertEquals(10, cal.add(10,0));
	}
	public void testMinus() throws Exception{
		System.out.println("testMinus 실행");
		assertEquals(3,  cal.minus(7, 4));
	}
	
}
