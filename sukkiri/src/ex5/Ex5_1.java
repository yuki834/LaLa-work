package ex5;

public class Ex5_1 {

	public static void main(String[] args) {
		introduceOneself();
		
	}
	
	public static void introduceOneself() {
		System.out.println("名前を入力してください");
		String name = "太郎";
		int age = 15;
		double height = 165.5;
		char eto = '酉';
		System.out.println("名前は" + name + "年齢は" + age + "身長は" + height + "干支は" + eto);
	}
	
//	public static String introduceOneself(String name) {
//		System.out.println("名前を入力してください");
//		String name = new java.util.Scanner(System.in).nextLine();
//		return name;
//	}
//	
//	public static int introduceOneself(int age) {
//		System.out.println("年齢を入力してください");
//		int age = new java.util.Scanner(System.in).nextInt();
//		return age;
//	}
//	
//	public static double introduceOneself(Double height) {
//		System.out.println("身長を入力してください");
//		double height = new java.util.Scanner(System.in).nextDouble();
//		return height;
//	}
//	
//	public static char introduceOneself(char eto) {
//		System.out.println("干支を入力してください");
//		char eto = new java.util.Scanner(System.in).nextLine();
//		return eto;
//	}
//	

}
