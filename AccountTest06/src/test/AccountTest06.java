package test;

import account.*;

public class AccountTest06 {
	public static void main(String[] args) {
		Account a1 = new Account("�����", "112233", 3000);
		TimeAccount a2 = new TimeAccount("���켺", "123456", 1000, 50);
		
		a1.showInfo();
		a2.showInfo();
	}

}
