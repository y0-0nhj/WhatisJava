package test;

import account.*;

public class AccountTest06 {
	public static void main(String[] args) {
		Account a1 = new Account("김수현", "112233", 3000);
		TimeAccount a2 = new TimeAccount("정우성", "123456", 1000, 50);
		
		a1.showInfo();
		a2.showInfo();
	}

}
