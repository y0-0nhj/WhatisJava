// 은행계좌 클래스 - 계좌명의, 계좌번호, 예금잔고
class Account {
	String name; 
	String no;
	int balance;
	
	// 별표 백만개
	// 생성자(Constructor)
	// 생성자의 특징
	// 1. 클래스의 이름과 같다. 2. 리턴타입이 없다.
	
	// 생성자의 역할
	// 1. 인스턴스를 만들때만 호출된다.
	// 2. 확실한 초기화에 대한 보장을 해준다.
	
	// 생성자 오버로딩
	Account(String n, String num, int b) {
		name = n;
		no = num;
		balance = b;
	}
	
	// 기본 생성자
	Account() {
		
	}
	
}

public class AccountTest03 {
	public static void main(String[] args) {
		// 인스턴스 생성
		// 1. john이라는 참조변수 생성
		// 2. john의 인스턴스 생성
		// 3. 생성자 호출
		Account john = new Account("john", "123456", 1000);
		Account mary = new Account("mary", "654321", 200);
		//Account tom = new Account();
		
		john.balance -= 200;
		
		// 출력
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
