package ex15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex15_5 {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
		System.out.println(future);
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("西暦 yyyy年MM月dd日");
		System.out.println(future.format(dft));
	}

}
