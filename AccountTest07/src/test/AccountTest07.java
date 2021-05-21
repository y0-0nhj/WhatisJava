package test;

//import account.Account;
//import account.TimeAccount;

import account.*;

public class AccountTest07 {
	public static void main(String[] args) {
		Account a1 = new Account("김연아", "123456", 5000);
		TimeAccount t1 = new TimeAccount("손흥민", "654321", 7000, 500);
		
		Account a2;
		a2 = a1; // 둘다 같은 타입인 Account형, 가능
		a2 = t1; // Account형의 참조에는 name, no, balance만 존재하면됨, 가능
		
		TimeAccount t2;
		//t2 = a1; // TimeAccount형의 참조에는 name, no, balance, timeBalance가 존재해야함, 불가능
		t2 = t1; // 둘다 같은 타입인 TimeAccount형, 가능
		
		System.out.println(a1.toString());
		System.out.println(a2);
	
	}

}
