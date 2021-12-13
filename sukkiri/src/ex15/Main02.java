package ex15;

public class Main02 {

	public static void main(String[] args) {
		String folder = "c:\\javadev\\";
		String file = "readme.txt";
	
		String str = renketsu(folder, file);
		System.out.println(str);
	}
	
	public static String renketsu(String folder, String filename) {
		String str = null;
		if (folder.endsWith("\\")) {
			str = folder + filename;
		} else {
			str = folder + "\\" + filename;
		}
		
		return str;
		
	}

}
