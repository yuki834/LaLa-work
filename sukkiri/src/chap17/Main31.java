package chap17;

import java.util.Scanner;

public class Main31 {

	public static void main(String[] args) {
		System.out.print("数を入力> ");
		Scanner scan = new Scanner(System.in);
		String numtext = scan.nextLine();
		int num = Integer.parseInt(numtext);
		System.out.println("数は " + num + " です。");
		scan.close();
	}

}
