package ex15;

public class Main01 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(String.valueOf(i) + ",");
		}
		String str = sb.toString();
		System.out.println(str);
		
		String[] s = str.split(",");
		for (String ss : s) {
			System.out.println(ss);
		}
	}

}
