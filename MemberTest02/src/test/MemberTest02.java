package test;

import member.*;

public class MemberTest02 {
	public static void main(String[] args) {
		Member[] members = new Member[] {
			new Member("안정원", "202001", 39),
			new SpecialMember("장겨울", "202002", 30, "30% 할인"),
			new Member("이익준", "202003", 40),
			new SpecialMember("채송화", "202004", 38, "1일 무료"),
			new Member("양석형", "202005", 39),
			new SpecialMember("추민하", "202006", 32, "절반 가격"),
		};
		
		// 출력1
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
