package programs2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalenderClass {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
System.out.println(sdf.format(d));
Calendar cal=Calendar.getInstance();
System.out.println(sdf.format(cal.getTime()));
System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
