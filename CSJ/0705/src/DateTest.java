import java.text.DateFormat;
import java.util.Date;

import javax.swing.plaf.synth.SynthSeparatorUI;


public class DateTest {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dateFormat1.format(now));
		
		DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dateFormat2.format(now));
		
		DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dateFormat3.format(now));
		
		DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dateFormat4.format(now));
	}
}
