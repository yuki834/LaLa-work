package chap15;

public class Main560 {

	public static void main(String[] args) {

		String s1 = "Java programing";
		disp("文字列s1の4文字目以降は" + s1.substring(3));
		disp("文字列s1の4~8文字目は" + s1.substring(3,8));
		disp(s1.replace("Java", "PHP"));
		
	}
	
	public static void disp(Object s) {
		System.out.println(s);
	}


}
