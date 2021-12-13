package chap17;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		int num = inputNum();
		System.out.println("入力された数は " + num + "です");
	}
	
	public static int inputNum() {
		int num = 0;

		System.out.print("数を入力> ");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		try {
			num = Integer.parseInt(text);
		} catch (NumberFormatException e) {
			System.out.println("数字を入力してください");
		}
		scan.close();
		return num;
	}

}
