package CMJ.특강_190705;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		printDate(calendar);
		
		calendar.set(Calendar.YEAR, 2013);
		printDate(calendar);
		
		calendar.set(2013, 6, 12);
		printDate(calendar);
		
		calendar.set(2013,  6, 12, 13, 58);
		printDate(calendar);
		
		calendar.set(2013,  6, 12, 13, 58, 30);
		printDate(calendar);
	}
	
	public static void printDate(Calendar calendar) {
		System.out.println(calendar.get(Calendar.YEAR) + "년 " + (calendar.get(Calendar.MONTH) + 1) + "월 " + 
				calendar.get(Calendar.DATE) + "일 " + (calendar.get(Calendar.AM_PM) == 0 ? "오전 " : "오후 ") + 
				calendar.get(Calendar.HOUR) + "시 " + calendar.get(Calendar.MINUTE) + "분 " + 
				calendar.get(Calendar.SECOND) + "초");
	}
}