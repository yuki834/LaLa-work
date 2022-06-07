package ex14;

public class Account {

	String accountNumber;
	int balance;
	
	public String toString(){
		return "\\" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}
	
//	public boolean equals(Object o) {
//		if(this == o) {
//			return true;
//		}
//		if(o instanceof Account) {
//			Account a = (Account) o;
//			String an1 = this.accountNumber.trim();
//			String an2 = a.accountNumber.trim();
//			if(an1.equals(an2)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	public boolean equals(Account a) {
		
		if(this.accountNumber.trim().equals(a.accountNumber.trim())){
			return true;
		}
		return false;
	}
}
