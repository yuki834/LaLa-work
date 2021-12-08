package chap14;

public class Main01 {

	public static void main(String[] args) {
		Empty empty = new Empty();
		int code = empty.hashCode();
		System.out.println(empty);
		System.out.println(Integer.toHexString(code));

	}

}
