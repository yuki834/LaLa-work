package chap15;

public class Main03 {

	public static void main(String[] args) {
		String s1 = " Java programing";
		
		System.out.println("文字列s1の4文字目以降は" + 
				s1.substring(3));
		
		System.out.println("文字列s1の4～8文字目は" + 
				s1.substring(3, 8));
	
		// String s2 = s1.toLowerCase();
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.trim());
		
		System.out.println(s1.replace("Java", "PHP"));
	}

}
