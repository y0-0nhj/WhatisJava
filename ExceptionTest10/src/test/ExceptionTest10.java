package test;

import member.*;

public class ExceptionTest10 {
	public static void main(String[] args) {
		Member m = new Member(111111, "������");
		SpecialMember sm = new SpecialMember(222222, "���ؿ�", "30% ����");
		AdditionalMember am = new AdditionalMember(333333, "ä��ȭ", 1000);
		
		SpecialMember sm2 = null;
		
		//sm2 = (SpecialMember)am; --> ����(error)
		//sm2 = (SpecialMember)m; // �ٿ� ĳ���� --> ����(exception)
		
		try {
			// ���� �߻� ��Ȳ 1
			sm2 = (SpecialMember)m; // �ٿ� ĳ����
		} catch(ClassCastException e) {
			System.err.println("�ٿ� ĳ�������� ����� �����Ҽ��� �����ϴ�.");
		}
		
		try {
			System.out.println(sm2.toString());
		} catch(NullPointerException e) {
			System.err.println("���� ������ ���� �����ϴ�.");
		}
	
		System.out.println("--- Part 2 ---");
		System.out.println("ȸ�� ó���� ���� ������ �ϰ� �ֽ��ϴ�.");
		System.out.println(m);
		System.out.println(sm);
		System.out.println(am);
		
	}

}
