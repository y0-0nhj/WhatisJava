package test;

//import account.Account;
//import account.TimeAccount;

import account.*;

public class AccountTest07 {
	public static void main(String[] args) {
		Account a1 = new Account("�迬��", "123456", 5000);
		TimeAccount t1 = new TimeAccount("�����", "654321", 7000, 500);
		
		Account a2;
		a2 = a1; // �Ѵ� ���� Ÿ���� Account��, ����
		a2 = t1; // Account���� �������� name, no, balance�� �����ϸ��, ����
		
		TimeAccount t2;
		//t2 = a1; // TimeAccount���� �������� name, no, balance, timeBalance�� �����ؾ���, �Ұ���
		t2 = t1; // �Ѵ� ���� Ÿ���� TimeAccount��, ����
		
		System.out.println(a1.toString());
		System.out.println(a2);
	
	}

}
