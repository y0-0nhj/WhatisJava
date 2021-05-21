
// 은행계좌 클래스 - 계좌명의, 계좌번호, 예금잔고
// 클래스 생성 - 설계도

// 1. 확실한 초기화의 보장이 되고 있지 않다.
// 2. 아무나 입출금을 하고 있다.
class Account {
	// 멤버 변수
	String name;
	String no;
	int balance;
	
	// 디폴트 생성자(기본 생성자)
	// 1. 클래스를 만들면 무조건 존재한다.
	// 2. 디폴트 생성자는 생략 가능
	// 3. 다른 생성자(매개변수를 가진 생성자)를 만들면 디폴트 생성자는 없어진다.
	Account() {
		
	}
}

public class AccountTest02 {
	public static void main(String[] args) {
		// 클래스 사용
		// 보편적인 관점 - 객체를 생성
		// 자바 - 인스턴스(instance), 실체
		Account john = new Account(); // 인스턴스
		Account mary = new Account();
		
		// . 연산자 - 멤버 접근(access) 연산자
//		john.name = "John"; // 값을 대입, 초기화
//		john.no = "123456";
//		john.balance = 1000;
//		
//		mary.name = "Mary";
//		mary.no = "654321";
//		mary.balance = 200;
		
//		john.balance -= 200; // 출금
//		mary.balance += 100; // 입금
		
		
		System.out.println("◆ John의 계좌");
		System.out.println("계좌명의 : " + john.name);
		System.out.println("계좌번호 : " + john.no);
		System.out.println("예금잔고 : " + john.balance);
		System.out.println();
		
		System.out.println("◆ Mary의 계좌");
		System.out.println("계좌명의 : " + mary.name);
		System.out.println("계좌번호 : " + mary.no);
		System.out.println("예금잔고 : " + mary.balance);
	}

}
