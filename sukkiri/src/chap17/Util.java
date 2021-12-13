package chap17;

import java.util.Scanner;

public class Util {

	public static int inputNum() throws CannotNumberException {
		int num = 0;

		System.out.print("数を入力> ");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		try {
			num = Integer.parseInt(text);
		} catch (NumberFormatException e) {
			throw new CannotNumberException
				("数字ではありません");
		} finally {
			scan.close();
		}
		return num;
	}

}
