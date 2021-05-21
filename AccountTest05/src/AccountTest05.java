
// 각 인스턴스 식별번호 생성하여 출력
class Account {
	// 멤버 변수
	// 인스턴스 변수
	private String name; 
	private String no;
	private int balance;
	private int id; // 식별번호(일련번호) : 인스턴스를 만든 순서대로 1, 2, 3 ...
	
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

public class AccountTest05 {
	public static void main(String[] args) {
		Account john = new Account("john", "123456", 1000);
		Account mary = new Account("mary", "654321", 200);
		Account tomy = new Account("tomy", "112233", 3000);
		
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
		System.out.println();
		
		System.out.println("◆ Tomy의 계좌");
		System.out.println("계좌명의 : " + tomy.getName());
		System.out.println("계좌번호 : " + tomy.getNo());
		System.out.println("예금잔고 : " + tomy.getBalance());
		System.out.println();
	}

}
