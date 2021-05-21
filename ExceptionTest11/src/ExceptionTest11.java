
class Account {
	private String name;
	private String no;
	private long balance;
	
	public Account(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// 입금 - 문제점 : 마이너스 금액을 입금할수는 없다.
	// 1. 예외처리를 활용하지 않은 경우
//	public void deposit(long money) {
//		if(money < 0) {
//			System.out.println("마이너스 금액을 입금할 수는 없습니다.");
//			return;
//		}
//		this.balance += money;
//		System.out.println(name + "님 계좌에 " + money +"원이 입금되었습니다.");
//	}
	
	// 2. 예외처리 클래스 활용
	public void deposit(long money) throws MinusDepositException {
		if(money < 0) {
			throw new MinusDepositException("마이너스 입금 오류 : " + money + "원은 입금할 수 없습니다.");
		}
		this.balance += money;
		System.out.println(name + "님 계좌에 " + money +"원이 입금되었습니다.");
	}
	
	// 출금 - 문제점 : 예금잔고보다 더 큰 금액을 출금할 수는 없다.
	// 1. 예외처리를 활용하지 않은 경우
//	public void withdraw(long money) {
//		if(this.balance < money) {
//			System.out.println("예금잔고보다 큰 금액을 출금할 수는 없습니다.");
//			return;
//		}
//		this.balance -= money;
//		System.out.println(name + "님 계좌에서 " + money + "원이 출금되었습니다.");
//	}
	
	// 2.예외처리 클래스 활용
	public void withdraw(long money) throws BalanceInsufficientException {
		if(this.balance < money) {
			throw new BalanceInsufficientException("예금잔고 부족 : " + (money-balance) + "원이 부족합니다.");
		}
		this.balance -= money;
		System.out.println(name + "님 계좌에서 " + money + "원이 출금되었습니다.");
	}
	
	// 출력
	public String toString() {
		return "[" + no + "] " + name + " : " + balance + "원";
	}
}

// 입금예외처리 클래스 : 마이너스 금액에 대해서는 입금 불가
class MinusDepositException extends Exception {
	private static final long serialVersionUID = 1L;

	public MinusDepositException(String msg) {
		super(msg);
	}
	
}

// 출금예외처리 클래스 : 예금잔고보다 큰 금액에 대해서는 출금 불가
class BalanceInsufficientException extends Exception {
	private static final long serialVersionUID = 1L;

	public BalanceInsufficientException(String msg) {
		super(msg);
	}
	
}


public class ExceptionTest11 {
	public static void main(String[] args) {
		Account acc1 = new Account("이익준", "123456", 1000);
		System.out.println(acc1);
		
		// 출금
		try {
			acc1.withdraw(1500);
		} catch(BalanceInsufficientException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(acc1);
		
		// 입금
		try {
			acc1.deposit(-500);
		} catch(MinusDepositException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(acc1);
	}

}
