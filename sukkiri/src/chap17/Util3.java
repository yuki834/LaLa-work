package chap17;

import java.util.Scanner;

public class Util3 {
	public static int inputNum() throws NumberFormatException {
		int num = 0;
		
		System.out.print("数を入力> ");
		Scanner scan = new Scanner(System.in);
		String numtext = scan.nextLine();
		try {
			num = Integer.parseInt(numtext);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("ヤバイ！");
		} finally {
			scan.close();
		}
		System.out.println("処理を終わります");

		return num; 
	}
}
