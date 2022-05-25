package sample;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数値を入力してください");
		double a = new java.util.Scanner(System.in).nextDouble();
		System.out.println("1: +, 2: -, 3: *, 4: / ,いずれかの数値を入力してください");
		int b = new java.util.Scanner(System.in).nextInt();
		System.out.println("数値を入力してください");
		double c = new java.util.Scanner(System.in).nextDouble();
		
		switch(b) {
		case 1:
			System.out.println("計算結果は" + Logi.plus(a,c));
			break;
		case 2:
			System.out.println("計算結果は" + Logi.hiku(a,c));
			break;
		case 3:
			System.out.println("計算結果は" + Logi.kakeru(a,c));
			break;
		case 4:
			System.out.println("計算結果は" + Logi.waru(a,c));
			break;
		}
		
	}

	


}
