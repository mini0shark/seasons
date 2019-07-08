import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//����!
		printDate(calendar);
		
		//�⵵ 2013������ ����
		calendar.set(Calendar.YEAR, 2013);
		printDate(calendar);
		
		
	}

	private static void printDate(Calendar calendar) {
		System.out.println(calendar.get(Calendar.YEAR)+ "�� " +
				(calendar.get(Calendar.MONTH) +1) + "�� "+ //0���� ����
				calendar.get(Calendar.DATE)+"�� "+
				(calendar.get(Calendar.AM_PM)== 0 ? "����" :"����") + //����:0 , ����:1
				calendar.get(Calendar.HOUR)+ "�� "+
				calendar.get(Calendar.MINUTE)+ "�� "+
				calendar.get(Calendar.SECOND)+ "��");
	}
}
