package chap17;

import java.util.Scanner;

public class Util {
	public static int inputNum() {
		int num = 0;
		
		System.out.print("数を入力> ");
		Scanner scan = new Scanner(System.in);
		String numtext = scan.nextLine();
		try {
			num = Integer.parseInt(numtext);
			System.out.println("数は " + num + " です。");
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("不正な入力です");
		} finally {
			scan.close();
		}
		System.out.println("処理を終わります");

		
		return num; 
	}
}
