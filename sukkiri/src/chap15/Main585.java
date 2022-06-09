package chap15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main585 {

	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		Date d = f.parse("2025/05/01");
//		System.out.println(d);

		Date now = new Date();
		String s = f.format(now);
		System.out.println(s);
		
		long milis = d.getTime() - now.getTime();
		System.out.println(milis);
		int day = ((int)milis) / (24*60*60*1000);
//		String q = f.format(day);
		System.out.println(day);
	}

}
