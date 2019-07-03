package classTest;

import staticMethod.StaticTest;

public class StaticTestMain {
	public static void main(String[] args) {
		System.out.println("积己 傈");
		StaticTest.printNumberOfCars();
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println("st2 积己 捞饶");
		StaticTest.printNumberOfCars();
		StaticTest st3 = new StaticTest();
		StaticTest st4 = new StaticTest();
		StaticTest st5 = new StaticTest();
		System.out.println("st5 积己 捞饶");
		StaticTest.printNumberOfCars();
		StaticTest st6 = new StaticTest();
		System.out.println("st6 积己 捞饶");
		StaticTest.printNumberOfCars();
		st6.printNumberOfCars();
		
	}
}
