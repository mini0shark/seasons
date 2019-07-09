package calendar;

import java.util.Calendar;

public class Cal {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.DAY_OF_WEEK);
		cal.set(2019, 9, 1);
		printDate(cal);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		cal.set(2019, 8, 3);
		System.out.println(cal.DAY_OF_WEEK);
	}
	public static void printDate(Calendar c) {
		System.out.println(c.get(Calendar.YEAR) +"년 " +
	(c.get(Calendar.MONTH)+1)+"월 "+ 
	c.get(Calendar.DATE)+"일 "+
	(c.get(Calendar.AM_PM)==0?"오전 ": "오후 ")+
	c.get(Calendar.HOUR)+"시 "+
	c.get(Calendar.MINUTE)+"분 "+
	c.get(Calendar.SECOND)+"초 ");
	}
}
