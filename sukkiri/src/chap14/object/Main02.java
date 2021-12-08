package chap14.object;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		System.out.print(">");
		Scanner scanner = new Scanner(System.in);
		String buf = scanner.nextLine();
		if (buf.equals("a")) {
			System.out.println("aですね");
		} else {
			System.out.println("aではない");
		}
		scanner.close();

	}

}
