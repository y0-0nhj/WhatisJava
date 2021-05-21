package test;

import member.*;

public class ExceptionTest10 {
	public static void main(String[] args) {
		Member m = new Member(111111, "이익준");
		SpecialMember sm = new SpecialMember(222222, "김준완", "30% 할인");
		AdditionalMember am = new AdditionalMember(333333, "채송화", 1000);
		
		SpecialMember sm2 = null;
		
		//sm2 = (SpecialMember)am; --> 에러(error)
		//sm2 = (SpecialMember)m; // 다운 캐스팅 --> 예외(exception)
		
		try {
			// 예외 발생 상황 1
			sm2 = (SpecialMember)m; // 다운 캐스팅
		} catch(ClassCastException e) {
			System.err.println("다운 캐스팅으로 멤버에 접근할수는 없습니다.");
		}
		
		try {
			System.out.println(sm2.toString());
		} catch(NullPointerException e) {
			System.err.println("널을 참조할 수는 없습니다.");
		}
	
		System.out.println("--- Part 2 ---");
		System.out.println("회원 처리에 관한 업무를 하고 있습니다.");
		System.out.println(m);
		System.out.println(sm);
		System.out.println(am);
		
	}

}
