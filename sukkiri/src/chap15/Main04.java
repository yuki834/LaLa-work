package chap15;

public class Main04 {

	public static void main(String[] args) {
		/**/
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 1000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		
		System.out.println(s);
		/**/
		/*
		String s = "";
		for (int i = 0; i < 100; i++) {
			s = s + "java";
		}
		System.out.println(s);
		*/
	}

}
