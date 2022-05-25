package ex5;

public class Ex5_4 {
	public static void main(String[] args) {
		System.out.println("面積は" + calcTriangleArea(5,6));
		System.out.println("円の面積は" + calcCircleArea(5));
	}
	
	public static double calcTriangleArea(double x,double y) {
		
		double z = (x * y) / 2;
		return z;
	}
	
	public static double calcCircleArea(double x) {
		
		double z = x * x * 3.14;
		return z;
	}
}
