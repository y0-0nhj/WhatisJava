// 은행계좌 클래스 - 계좌명의, 계좌번호, 예금잔고

// 접근 제한자(한정자) - modifer
// private - 자신의 클래스에서만 사용 가능, 다른 클래스에서는 사용 불가
// public - 어디서나 사용 가능
class Account {
	// 멤버 변수
	// 인스턴스 변수
	private String name; 
	private String no;
	private int balance;
	
	// 기본 생성자
	Account() { }
	
	// 생성자 오버로딩
	Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// setter 메소드
	// 값을 설정하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	// getter 메소드
	// 값을 읽는 메소드
	public String getName() {
		return name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public void withdraw(int money) {
		balance -= money;
	}
	
}

public class AccountTest04 {
	public static void main(String[] args) {
		// 인스턴스 생성
		// 1. john이라는 참조변수 생성
		// 2. john의 인스턴스 생성
		// 3. 생성자 호출
		Account john = new Account("john", "123456", 1000);
		Account mary = new Account("mary", "654321", 200);
		//Account tom = new Account();
		
		//john.balance -= 200;
		john.withdraw(200); // 출금
		mary.deposit(100);  // 입금
		
		
		// 출력
		System.out.println("◆ John의 계좌");
		System.out.println("계좌명의 : " + john.getName());
		System.out.println("계좌번호 : " + john.getNo());
		System.out.println("예금잔고 : " + john.getBalance());
		System.out.println();
		
		System.out.println("◆ Mary의 계좌");
		System.out.println("계좌명의 : " + mary.getName());
		System.out.println("계좌번호 : " + mary.getNo());
		System.out.println("예금잔고 : " + mary.getBalance());
	}

}
