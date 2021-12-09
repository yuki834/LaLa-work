package ex14;

public class Account {
	String accountNumber;
	int balance;
	
	public String toString() {
		return "￥" + balance +
				"(口座番号@" + accountNumber + ")";
	}
	
	public boolean equals(Object o) {
		if (this == o) { return true; }
		if (o instanceof Account) {
			Account a = (Account) o;
			if (this.accountNumber.equals(a.accountNumber)) {
				return true;
			}
		}
		return false;
	}
}
