package chap15;

public class Main557 {

	public static void main(String[] args) {
		
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "";
		
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3は大文字、小文字の区別なしで等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		
		if(s4.isEmpty()) {
			System.out.println("s4は空文字です");
		}

	}

}
