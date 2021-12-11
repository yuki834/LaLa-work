package chap17;

public class Main36 {

	public static void main(String[] args) {
		int num = 0;
		
		System.out.println("=== 数入力システム ===");
		try {
			num = Util3.inputNum();
		} catch (NumberFormatException e) {
			System.out.println("数字ちゃうし");
		}
		System.out.println("入力された数は " + num + " です");
		
	}

}
