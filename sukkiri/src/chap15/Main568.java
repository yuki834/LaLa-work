package chap15;

public class Main568 {

	public static void main(String[] args) {

		String name = "W8AAAAAA";
		if(isValidPlayerName(name)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");	
		}
	}

	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z]{2}[A-Z0-9]{6}");
	}
}
