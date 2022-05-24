package chap05;

public class Main5_2 {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("朝香");
		System.out.println("メソッドの呼び出しが終わりました");
		
		int x = 100;
		int y = 10;
//		int ans = add(x, y);
		System.out.println(x + "+" + y + "=" + add(x, y));
	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

}
