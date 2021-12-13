package chap17;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		
		System.out.print("数を入力> ");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		try {
			int num = Integer.parseInt(text);
			System.out.println("入力された数は " + num + "です");
		} catch (NumberFormatException e) {
			System.out.println("数字を入力してください");
		}
		// scan.close();

	}

}
