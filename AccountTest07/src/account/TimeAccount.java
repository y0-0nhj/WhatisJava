package account;

public class TimeAccount extends Account {
	private int timeBalance; // 정기적금금액
	
	// 생성자
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
	
	// 오버라이딩(Overriding)
	// 1. 메소드의 재정의
	// 2. 상속의 관계에서 부모 클래스의 메소드를 자식 클래스에서 재정의하는 것.
	// 3. 주의) 자식 클래스의 메소드는 부모 클래스의 메소드와 완벽하게 일치해야함.
	
	// 출력 1
	// 오버라이딩
	public void showInfo() {
		super.showInfo();
		System.out.println("정기적금잔고 : " + timeBalance);
		System.out.println();
	}
	
	// 출력 2 - toString()
	// 오버라이딩
	public String toString() {
		return super.toString() + ", 정기적금: " + timeBalance;
		//return "계좌명의: " + getName() + ", 번호: " + getNo() + ", 잔고: " + getBalance() + ", 정기적금: " + timeBalance; 
	}
	
}
