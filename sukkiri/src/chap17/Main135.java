package chap17;

import java.util.Scanner;

public class Main135 {
	static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		try {
			inputNum();
		} catch (NumberFormatException e) {
			System.out.println("おかしいで");
		}
		System.out.println("どうしよう");
		System.out.println("まあええか");
		scan.close();
	}
	
	public static void inputNum() throws NumberFormatException {
		boolean mode = true;
		
		System.out.print("数を入力 > ");
		String numtxt = scan.nextLine();
		int num = Integer.parseInt(numtxt);
		System.out.println("数字は" + num + "です");
		System.out.println("end.");
	}

	public static void inputNum2() {
		boolean mode = true;
		
		while(mode) {
			System.out.print("数を入力 > ");
			String numtxt = scan.nextLine();
			try {
				int num = Integer.parseInt(numtxt);
				System.out.println("数字は" + num + "です");
				mode = false;
			} catch (NumberFormatException e) {
				System.out.println("有効な数字を入力してください");
			}
		}
		System.out.println("end.");
	}
}
