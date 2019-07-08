import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//지금!
		printDate(calendar);
		
		//년도 2013년으로 설정
		calendar.set(Calendar.YEAR, 2013);
		printDate(calendar);
		
		
	}

	private static void printDate(Calendar calendar) {
		System.out.println(calendar.get(Calendar.YEAR)+ "년 " +
				(calendar.get(Calendar.MONTH) +1) + "월 "+ //0부터 시작
				calendar.get(Calendar.DATE)+"일 "+
				(calendar.get(Calendar.AM_PM)== 0 ? "오전" :"오후") + //오전:0 , 오후:1
				calendar.get(Calendar.HOUR)+ "시 "+
				calendar.get(Calendar.MINUTE)+ "분 "+
				calendar.get(Calendar.SECOND)+ "초");
	}
}
