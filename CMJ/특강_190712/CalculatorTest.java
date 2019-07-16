package CMJ.특강_190712;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	@Override
	protected void setUp() throws Exception {
		// 초기화 ex) 파일 생성
		System.out.println("setUp 실행");
	}
	
	@Override
	protected void tearDown() throws Exception {
		// 실행 끝나고 원상복귀 ex) 파일 삭제
		System.out.println("tearDown 실행");
	}
	
	public void testAdd() throws Exception {
		System.out.println("testAdd 실행");
		
		Calculator calculator = new Calculator();
		
		int result = calculator.add(3, 4);
		
		assertEquals(7, result);
	}
	
	public void testMinus() {
		System.out.println("testMinus 실행");
		
		Calculator calculator = new Calculator();
		
		assertEquals(3, calculator.minus(7, 4));
	}
	
	public void testMul() {
		System.out.println("testMul 실행");
		
		Calculator calculator = new Calculator();
		
		assertEquals(6, calculator.multiple(2, 3));
	}
	
	public void testDiv() {
		System.out.println("testDiv 실행");
		
		Calculator calculator = new Calculator();
		
		assertEquals(3, calculator.divide(6, 2));
	}
}
