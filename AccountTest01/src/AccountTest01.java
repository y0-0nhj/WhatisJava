// 클래스의 개념을 적용한 예가 아님 -> 클래스의 개념이 필요한 이유를 설명하기 위한 예제
// 은행계좌 클래스
// 은행계좌 - 계좌명의, 계좌번호, 예금잔고

// 문제점1 - 계좌의 정보를 단순히 변수명, 주석을 통해 알수 있다.
// 문제점2 - 한 사람의 계좌라면 하나로 묶어서 처리해야 한다. 지금은 따로 처리되고 있다.
// 문제점3 - 아무나 변수의 이름을 통해 입금, 출금을 할 수 있다.

public class AccountTest01 {
	public static void main(String[] args) {
		// john의 계좌
		String johnAccountName = "John";
		String johnAccountNo = "123456";
		int johnAccountBalance = 1000;
		
		// mary의 계좌
		String maryAccountName = "mary";
		String maryAccountNo = "654321";
		int maryAccountBalance = 500;
		
		// 출금
		johnAccountBalance -= 200;
		// 입금
		maryAccountBalance += 100;
		
		System.out.println("● John의 계좌");
		System.out.println("계좌명의 : " + johnAccountName);
		System.out.println("계좌번호 : " + johnAccountNo);
		System.out.println("예금잔고 : " + johnAccountBalance);
		System.out.println();
		
		System.out.println("● Mary의 계좌");
		System.out.println("계좌명의 : " + maryAccountName);
		System.out.println("계좌번호 : " + maryAccountNo);
		System.out.println("예금잔고 : " + maryAccountBalance);
		
	}

}
