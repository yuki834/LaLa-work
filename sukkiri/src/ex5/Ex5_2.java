package ex5;

public class Ex5_2 {
	
	public static void main(String[] args) {
		email();
	}
	
	public static void email() {
		String title = "あああああ";
		String address = "いいいいい";
		String text = "うううううう";
		
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
		
	}
}
