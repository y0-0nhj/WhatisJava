package account;

// 상속을 하는 클래스 - 상위 클래스, 부모 클래스, 기반 클래스, 슈퍼 클래스(super)
// 상속을 받는 클래스 - 하위 클래스, 자식 클래스, 파생 클래스, 서브 클래스(sub)

// TimeAccount 클래스는 Account 클래스를 확장한다.
// TimeAccount 클래스는 Account 클래스로부터 모든 것을 상속 받는다. 
public class TimeAccount extends Account {
	private int timeBalance; // 정기적금금액
	
	// 상속관계에서는 생성자와 초기자는 상속받지 못한다.
	// super() : 자식 클래스에서 부모 클래스의 생성자를 호출하는 유일한 방법
	public TimeAccount(String name, String no, int balance, int timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	// getter
	public int getTimeBalance() { 
		return timeBalance;
	}
	
	// setter
	public void setTimeBalance(int timeBalance) { 
		this.timeBalance = timeBalance;
	}
	
	// 해약
	public void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	// 출력
	// super. : 부모클래스의 메소드 혹은 값을 호출
	// super. : 부모클래스의 멤버에 접근하는 방법
	public void showInfo() {
		super.showInfo();
		System.out.println("정기적금잔고 : " + timeBalance);
		System.out.println();
	}
	
	
	
	
	
	
	
}
