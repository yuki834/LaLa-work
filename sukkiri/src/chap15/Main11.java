package chap15;

import util.Check;

public class Main11 {

	public static void main(String[] args) {
		String name = "MINATO01";
		if (Check.isValidPlayerName(name)) {
			System.out.println("正しい名前です");
		} else {
			System.out.println("間違った名前です");
		}

	}

}
