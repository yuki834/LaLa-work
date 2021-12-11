package chap17;

public class Main34 {

	public static void main(String[] args) {
		int num = 0;
		
		System.out.println("=== 数入力システム ===");
		try {
			num = Util2.inputNum();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("入力された数は " + num + " です");
		
	}

}
