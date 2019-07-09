package calendar;
import java.util.Calendar;

public class CalendarForMe {
	private int year;
	private int month;

	public CalendarForMe(int year, int month) {
		this.year = year;
		this.month = month;
	}
	public void printCalendar() {
		Calendar c;
		int startDay;
		int endDay;
		c = Calendar.getInstance();
		c.set(year, month - 1, 1);
		System.out.println(year + "�� " + month + "��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		startDay = c.get(Calendar.DAY_OF_WEEK);
		endDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for(int i = 1;i < startDay;i++) {
			System.out.print("\t");
		} // �����ϴ� ���ϱ��� ���� ���

		for(int i = 1;i <= endDay;i++) {
			System.out.print(i + "\t");
			if((i + startDay - 1) % 7 == 0) {
				System.out.println();
			}
		}

	}
}
