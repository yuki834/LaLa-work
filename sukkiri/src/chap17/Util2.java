package chap17;

import java.util.Scanner;

public class Util2 {
	public static int inputNum() throws NumberFormatException {
		int num = 0;
		
		System.out.print("数を入力> ");
		Scanner scan = new Scanner(System.in);
		String numtext = scan.nextLine();
		num = Integer.parseInt(numtext);
		System.out.println("処理を終わります");

		
		return num; 
	}
}
