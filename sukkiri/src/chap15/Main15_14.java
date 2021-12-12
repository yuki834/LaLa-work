package chap15;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main15_14 {

	public static void main(String[] args) {
		
		// 現在日時:1970-01-01から秒とナノ秒で取得
		Instant i1 = Instant.now();
		// 1600...を1970-01-01からの秒とナノ秒で取得
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		// i2をロング値になおす。これはミリ秒となる。
		long l = i2.toEpochMilli();
		
		// 現在日時をナノ秒刻みで取得。zone情報ももっている。
		ZonedDateTime z2 = ZonedDateTime.now();
		// 指定日時をナノ秒刻みで取得。zone情報ももっている。
		ZonedDateTime z1 = ZonedDateTime.of
				(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		
		// z2をロンドンに変える。
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		System.out.println("東京:" +
		   z2.getYear() + z2.getMonth() + z2.getDayOfMonth() + " " + 
		   z2.getHour() + ":" + z2.getMinute() + ":" + z2.getSecond());
		
		System.out.println("ロンドン:" +
		   z3.getYear() + z3.getMonth() + z3.getDayOfMonth() + " " +
		   z3.getHour() + ":" + z3.getMinute() + ":" + z3.getSecond());
		
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}
	}

}
