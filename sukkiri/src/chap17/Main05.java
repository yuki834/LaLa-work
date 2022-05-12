package chap17;

public class Main05 {

	public static void main(String[] args) {
		int num = 0;
		
		try {
			num = Util.inputNum();	
		} catch(CannotNumberRuntimeException e) {
			num = 0;
		}
		
		System.out.println("入力された数は " + num + "です");
	}
	
}
