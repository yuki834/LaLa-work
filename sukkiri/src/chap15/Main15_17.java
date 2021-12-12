package chap15;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main15_17 {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		LocalDate d1 = LocalDate.of(2020,  1, 1);
		LocalDate d2 = LocalDate.of(2020,  1, 4);
		
		Period p1 = Period.ofDays(6);
		Period p2 = Period.between(d1, d2);
		
		LocalDate d3 = d2.plus(p2);
		System.out.println(d3.format(fmt));
		
		LocalDate birthday = LocalDate.parse("1956/07/26", fmt);
		LocalDate now = LocalDate.now();
		Period age = Period.between(birthday, now);
		System.out.println(age.getYears() + "歳");
	}

}
