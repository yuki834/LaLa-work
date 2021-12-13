package chap17;

public class Main05 {

	public static void main(String[] args) {
		int num = 0;
		try {
			num = Util.inputNum();	
		} catch (CannotNumberException e) {
			e.printStackTrace();
			System.out.println("数字を入力してください");
		}
		System.out.println("入力された数は " + num + "です");
	}
	
}
