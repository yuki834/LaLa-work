package ex15;

public class Ex15_1 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		for(int i =1; i <= 100; i++) {
			sb.append(i);
			sb.append(",");
		}
//		System.out.println(sb);
		String s = sb.toString();
		
		String[] a = s.split(",");

	}

}
