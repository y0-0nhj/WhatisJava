package test;

import member.*;

public class MemberTest02 {
	public static void main(String[] args) {
		Member[] members = new Member[] {
			new Member("������", "202001", 39),
			new SpecialMember("��ܿ�", "202002", 30, "30% ����"),
			new Member("������", "202003", 40),
			new SpecialMember("ä��ȭ", "202004", 38, "1�� ����"),
			new Member("�缮��", "202005", 39),
			new SpecialMember("�߹���", "202006", 32, "���� ����"),
		};
		
		// ���1
		for(int i=0; i<members.length; i++) {
			System.out.println(members[i]);
		}
		System.out.println();
		
		System.out.println("----------");
		for(Member m : members) {
			System.out.println(m);
		}
	}

}
