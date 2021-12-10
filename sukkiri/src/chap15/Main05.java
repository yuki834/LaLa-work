package chap15;

import util.Check;

public class Main05 {

	public static void main(String[] args) {
		String s = "0ECE1210";
		
		if (Check.isValidPlayerName(s)) {
			System.out.println("正しい");
		} else {
			System.out.println("まちがい");
		}

	}

}
