package classTest;

import staticMethod.StaticTest;

public class StaticTestMain {
	public static void main(String[] args) {
		System.out.println("���� ��");
		StaticTest.printNumberOfCars();
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println("st2 ���� ����");
		StaticTest.printNumberOfCars();
		StaticTest st3 = new StaticTest();
		StaticTest st4 = new StaticTest();
		StaticTest st5 = new StaticTest();
		System.out.println("st5 ���� ����");
		StaticTest.printNumberOfCars();
		StaticTest st6 = new StaticTest();
		System.out.println("st6 ���� ����");
		StaticTest.printNumberOfCars();
		st6.printNumberOfCars();
		
	}
}
