package chap15.time;

import java.time.LocalDate;
import java.time.Period;

public class Main598 {

	public static void main(String[] args) {

		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);
		
		
		Period p1 = Period.ofDays(3);
		System.out.println(p1);
		
		Period p2 = Period.between(d1,d2);
		System.out.println(p2);
		
		LocalDate d3 = d2.plus(p2);
		System.out.println(d3);
	}

}
