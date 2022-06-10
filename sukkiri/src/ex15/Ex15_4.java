package ex15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex15_4 {

	public static void main(String[] args){
		
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(now);
		System.out.println(cal);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
//		day = 110;
		cal.set(Calendar.DAY_OF_MONTH,110);
		System.out.println(cal);

		Date d = cal.getTime();
		System.out.println(d);
		
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(d));
}
}