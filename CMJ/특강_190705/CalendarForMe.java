package CMJ.특강_190705;

import java.util.Calendar;

public class CalendarForMe {
	private int year;
	private int month;

	private int startDay;
	private int endDay;
	private Calendar c;

	public CalendarForMe(int year, int month) {
		this.year = year;
		this.month = month;
		c = Calendar.getInstance();
		c.set(year, month - 1, 1);
	}
	
	public void printCalendar() {
		System.out.println(year + "년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		startDay = c.get(Calendar.DAY_OF_WEEK);
		endDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for(int i = 1;i < startDay;i++) {
			System.out.print("\t");
		}

		for(int i = 1;i <= endDay;i++) {
			System.out.print(i + "\t");
			if((i + startDay - 1) % 7 == 0) {
				System.out.println();
			}
		}

	}
}
