package chap15.time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main591 {

	public static void main(String[] args) {

		Instant i1 = Instant.now();
		System.out.println(i1);
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		System.out.println(i2);
		long l = i2.toEpochMilli();
		System.out.println(l);
		
		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println(z1);
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 0, 0, 0, 0, ZoneId.of("Asia/Tokyo"));
		System.out.println(z2);
		
		Instant i3 = z2.toInstant();
		System.out.println(i3);
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		System.out.println(z3);
		
		System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間をさしています");
		}
	}

}
